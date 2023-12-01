/*
 * The 'throws' clause in java programming language is belongs to a method to 
 * specify that the method raises particular type of exception 
 * while being executed.
 * 
 * The 'throws' clause takes arguments as a list of the objects of type 
 * 'Throwables' class.
 * 
 * Anybody calling a method with a throws clause is needed to be enclosed within 
 * the try catch blocks.
 * 
 */
package com.exceptions.examples;

public class Exception003 {
	public static void main(String[] args) {
		
		Exception003 mytc = new Exception003();
		
	        try{
	            for(int i=0; i<5; i++){
	                mytc.getJunk();
	                System.out.println(i);
	            }
	       }
	       catch (InterruptedException iex){
	        	iex.printStackTrace();
	       }
	    }
	     
	    public void getJunk() throws InterruptedException {
	        
	    	/*
	    	try {
	    		Thread.sleep(5000);
	    	}
	    	catch(InterruptedException ex) {
	    		ex.printStackTrace();
	    	}
	    	*/
	    	
	    	Thread.sleep(5000);
	    	
	    }

}
