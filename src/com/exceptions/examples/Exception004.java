/*
 * Use 'throw' statement to throw an exception or simply use the throw 
 * clause with an object reference to throw an exception.
 * 
 * The syntax is 'throw new Exception();'. 
 * 
 * Even you can pass the error message to the Exception constructor.
 * 
 * 
 */
package com.exceptions.examples;

public class Exception004 {
	public static void main(String[] args) {
		 try{
			 	Exception004 met = new Exception004();
			 	
			 
	            System.out.println("length of JUNK is " 
	            				+ met.getStringSize("JUNK"));
	            
	            
   
	            
	            System.out.println("length of WRONG is " 
	            				+ met.getStringSize("WRONG"));
	            
	            
	            System.out.println("length of null string is " + 
    					met.getStringSize(null));
	            
	            
	            System.out.println("length of null string is " + 
    					met.getStringSize(""));
	            
	        } catch (Exception ex){
	            System.out.println("Exception message: " + ex.getMessage());
	        }
	    }
	     
	public int getStringSize(String str)  throws Exception {
	        if(str == null || str.length() == 0){
	            throw new Exception("Your string input is null.");
	        }
	        return str.length();
	}

}
