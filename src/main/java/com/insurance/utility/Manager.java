package com.insurance.utility;

public class Manager implements Employee{
	
	public boolean managerRemark(CustomerDetails customerDetails,Surveyor surveyor) {
		
			//	HealthSurveyor sc = new HealthSurveyor();
		surveyor.validatingDetails(customerDetails);
		/*
		 * will decide and return true or false!!
		 */

		return true;
	}
}
