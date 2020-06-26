package com.qa_PersonalDetails;

public class Person {

	private String fname;
	private String surname;
	private int age;
		
	public Person(String fname, String surname, int age){
		this.fname = fname;
		this.surname = surname;
		this.age = age;
	}
		
	@Override
	public String toString() {
		return "Name: " + fname + " " + surname + " \nAge: " + age;
	}
			

}

