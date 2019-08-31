package hcl.training.LoanService.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
	
	@Entity
	@Table (name = "LS_customer_details")
	public class CustomerDetailsEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "customer_id")
		Long customerId;
		
		@Column(name = "full_name")
		String fullName;
		
		@Column(name = "date_of_birth")
		LocalDate dateOfBirth;
		
		@Column(name = "gender")
		String gender;
		
		@Column(name = "monthly_income", nullable = false)
		Double monthlyIncome;
		
		public void setMonthlyIncome(Double monthlyIncome) {
			this.monthlyIncome = monthlyIncome;
		}
		
		@Column(name = "mobile_number", unique = true, nullable = false)
		String mobileNumber;
		
		@Column(name = "email_id", unique = true, nullable = false)
		String emailId;
		
		@Column(name = "pancard_number", unique = true, nullable = false)
		String panCardNumber;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="property_id")
		CustomerPropertyDetailsEntity customerPropertyDetailsEntity;
		
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public CustomerPropertyDetailsEntity getCustomerPropertyDetailsEntity() {
			return customerPropertyDetailsEntity;
		}
		public void setCustomerPropertyDetailsEntity(CustomerPropertyDetailsEntity customerPropertyDetailsEntity) {
			this.customerPropertyDetailsEntity = customerPropertyDetailsEntity;
		}
		public Long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}
		
		
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
