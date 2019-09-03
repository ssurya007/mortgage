package hcl.training.LoanService.config;

import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class DozerConfig {
	/*
	 * @Bean public DozerBeanMapper dozerBeanMapper() { DozerBeanMapper
	 * dozerBeanMapper = new DozerBeanMapper();
	 * dozerBeanMapper.setMappingFiles(Arrays.asList("customer-mapper.xml")); return
	 * dozerBeanMapper; }
	 */
	
	@Bean
	public Validator getValidator() {
		return Validation.buildDefaultValidatorFactory().getValidator();
	}
	
	@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource
	      = new ReloadableResourceBundleMessageSource();
	     
	    messageSource.setBasename("classpath:messages");
	    messageSource.setDefaultEncoding("UTF-8");
	    return messageSource;
	}

}
