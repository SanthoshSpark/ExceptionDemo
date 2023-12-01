package com.anudip.demo;

import java.util.Scanner;

public class Exception003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		double result = (double)n1/n2;
		
		System.out.println("Division of n1 and n2 = " + result);
		
		scan.close();

	}

}
