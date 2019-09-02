package hcl.training.LoanService.exception;

import javax.persistence.EntityNotFoundException;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler({ConstraintViolationException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST , reason = "Constraint violation excption")
	public void handleException(ConstraintViolationException e) {
		logger.error("Constraint violation excption");
		logger.error(e.getMessage());
	}
	
	@ExceptionHandler({EntityNotFoundException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "entity not found")
	public void handleEnityNotFoundException (Exception e) {
		
	}
}
