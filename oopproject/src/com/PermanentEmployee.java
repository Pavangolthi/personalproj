package com;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	LocalDate dateOfJoining;
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int id, String name, LocalDate dob, GenderType gender, String email,
			LocalDate dateOfJoining) {
		super(id, name, dob, gender, email);
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee: calculateSalary()");
	}
	
	
}
