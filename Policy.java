package com.springframework.autowiring.constructor.beanfactory;

//Auto-Wiring (Constructor)
//Constructor Based Injection

public class Policy {

	// Declare

	private String planName;
	private String planAmount;

	// Create Parameterized Constructor

	public Policy(String planName, String planAmount) {
		super();
		this.planName = planName;
		this.planAmount = planAmount;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	}

}
