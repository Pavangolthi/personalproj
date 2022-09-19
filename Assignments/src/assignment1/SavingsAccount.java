package assignment1;

public class SavingsAccount extends Account{
	float annualInterest;
	
	
	public void addInterest() {
		balance = balance*(Math.pow(1+((0.01*annualInterest)/MONTHSINYEAR), MONTHSINYEAR*timePeriod));
		System.out.println("The Savings Account Balance after adding interest is "+balance);
	}
}
