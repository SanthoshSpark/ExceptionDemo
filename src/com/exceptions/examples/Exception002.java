/*
 * Exceptions can be handled by using 'try-catch' block. 
 * 
 * Try block contains the code which is under observation for exceptions. 
 * 
 * The catch block contains the remedy for the exception. 
 * 
 * If any exception occurs in the try block then the control jumps to 
 * catch block.
 */

package com.exceptions.examples;

public class Exception002 {
	public static void main(String[] args) {
		 try{
	            for(int i=5;i>=0;i--){
	                System.out.println(10/i);
	            }
	     } 
		 catch(ArithmeticException ex){
	            //System.out.println("Exception Message: " + ex.getMessage());
	            ex.printStackTrace();
	     }
	        
		 System.out.println("After for loop...");
	}

}
