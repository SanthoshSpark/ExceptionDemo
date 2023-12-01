package com.exceptions.demo;

public class Exception004 {

	public int getSize(String input) throws Exception {
		
		if(input==null)
			throw new Exception("Please dont give a null string");
		return input.length();
	}
	public static void main(String[] args) {
		
		Exception004 ex4 = new Exception004();
		
		//String str="Hello World";
		
		String str=null;
		
		try {
			System.out.println("Length: " + ex4.getSize(str));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Afet the method ..................");
		

	}

}
