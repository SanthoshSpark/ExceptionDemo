/*
 * 
 * You can handle exceptions still without having catch blocks also, 
 * only thing you need to do is declare the throws clause in your 
 * method signature, so that the calling function would handle 
 * the exception. 
 * 
 * Before throwing exception, it executes the finally block.
 */
package com.exceptions.examples;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception007 {
	 public static void main(String a[]) {
		 
		 Exception007 ex7 = new Exception007();
		 
		 try {
			 ex7.open();
		 }
		 catch(MalformedURLException ex) {
			 //ex.printStackTrace();
			 System.out.println("Error Message: " + ex.getMessage());
		 }      
	    }
	 
	 public void open()  throws MalformedURLException {
		 try{
	            URL url = new URL("htt://www.google.com");
	            System.out.println(url);
	       } 
	       /*catch(MalformedURLException ex) {
	        	System.out.println(ex.getMessage());
	       }*/
	      finally{
	            System.out.println("In finally block");
	       }
	 }

}
