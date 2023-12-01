package com.exceptions.demo;

public class Exception003 {
	public static void main(String[] args) {
		
		int n[] = {1,2,3,4};
		
		try {
			for(int i=0; i<5; i++) {
				n[i] = n[i] * n[i];
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(n[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		
		System.out.println("Finished executing.........");
		
	}

}
