package hcl.training.LoanService.response;

import java.util.HashMap;
import java.util.Set;

import javax.validation.ConstraintViolation;

import hcl.training.LoanService.dto.CustomerDetails;
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
