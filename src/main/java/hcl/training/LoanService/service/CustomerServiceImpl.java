package hcl.training.LoanService.service;

import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.hibernate.annotations.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jdk8.OptionalDoubleSerializer;

import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dao.LoanOfferDAO;
import hcl.training.LoanService.dao.PropertyDAO;
import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.model.CustomerDetailsEntity;
import hcl.training.LoanService.model.CustomerPropertyDetailsEntity;
import hcl.training.LoanService.utils.CustomerDataConvertor;
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
	public Optional<Set<ConstraintViolation<CustomerDetails>>> registerCustomer(CustomerDetails customerDetails) {
		Set<ConstraintViolation<CustomerDetails>> violations = validator.validate(customerDetails);
		if(CollectionUtils.isNotEmpty(violations)) {
			return Optional.of(violations);
		}
		CustomerDetailsEntity customerDetailsEntity = CustomerDataConvertor.getCustomerDetails(customerDetails);
//		logger.info("Converting dto to entity");
//		CustomerDetailsEntity customerDetailsEntity = mapper.map(customerDetails, hcl.training.LoanService.model.CustomerDetailsEntity.class);
//		CustomerPropertyDetailsEntity propertyDetailsEntity = propertyDAO.findByPropertyOwnedAndPropertyLocation(customerDetailsEntity.getCustomerPropertyDetailsEntity().getPropertyOwned(), 
//				customerDetailsEntity.getCustomerPropertyDetailsEntity().getPropertyLocation());
//		if(null != propertyDetailsEntity) {
//			customerDetailsEntity.setCustomerPropertyDetailsEntity(propertyDetailsEntity);
//		}
		if(CustomerUtil.isAgeValid(customerDetails.getDateOfBirth())){
			customerDAO.save(customerDetailsEntity);
		}
//		else {
//			return Optional<Set<ConstraintViolation<CustomerDetails>>>.of
//		}
		
		return Optional.empty();
	}

	@Override
	public Set<LoanOffer> getEligibleLoans(Double eligibleAmount, Double salary) {
		
		return null;
	}

}
