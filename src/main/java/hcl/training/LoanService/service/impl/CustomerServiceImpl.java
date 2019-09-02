package hcl.training.LoanService.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.hibernate.annotations.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jdk8.OptionalDoubleSerializer;

import hcl.training.LoanService.converter.CustomerDataConvertor;
import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dao.LoanOfferDAO;
import hcl.training.LoanService.dao.PropertyDAO;
import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.entity.CustomerPropertyDetailsEntity;
import hcl.training.LoanService.entity.LoanOfferEntity;
import hcl.training.LoanService.response.RegisterResponse;
import hcl.training.LoanService.service.CustomerService;
import hcl.training.LoanService.utils.CustomerUtil;

@Service
public class CustomerServiceImpl implements CustomerService {
	
//	@Autowired
//	DozerBeanMapper mapper;
	

	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	PropertyDAO propertyDAO;
	
	@Autowired
	LoanOfferDAO loanOfferDAO;
	
	@Autowired
	Validator validator;
	
	public static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Override
	public RegisterResponse registerCustomer(CustomerDetails customerDetails) {
		Set<ConstraintViolation<CustomerDetails>> violations = validator.validate(customerDetails);
		RegisterResponse registerResponse = new RegisterResponse();
		if(CollectionUtils.isNotEmpty(violations)) {
			registerResponse.setErrorString(violations.toString());
			logger.warn("constraint violation");
			return registerResponse;
		}
		
		if(!CustomerUtil.isAgeValid(customerDetails.getDateOfBirth())) {
			logger.warn("age violation");
			registerResponse.setErrorString("Age Violation");
			return registerResponse;
		}
		
		/***for one to many mapping and dozer
		 * 
		 * logger.info("Converting dto to entity"); 
		 *
		 * CustomerDetailsEntity
		 * customerDetailsEntity = mapper.map(customerDetails,
		 * hcl.training.LoanService.model.CustomerDetailsEntity.class);
		 * CustomerPropertyDetailsEntity propertyDetailsEntity =
		 * propertyDAO.findByPropertyOwnedAndPropertyLocation(customerDetailsEntity.
		 * getCustomerPropertyDetailsEntity().getPropertyOwned(),
		 * customerDetailsEntity.getCustomerPropertyDetailsEntity().getPropertyLocation(
		 * )); if(null != propertyDetailsEntity) {
		 * customerDetailsEntity.setCustomerPropertyDetailsEntity(propertyDetailsEntity)
		 * ; }
		 */
		CustomerDetailsEntity customerDetailsEntity = CustomerDataConvertor.getCustomerDetailsEntity(customerDetails);
		customerDAO.save(customerDetailsEntity);
		logger.info("Customer Details Saved, getting offers eligible for");
		Set<LoanOfferEntity> eligibleOffers = loanOfferDAO.findAllByAmountLessThanAndEmiLessThan(CustomerUtil.getEligibleLoanAmount(customerDetails.getPropertyValue()),
				customerDetails.getMonthlyIncome());
		Set<LoanOffer> offersDto = new HashSet<LoanOffer>();
		if(CollectionUtils.isNotEmpty(eligibleOffers)) {
			eligibleOffers.forEach(offer ->{
				LoanOffer loanOffer = new LoanOffer();
			try {
				org.apache.commons.beanutils.BeanUtils.copyProperties(loanOffer, offer);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error("Error in Bean Conversion");
			}
			offersDto.add(loanOffer);
			});
		}
		registerResponse.setLoanoffers(offersDto);
		return registerResponse;
		
	}

	@Override
	public Set<LoanOffer> getEligibleLoans(Double eligibleAmount, Double salary) {
		
		return null;
	}

}
