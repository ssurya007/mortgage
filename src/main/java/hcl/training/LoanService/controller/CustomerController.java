package hcl.training.LoanService.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.dto.LoanOffer;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.entity.LoanOfferEntity;
import hcl.training.LoanService.entity.UpdateStatus;
import hcl.training.LoanService.response.RegisterResponse;
import hcl.training.LoanService.service.CustomerService;
import hcl.training.LoanService.service.impl.CustomerServiceImpl;

@RestController("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	public static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@PostMapping("/register")
	public RegisterResponse registerCustomer(@RequestBody CustomerDetails customerDetails) {
		return customerService.registerCustomer(customerDetails);
	}

}
