/*
 * 
 * If you are creating your own Exception that is known as custom exception or 
 * user-defined exception. 
 * 
 * Java custom exceptions are used to customize the exception according to user need.
 * 
 * By the help of custom exception, you can have your own exception and message.
 * 
 */
package com.exceptions.examples;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
