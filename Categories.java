package com.springframework.autowiring.constructor.beanfactory;

//Auto-Wiring (Constructor)
//Constructor Based Injection

public class Categories {

	// Declare

	private String name;
	private Policy policy; // Secondary DataType

	// Create Parameterized Constructor

	public Categories(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}

	// Create Method

	public void show() {

		System.out.println("Categories Name > " + name);
		System.out.println("Policy Name > " + policy.getPlanName());
		System.out.println("Policy Amount > " + policy.getPlanAmount());

	}

}
