package hcl.training.LoanService.service;

import hcl.training.LoanService.response.SearchResponse;

public interface SearchService {
	public SearchResponse searchByMobile(String mobileNo);
}
