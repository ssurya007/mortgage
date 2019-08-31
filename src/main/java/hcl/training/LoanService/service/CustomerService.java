package hcl.training.LoanService.service;

import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.model.CustomerDetailsEntity;

public interface CustomerService {
	public Optional<Set<ConstraintViolation<CustomerDetails>>> registerCustomer(CustomerDetails customerDetails);
	
	public Set<LoanOffer> getEligibleLoans(Double eligibleAmount, Double salary);

}
