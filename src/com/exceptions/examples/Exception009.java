
package com.exceptions.examples;

public class Exception009 {
	public static void validate(int age) throws InvalidAgeException {  
	     if(age<18)  
	      throw new InvalidAgeException("Sorry. Your age is " + age +". But you must be atleast 18 years of old.");  
	     else  
	      System.out.println("Welcome to vote");  
	}  
	
	public static void main(String[] args) {
		try{  
		      validate(13);  
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception m){
			System.out.println("Exception occured: "+m);
		}  
		  
		System.out.println("rest of the code...");  
	}

}
