package com.exceptions.demo;

public class Exception001 {
	public static void main(String[] args) {
		
		try {
			int n=100/0;
		}
		catch(ArithmeticException ex) {
			//System.out.println(ex.getMessage());
			//System.out.println("Divide by Zero is not possible by the computer");
			ex.printStackTrace();
		}
		
		System.out.println("Welcome to CMS");
	}

}
