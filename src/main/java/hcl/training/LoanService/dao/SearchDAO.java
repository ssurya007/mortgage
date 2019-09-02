package hcl.training.LoanService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.training.LoanService.entity.ApprovedLoanEntity;
import hcl.training.LoanService.entity.CustomerDetailsEntity;

@Repository
public interface SearchDAO extends JpaRepository<ApprovedLoanEntity, Long>{
	public ApprovedLoanEntity findByCustomer(CustomerDetailsEntity customerDetailsEntity);

}
