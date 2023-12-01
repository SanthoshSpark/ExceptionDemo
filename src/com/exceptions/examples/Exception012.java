package com.exceptions.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception012 {
	public static FileInputStream f1(String filename) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		
		System.out.println("f1: File input stram is created");
		
		return fis;
	}
	
	public static FileInputStream f2(String filename) throws FileNotFoundException {
		
			FileInputStream fis = new FileInputStream(filename);
			System.out.println("f2: File input stram is created");
			return fis;
		
		
	}
	
	
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		String filename = "d:\\test.txt";
		
		System.out.println("main: Starting " + Exception011.class.getSimpleName()
				+ " with file name: " + filename);
		
		try {
			fis1 = f1(filename);
		}
		catch(FileNotFoundException ex) {
			System.out.println("main: FileNotFoundException caught");
		}
		catch(Exception ex) {
			System.out.println("main: Exception caught");
		}
		finally{
			if(fis1 != null) {
				try {
					fis1.close();
				}
				catch(Exception ex) {
					System.out.println("main: Exception happened");
					System.out.println(ex.getMessage());
				}
			}
		}
		
		try {
			fis2 = f2(filename);
		}
		catch(FileNotFoundException ex) {
			System.out.println("main: FileNotFoundException caught");
		}

		catch(Exception ex) {
			System.out.println("main: Exception caught");
		}
		finally {
			System.out.println("main: Finally block.");
			if(fis1 != null) {
				try {
					fis1.close();
				}
				catch(Exception ex) {
					System.out.println("main: Exception happened");
					System.out.println(ex.getMessage());
				}
			}
			
			if(fis2 != null) {
				try {
					fis2.close();
				}
				catch(Exception ex) {
					System.out.println("main: Exception happened");
					System.out.println(ex.getMessage());
				}
			}
		}
		
		
	    System.out.println("main: " + Exception011.class.getSimpleName() + " ended");
	}

}
