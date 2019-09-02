package hcl.training.LoanService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.training.LoanService.dto.ApprovedLoan;
import hcl.training.LoanService.response.SearchResponse;
import hcl.training.LoanService.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	SearchService searchService;

	@GetMapping("/byMobile/{mobileNo}")
	public SearchResponse getApprovedLoan(@PathVariable String mobileNo) {
		return searchService.searchByMobile(mobileNo);
	}
	
}
