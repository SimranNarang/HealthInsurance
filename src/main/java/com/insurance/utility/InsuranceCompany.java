package com.insurance.utility;

public class InsuranceCompany {
	public static void main(String[] args) {
		Customer claim = new Customer();
		CustomerDetails customerDetails =claim.claimingInsurance();
		Surveyor carSurveyor = new CarSurveyor();
		Surveyor healthSurveyor = new HealthSurveyor(); 
		Manager manager = new Manager();
		boolean result =manager.managerRemark(customerDetails,carSurveyor);
		
		System.out.println(result);
	}

}
