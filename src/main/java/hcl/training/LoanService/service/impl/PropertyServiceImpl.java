package hcl.training.LoanService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hcl.training.LoanService.dao.PropertyDAO;
import hcl.training.LoanService.entity.CustomerPropertyDetailsEntity;
import hcl.training.LoanService.service.PropertyService;

public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	PropertyDAO PropertyDAO;

	@Override
	public CustomerPropertyDetailsEntity getProperty(String propertyType, String propertyLocation) {
		return PropertyDAO.findByPropertyOwnedAndPropertyLocation(propertyType, propertyLocation);
	}
		

}
