package hcl.training.LoanService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.training.LoanService.dto.CustomerDetails;
import hcl.training.LoanService.response.RegisterResponse;
import hcl.training.LoanService.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/register")
	public RegisterResponse registerCustomer(@RequestBody CustomerDetails customerDetails) {
		return customerService.registerCustomer(customerDetails);
	}

}
