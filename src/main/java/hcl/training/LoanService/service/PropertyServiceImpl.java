package hcl.training.LoanService.service;

import org.springframework.beans.factory.annotation.Autowired;

import hcl.training.LoanService.dao.PropertyDAO;
import hcl.training.LoanService.model.CustomerPropertyDetailsEntity;

public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	PropertyDAO PropertyDAO;

	@Override
	public CustomerPropertyDetailsEntity getProperty(String propertyType, String propertyLocation) {
		return PropertyDAO.findByPropertyOwnedAndPropertyLocation(propertyType, propertyLocation);
	}
		

}
