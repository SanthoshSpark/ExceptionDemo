/*
 * 
 * Sometimes it is required to develop meaningful exceptions based on application 
 * requirements. 
 * 
 * We can create our own exceptions by extending 'Exception' class. 
 * 
 * Below example shows how to create custom exception by extending Exception class.
 * 
 * 
 */
package com.exceptions.examples;

class MyAppException extends Exception {
	
	private String message = null;
 
    public MyAppException() {
        super();
    }
 
    public MyAppException(String message) {
        super(message);
        this.message = message;
    }
 
    
 
    @Override
    public String toString() {
        return message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}

public class Exception008 {
	 public static void main(String[] a){
	        try{
	        	//Exception008 obj = new Exception008();
	        	//obj.myTest(null);
	        	
	        	//Exception008.myTest(null);
	        	
	        	//myTest("Hello Friend");
	        	myTest(null);
	        	
	        } catch(MyAppException mae){
	            //System.out.println("Inside catch block: "+mae.getMessage());
	        	System.out.println(mae);
	        }
	    }
	     
	     static void myTest(String str) throws MyAppException{
	        if(str == null){
	            throw new MyAppException("String value is null");
	        }
	        else
	        	System.out.println(str);
	    }
}
