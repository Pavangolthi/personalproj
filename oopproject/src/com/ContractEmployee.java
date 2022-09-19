package com;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	LocalDate contractStartDate;
	LocalDate contractEndDate;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, LocalDate dob, GenderType gender, String email,
			LocalDate contractStartDate, LocalDate contractEndDate) {
		super(id, name, dob, gender, email);
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee: calculateSalary()");
	}

		
	
}
