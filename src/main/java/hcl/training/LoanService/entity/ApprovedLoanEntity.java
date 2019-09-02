package hcl.training.LoanService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ls_approved_loan")
public class ApprovedLoanEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cust_loan_id")    
    private Long custLoanId;
	
	@OneToOne( optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerDetailsEntity customer;
	
	@ManyToOne( optional = false)
    @JoinColumn(name = "loan_offer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
    private LoanOfferEntity loanOfferEntity;

	public LoanOfferEntity getLoanOfferEntity() {
		return loanOfferEntity;
	}

	public void setLoanOfferEntity(LoanOfferEntity loanOfferEntity) {
		this.loanOfferEntity = loanOfferEntity;
	}

	public Long getCustLoanId() {
		return custLoanId;
	}

	public void setCustLoanId(Long custLoanId) {
		this.custLoanId = custLoanId;
	}

	public CustomerDetailsEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetailsEntity customer) {
		this.customer = customer;
	}
	

}
