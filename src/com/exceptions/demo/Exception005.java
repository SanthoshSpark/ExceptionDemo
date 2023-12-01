package com.exceptions.demo;

public class Exception005 {

	public static void main(String[] args) {
		try {
			int n = 100;
			int v = n/50;
			
			System.out.println(v);
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("This will execute always");
		}

	}

}
