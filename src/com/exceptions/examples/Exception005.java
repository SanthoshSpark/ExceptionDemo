/*
 * 
 * A single try block can have multiple catch blocks. 
 * 
 * This is required when the try block has statements that generates different 
 * types of exceptions.
 * 
 * If the first catch block contains the Exception class object then the 
 * subsequent catch blocks are never executed.
 * 
 * The last catch block in multiple catch blocks may contain the Exception 
 * class object. 
 * 
 * This is because, the java complier gives an error saying that the 
 * subsequent catch blocks haven't been reached. 
 * 
 * This is known as Unreachable code problem.
 * 
 */
package com.exceptions.examples;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception005 {
	 
	public static void main(String a[]){
		 
		 	Exception005 mmcb = new Exception005();
		 
	        mmcb.execute(1);
	        mmcb.execute(2);
	    }
	     
	public void execute(int i){
	        try{
	            if(i == 1){
	                getIntValue("9");
	            } else {
	                getUrlObj("http://www.junksite.com");
	            }
	            System.out.println("Everything is good.");
	            
	        } catch (NumberFormatException nfe){
	            System.out.println("Inside NumberFormatException... " 
	            									+ nfe.getMessage());
	        } catch (MalformedURLException mue){
	            System.out.println("Inside MalformedURLException... " 
	           									+ mue.getMessage());
	        } catch (Exception ex){
	            System.out.println("Inside Exception... " + ex.getMessage());
	        }
	    }
	    
	public int getIntValue(String num) {
	        return Integer.parseInt(num);
	    }
	     
	public URL getUrlObj(String urlStr) throws MalformedURLException {    
		return new URL(urlStr);
	}

}
