package hcl.training.LoanService.utils;

import java.time.LocalDate;
import java.time.Period;


public class CustomerUtil {
	public static int getAge(LocalDate dateOfBirth) {
		return Period.between(LocalDate.now(), dateOfBirth).getYears();
	}

}