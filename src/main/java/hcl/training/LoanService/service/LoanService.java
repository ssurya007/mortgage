package hcl.training.LoanService.service;

import org.springframework.stereotype.Service;

import hcl.training.LoanService.response.SearchResponse;

@Service
public interface LoanService {
	public SearchResponse applyLoan(Long userId, Long loanId);
}
