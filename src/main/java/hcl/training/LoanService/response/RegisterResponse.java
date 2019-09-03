package hcl.training.LoanService.response;

import java.util.Set;

import hcl.training.LoanService.dto.LoanOffer;

public class RegisterResponse {
	
	String errorString;
	Set<LoanOffer> loanoffers;
	
	public String getErrorString() {
		return errorString;
	}
	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}

	public Set<LoanOffer> getLoanoffers() {
		return loanoffers;
	}
	public void setLoanoffers(Set<LoanOffer> loanoffers) {
		this.loanoffers = loanoffers;
	}
	
}
