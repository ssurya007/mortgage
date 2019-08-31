package hcl.training.LoanService.dto;

public class CustomerPropertyDetails {

	String propertyOwned;

	String propertyLocation;
	
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

}
