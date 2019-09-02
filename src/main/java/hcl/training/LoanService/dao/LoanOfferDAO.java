package hcl.training.LoanService.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.training.LoanService.entity.LoanOfferEntity;

@Repository
public interface LoanOfferDAO extends JpaRepository<LoanOfferEntity, Long> {
	public Set<LoanOfferEntity> findAllByAmountLessThanAndEmiLessThan(Double amount, Double emi);
}
