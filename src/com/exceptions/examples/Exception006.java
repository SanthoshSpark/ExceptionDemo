/*
 * 
 * The finally block always executes immediately after try-catch 
 * block exits.
 * 
 * The finally block is executed in case even if an unexpected exception 
 * occurs.
 * 
 * The main usage of finally block is to do clean up job. 
 * 
 * Keeping cleanup code in a finally block is always a good practice, 
 * even when no exceptions are occured.
 * 
 * The runtime system always executes the code within the finally block 
 * regardless of what happens in the try block. 
 * 
 * So it is the ideal place to keep cleanup code.
 * 
 * 
 */
package com.exceptions.examples;

public class Exception006 {
	 public static void main(String[] a){
	        
	        try{
	            int i = 10/0;
	            System.out.println(i);
	        } catch(Exception ex){
	            System.out.println("Inside 1st catch Block");
	        } finally {
	            System.out.println("Inside 1st finally block");
	        }
	        
	        try{
	            int i = 10/10;
	            System.out.println(i);
	        } catch(Exception ex){
	            System.out.println("Inside 2nd catch Block");
	        } finally {
	            System.out.println("Inside 2nd finally block");
	        }
	    }

}
