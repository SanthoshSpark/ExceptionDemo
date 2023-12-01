package com.anudip.demo;

public class Exception007 {

	public static void main(String[] args) {
		User u1 = new User("Ramesh", 4);
		
		User u2 = new User("Prahaash", 19);
		
		try {
			if(u1.vote())
				System.out.println("Ramesh voted");
		}
		catch(SufficientAgeException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
		
		try {
			if(u2.vote())
				System.out.println("Prahaash voted");
		}
		catch(SufficientAgeException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
		

	}

}
