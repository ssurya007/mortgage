package hcl.training.LoanService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.training.LoanService.entity.CustomerDetailsEntity;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerDetailsEntity, Long>{

	public CustomerDetailsEntity findByMobileNumber(String mobileNumber);
}
