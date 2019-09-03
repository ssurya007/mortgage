package hcl.training.LoanService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.training.LoanService.entity.CustomerPropertyDetailsEntity;

@Repository
public interface PropertyDAO extends JpaRepository<CustomerPropertyDetailsEntity, Long>{
	CustomerPropertyDetailsEntity findByPropertyOwnedAndPropertyLocation(String propertyOwned, String propertyLocation);

}
