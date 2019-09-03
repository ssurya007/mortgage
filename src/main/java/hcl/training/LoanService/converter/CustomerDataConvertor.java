package hcl.training.LoanService.converter;

import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.entity.CustomerPropertyDetailsEntity;


public class CustomerDataConvertor {
	private CustomerDataConvertor() {
		/**
		 * to hide implicit constructor
		 */
	}
	public static CustomerDetailsEntity getCustomerDetailsEntity(CustomerDetails customerDetails) {
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
		customerPropertyDetailsEntity.setPropertyValue(customerDetails.getPropertyValue());
		entity.setCustomerPropertyDetailsEntity(customerPropertyDetailsEntity);
		
		return entity;
	
	}
	
	public static CustomerDetails getCustomerDetails(CustomerDetailsEntity customerDetailsEntity) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setDateOfBirth(customerDetailsEntity.getDateOfBirth());
		customerDetails.setEmailId(customerDetailsEntity.getEmailId());
		customerDetails.setFullName(customerDetailsEntity.getFullName());
		customerDetails.setGender(customerDetailsEntity.getGender());
		customerDetails.setMobileNumber(customerDetailsEntity.getMobileNumber());
		customerDetails.setMonthlyIncome(customerDetailsEntity.getMonthlyIncome());
		customerDetails.setPanCardNumber(customerDetailsEntity.getPanCardNumber());
		
		CustomerPropertyDetailsEntity customerPropertyDetailsEntity = customerDetailsEntity.getCustomerPropertyDetailsEntity();
		customerDetails.setPropertyLocation(customerPropertyDetailsEntity.getPropertyLocation());
		customerDetails.setPropertyOwned(customerPropertyDetailsEntity.getPropertyOwned());
		customerDetails.setPropertyValue(customerPropertyDetailsEntity.getPropertyValue());
		
		return customerDetails;
	
	}

}
