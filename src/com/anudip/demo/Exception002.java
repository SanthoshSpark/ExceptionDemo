package com.anudip.demo;

public class Exception002 {

	public static void main(String[] args) {
		int n1=100;
		int n2=45;
		
		//System.out.println("Sum = " + (n1 - n2));
		System.out.println("Sum = " + (n1 + n2));
		
		if(n1 > n2) // if(n1 < n2)
			System.out.println("N1 is big.");
		else
			System.out.println("N2 is big.");
		
		System.out.println("Division = " + (double)n1/n2); //System.out.println("Division = " + n1/n2);

	}

}
