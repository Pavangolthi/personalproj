package com;

import java.time.LocalDate;

abstract public class Employee {
	int id;
	String name;
	LocalDate dob;//convenient way for working with dates
	/*public enum gender {Male,Female,Others};
	public gender employeeGender;*/
	GenderType gender;
	String email;
	
	public Employee() {
		System.out.println("Super");
	}

	public Employee(int id, String name, LocalDate dob, GenderType gender, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
	}
	
	abstract public void calculateSalary();
	
	public void getDetails() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Email: "+email);
	}
	
	
}
