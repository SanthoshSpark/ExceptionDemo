package com.exceptions.examples;

public class CustomerService {
	
	public Customer findByName(String name) throws NameNotFoundException {
		// use jdbc to find the name is there in DB or not
		
		if("".equals(name)) {
			throw new NameNotFoundException("Name is not there in DB.");
		}
		
		return new Customer(name);
	}
}
