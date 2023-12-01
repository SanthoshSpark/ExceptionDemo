package com.anudip.demo;

public class Exception006 {

	public static void main(String[] args) {
		try {
			throw new MyException("Exception happened.");
		}
		catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
