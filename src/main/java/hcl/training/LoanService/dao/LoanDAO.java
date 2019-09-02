package hcl.training.LoanService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hcl.training.LoanService.entity.ApprovedLoanEntity;

public interface LoanDAO extends JpaRepository<ApprovedLoanEntity, Long> {

}
