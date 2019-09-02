package hcl.training.LoanService.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LS_cust_property_details")
public class CustomerPropertyDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "property_id")
	Long propertyId;
	@Column(name = "property_owned")
	String propertyOwned;
	@Column(name = "property_location")
	String propertyLocation;
	@Column(name = "property_value")
	Double propertyValue;
	
	@OneToOne(mappedBy = "customerPropertyDetailsEntity", cascade=CascadeType.ALL)
	CustomerDetailsEntity customerDetailsEntity;
	
	public CustomerDetailsEntity getCustomerDetailsEntity() {
		return customerDetailsEntity;
	}
	public void setCustomerDetailsEntity(CustomerDetailsEntity customerDetailsEntity) {
		this.customerDetailsEntity = customerDetailsEntity;
	}
	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public String getPropertyOwned() {
		return propertyOwned;
	}
	public void setPropertyOwned(String propertyOwned) {
		this.propertyOwned = propertyOwned;
	}

	public Double getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(Double propertyValue) {
		this.propertyValue = propertyValue;
	}

}
