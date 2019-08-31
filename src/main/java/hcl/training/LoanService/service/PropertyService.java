package hcl.training.LoanService.service;

import hcl.training.LoanService.model.CustomerPropertyDetailsEntity;

public interface PropertyService {
	CustomerPropertyDetailsEntity getProperty(String propertyType, String propertyLocation);

}
