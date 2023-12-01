package com.anudip.demo;

public class User {
	private String name;
	private int age;
	
	public User() {
		
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public boolean vote() throws SufficientAgeException {
		if(age < 18) {
			//try {
			throw new SufficientAgeException("Your age is not sufficient. You should be atleast 18 years of age. \nBut your age is " + age);
			/*}
			catch(SufficientAgeException ex) {
				throw ex;
			}*/
		}
		else
			return true;
		
	}
	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
