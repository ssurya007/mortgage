package hcl.training.LoanService.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.training.LoanService.converter.ApprovedLoanConvertor;
import hcl.training.LoanService.dao.CustomerDAO;
import hcl.training.LoanService.dao.LoanDAO;
import hcl.training.LoanService.dao.LoanOfferDAO;
import hcl.training.LoanService.entity.ApprovedLoanEntity;
import hcl.training.LoanService.entity.CustomerDetailsEntity;
import hcl.training.LoanService.entity.LoanOfferEntity;
import hcl.training.LoanService.response.SearchResponse;
import hcl.training.LoanService.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDAO loanDAO;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	LoanOfferDAO loanOfferDAO;
	
	public static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Override
	public SearchResponse applyLoan(Long userId, Long loanId) {
		SearchResponse searchResponse = new SearchResponse();
		CustomerDetailsEntity customerDetailsEntity = customerDAO.getOne(userId);
		LoanOfferEntity loanOfferEntity = loanOfferDAO.getOne(loanId);
		ApprovedLoanEntity approvedLoanEntity = new ApprovedLoanEntity();
		approvedLoanEntity.setCustomer(customerDetailsEntity);
		approvedLoanEntity.setLoanOfferEntity(loanOfferEntity);
		logger.info("tagging loan to customer for approval");
		approvedLoanEntity = loanDAO.save(approvedLoanEntity);
		searchResponse.setApprovedLoan(ApprovedLoanConvertor.getApprovedLoanFromEntity(approvedLoanEntity));
		searchResponse.setMessage("selected loan was successfully tagged");
		return searchResponse;

	}

}
