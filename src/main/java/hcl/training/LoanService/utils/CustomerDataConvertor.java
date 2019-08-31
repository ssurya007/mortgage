package hcl.training.LoanService.utils;

import org.springframework.stereotype.Component;

import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.model.CustomerDetailsEntity;
import hcl.training.LoanService.model.CustomerPropertyDetailsEntity;


public class CustomerDataConvertor {
	public static CustomerDetailsEntity getCustomerDetails(CustomerDetails customerDetails) {
		CustomerDetailsEntity entity = new CustomerDetailsEntity();
		entity.setDateOfBirth(customerDetails.getDateOfBirth());
		entity.setEmailId(customerDetails.getEmailId());
		entity.setFullName(customerDetails.getFullName());
		entity.setGender(customerDetails.getGender());
		entity.setMobileNumber(customerDetails.getMobileNumber());
		entity.setMonthlyIncome(customerDetails.getMonthlyIncome());
		entity.setPanCardNumber(customerDetails.getPanCardNumber());
		
		CustomerPropertyDetailsEntity customerPropertyDetailsEntity = new CustomerPropertyDetailsEntity();
		customerPropertyDetailsEntity.setPropertyLocation(customerDetails.getPropertyLocation());
		customerPropertyDetailsEntity.setPropertyOwned(customerDetails.getPropertyOwned());
		entity.setCustomerPropertyDetailsEntity(customerPropertyDetailsEntity);
		
		return entity;
	
	}

}
