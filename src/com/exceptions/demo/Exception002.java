package com.exceptions.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception002 {
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a divisor: ");
		int div = scanner.nextInt();
		
		float result = n1/div;
		
		System.out.println("Result: " + result);
		}
		catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.out.println("Dont give zero as input for div." + ex.getMessage());
		}
		catch(InputMismatchException ex) {
			ex.printStackTrace();
			//System.out.println("Please see your input. " + ex);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			//System.out.println("Please see your input. ");
		}
		
		System.out.println("End of the program execution");
	}

}
