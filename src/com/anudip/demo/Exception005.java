package com.anudip.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nums[] = new int[5];
		
		try {
			System.out.println("Enter numbers:");
			
			for(int i=0; i<5; i++) {
				nums[i] = scanner.nextInt();
			}
			
			int sum = 0;
			
			for(int i=0; i<5; i++) {
				sum += nums[i];
			}
			
			System.out.println("Sum = " + sum);
		}
		catch(InputMismatchException ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			System.out.println("Finaly block excuted");
		}
		
		System.out.println("The program executed successfully.");
		
		scanner.close();
	}

}
