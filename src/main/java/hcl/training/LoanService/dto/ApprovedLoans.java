package hcl.training.LoanService.dto;

import java.util.List;


public class ApprovedLoans {
	
	private Long customerId;
	private String customerName;
	private String customerPhone;
	private String customerEmail;
	private List<LoanOffer> availableLoans;
	public List<LoanOffer> getAvailableLoans() {
		return availableLoans;
	}
	public void setAvailableLoans(List<LoanOffer> availableLoans) {
		this.availableLoans = availableLoans;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
