package hcl.training.LoanService.config;

import java.util.Arrays;

import javax.validation.Validation;
import javax.validation.Validator;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
//	@Bean
//	public DozerBeanMapper dozerBeanMapper() {
//		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
//		dozerBeanMapper.setMappingFiles(Arrays.asList("customer-mapper.xml"));
//		return dozerBeanMapper;
//	}
	
	@Bean
	public Validator getValidator() {
		return Validation.buildDefaultValidatorFactory().getValidator();
	}

}
