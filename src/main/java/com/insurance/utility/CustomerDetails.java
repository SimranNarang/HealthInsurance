package com.insurance.utility;

public class CustomerDetails {
	private String customerName;
	private String customerPanCard;
	private String customerNumber;
	
	public CustomerDetails(String customerName, String customerPanCard, String customerNumber) {
		
		this.customerName = customerName;
		this.customerPanCard = customerPanCard;
		this.customerNumber = customerNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerPanCard() {
		return customerPanCard;
	}
	
	public void setCustomerPanCard(String customerPanCard) {
		this.customerPanCard = customerPanCard;
	}
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", customerPanCard=" + customerPanCard
				+ ", customerNumber=" + customerNumber + "]";
	}

}
