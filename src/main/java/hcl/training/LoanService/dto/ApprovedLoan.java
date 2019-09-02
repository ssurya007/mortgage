package hcl.training.LoanService.dto;


public class ApprovedLoan {
	
	private CustomerDetails customerDetails;
	
	private LoanOffer loanOffer;
	
	public LoanOffer getLoanOffer() {
		return loanOffer;
	}
	public void setLoanOffer(LoanOffer loanOffer) {
		this.loanOffer = loanOffer;
	}
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
		
}
