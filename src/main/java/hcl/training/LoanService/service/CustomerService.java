package hcl.training.LoanService.service;

import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.response.RegisterResponse;

public interface CustomerService {
	public RegisterResponse registerCustomer(CustomerDetails customerDetails);
	
	public Set<LoanOffer> getEligibleLoans(Double eligibleAmount, Double salary);

}
