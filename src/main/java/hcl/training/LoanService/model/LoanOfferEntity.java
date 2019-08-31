package hcl.training.LoanService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ls_loan_offer")
public class LoanOfferEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "loan_offer_id")    
    private Long id;
	
	@Column(name = "loan_offer_amt" )
    private Long amount;
	
	@Column(name = "loan_offer_tenure" )
    private Integer tenure;
	
	@Column(name = "loan_offer_emi")
    private Double emi;
	
	@Column(name = "loan_offer_roi" )
    private Double rateOfInterest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}
}
