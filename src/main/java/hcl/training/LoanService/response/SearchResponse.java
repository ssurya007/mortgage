package hcl.training.LoanService.response;

import hcl.training.LoanService.dto.ApprovedLoan;

public class SearchResponse {
	ApprovedLoan approvedLoan;
	String message;
	public ApprovedLoan getApprovedLoan() {
		return approvedLoan;
	}
	public void setApprovedLoan(ApprovedLoan approvedLoan) {
		this.approvedLoan = approvedLoan;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
