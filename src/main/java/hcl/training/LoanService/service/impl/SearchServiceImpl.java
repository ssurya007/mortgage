package hcl.training.LoanService.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.training.LoanService.converter.ApprovedLoanConvertor;
import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dao.SearchDAO;
import hcl.training.LoanService.dto.ApprovedLoan;
import hcl.training.LoanService.entity.ApprovedLoanEntity;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.response.SearchResponse;
import hcl.training.LoanService.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchDAO searchDao;
	
	@Autowired
	CustomerDAO customerDao;
	
	public static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Override
	public SearchResponse searchByMobile(String mobileNo) {
		ApprovedLoan approvedLoan = null;
		SearchResponse searchResponse = new SearchResponse();
		logger.info("fetching customer details");
		CustomerDetailsEntity customerDetailsEntity = customerDao.findByMobileNumber(mobileNo);
		if (null != customerDetailsEntity) {
			ApprovedLoanEntity approvedLoanEntity = searchDao.findByCustomer(customerDetailsEntity);
			if (null != approvedLoanEntity) {
				searchResponse.setApprovedLoan(ApprovedLoanConvertor.getApprovedLoanFromEntity(approvedLoanEntity));
				return searchResponse;
			}
		} else {
			logger.info("There is no Customer with with given mobile number");
			searchResponse.setMessage("There is no Customer with given mobile number");
			return searchResponse;
		}
		
		logger.info("There is no approved loan for selected customer");
		searchResponse.setMessage("There is no approved loan for selected customer");
		return searchResponse;
	}

}
