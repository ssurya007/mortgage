package hcl.training.LoanService.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CustomerDetails {
	@NotNull(message = "fullName cannot be null")
	String fullName;

	@NotNull(message = "date of bith cannot be null")
	LocalDate dateOfBirth;

	String gender;

	@NotNull(message = "monthlyIncome cannot be null")
	@Min(value = 10000, message = "Monthly Income should be grater than zero")
	Double monthlyIncome;

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	@NotNull(message = "mobileNumber cannot be null")
	String mobileNumber;

	@NotNull(message = "emailId cannot be null")
	String emailId;

	@NotNull(message = "panCardNumber cannot be null")
	String panCardNumber;

//	CustomerPropertyDetails customerPropertyDetails;

	
	 String propertyOwned;
	 String propertyLocation;
	  
	 public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

	 
	public String getPropertyOwned() {
		return propertyOwned;
	}

	public void setPropertyOwned(String propertyOwned) {
		this.propertyOwned = propertyOwned;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

//	public CustomerPropertyDetails getCustomerPropertyDetails() {
//		return customerPropertyDetails;
//	}
//
//	public void setCustomerPropertyDetails(CustomerPropertyDetails customerPropertyDetails) {
//		this.customerPropertyDetails = customerPropertyDetails;
//	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

}
