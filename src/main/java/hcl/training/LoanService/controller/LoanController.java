package hcl.training.LoanService.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hcl.training.LoanService.response.SearchResponse;
import hcl.training.LoanService.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@PostMapping ("/apply")
	public SearchResponse applyLoan(@RequestParam Long userId, @RequestParam Long loanId) {
		return loanService.applyLoan(userId, loanId);
		
	}

}
