package com.exceptions.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception011 {
	
	public static FileInputStream f1(String filename) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(filename);
		
		System.out.println("f1: File input stram is created");
		
		return fis;
	}
	
	public static FileInputStream f2(String filename) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(filename);
		}
		catch(FileNotFoundException ex) {
			System.out.println("f2: FileNotFoundException is caught");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("f2: Finally block.");
			if(fis != null) {
				try {
					fis.close();
				}
				catch(Exception ex) {
					System.out.println("f2: Exception happened");
					System.out.println(ex.getMessage());
				}
			}
		}
		return fis;
	}
	
	
	public static void main(String[] args) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		String filename = "d:\\test1.txt";
		
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
		
		fis2 = f2(filename);

	    System.out.println("main: " + Exception011.class.getSimpleName() + " ended");
	}

}
