package com.anudip.demo;

public class MyException extends Exception {
	/*
	private String message;
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	*/
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}
}
