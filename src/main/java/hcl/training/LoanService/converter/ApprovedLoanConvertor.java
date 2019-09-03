package hcl.training.LoanService.converter;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hcl.training.LoanService.dto.ApprovedLoan;
import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.entity.ApprovedLoanEntity;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.entity.LoanOfferEntity;

public class ApprovedLoanConvertor {
	
	private ApprovedLoanConvertor() {
		/**
		 * to hide implicit constructor
		 */
	}
	public static final Logger logger = LoggerFactory.getLogger(ApprovedLoanConvertor.class);
	
	public static ApprovedLoan getApprovedLoanFromEntity(ApprovedLoanEntity approvedLoanEntity) {
		ApprovedLoan approvedLoan = new ApprovedLoan();
		CustomerDetailsEntity customerDetailsEntity = approvedLoanEntity.getCustomer();
		LoanOfferEntity loanOfferEntity = approvedLoanEntity.getLoanOfferEntity();
		CustomerDetails customerDetails = CustomerDataConvertor.getCustomerDetails(customerDetailsEntity);
		LoanOffer loanOffer = new LoanOffer();
		try {
			BeanUtils.copyProperties(loanOffer, loanOfferEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		
		approvedLoan.setCustomerDetails(customerDetails);
		approvedLoan.setLoanOffer(loanOffer);
		return approvedLoan;
		
	}

}
