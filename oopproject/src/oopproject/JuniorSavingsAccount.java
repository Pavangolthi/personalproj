package oopproject;

//JuiorSavingsAccount is a child class of SavingsAccount
public class JuniorSavingsAccount extends SavingsAccount{
	String guardianName;
	
	public JuniorSavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public JuniorSavingsAccount(int accountNo, double balance, int pin, String guardianName) {
		//Invoking super class constructor
		super(accountNo, balance, pin);
		this.guardianName = guardianName;
	}
	
	@Override
	public void withdraw(int pin, int withdrawalAmount) {
		if(this.IsPinValid(pin)) {
			if(withdrawalAmount <= 1000) {
				withdraw(withdrawalAmount);
			}else {
				System.out.println("Withdrawal limit exceeded");
			}
		}else {
			System.out.println("Invalid pin");
		}
	}
	
	public void display() {
		System.out.println("this is display");
	}
}
