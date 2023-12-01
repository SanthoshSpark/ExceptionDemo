package com.exceptions.examples;

public class Exception014 {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerService();
		
		try {
			Customer cust = service.findByName("");
			System.out.println(cust.getName());
		}
		catch(NameNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
