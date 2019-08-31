package hcl.training.LoanService.controller;

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
import hcl.training.LoanService.model.CustomerDetailsEntity;
import hcl.training.LoanService.model.UpdateStatus;
import hcl.training.LoanService.service.CustomerService;
import hcl.training.LoanService.service.CustomerServiceImpl;

@RestController("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	public static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@PostMapping("/register")
	public ResponseEntity<UpdateStatus> registerCustomer(@RequestBody CustomerDetailsEntity customerDetails) {
		Optional<Set<ConstraintViolation<CustomerDetailsEntity>>> registerReponse = customerService.registerCustomer(customerDetails);
		UpdateStatus status = new UpdateStatus();
		status.setStatus("success");
		ResponseEntity<UpdateStatus> responseEntity = new ResponseEntity<UpdateStatus> (status, HttpStatus.OK);
		if(registerReponse.isPresent()) {
			status.setStatus(registerReponse.get().toString());
		}
		return responseEntity;
	}

}
