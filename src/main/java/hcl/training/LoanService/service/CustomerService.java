package hcl.training.LoanService.service;

import java.util.Set;

import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.response.RegisterResponse;

public interface CustomerService {
	public RegisterResponse registerCustomer(CustomerDetails customerDetails);
	
	public Set<LoanOffer> getEligibleLoans(Double eligibleAmount, Double salary);

}
