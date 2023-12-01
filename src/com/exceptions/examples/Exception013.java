/*
 * 
 * Clean up Resources in a Finally Block or Use a Try-With-Resource Statement
 * 
 */

package com.exceptions.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception013 {

	public static void main(String[] args) {
		//1.Clean up Resources in a Finally Block
		
		/*
		FileInputStream inputStream = null;
		try {
			File file = new File("d:\\tmp.txt");
			inputStream = new FileInputStream(file);
			
			// use the inputStream to read a file
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		*/
		
		/*
		//2. Use a Try-With-Resource Statement
		
		File file = new File("./tmp.txt");
		
		try (FileInputStream inputStream = new FileInputStream(file);) {
			// use the inputStream to read a file
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
