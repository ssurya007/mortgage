package hcl.training.LoanService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.training.LoanService.dto.CustomerPropertyDetails;
import hcl.training.LoanService.model.CustomerPropertyDetailsEntity;

@Repository
public interface PropertyDAO extends JpaRepository<CustomerPropertyDetailsEntity, Long>{
	CustomerPropertyDetailsEntity findByPropertyOwnedAndPropertyLocation(String propertyOwned, String propertyLocation);

}
