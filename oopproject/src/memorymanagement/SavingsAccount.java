package memorymanagement;

public class SavingsAccount {
	//fields or instance variables or non-static variables
	private int accountNo;
	private double balance;
	private int pin;
	static int minimumBalance = 500;//as it is common to all the accounts rather than creating each time for every object, we only create one copy of this variable
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public SavingsAccount(int accountNo, double balance, int pin) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}
	public boolean IsPinValid(int pin) {
		if (this.getPin()==pin)
			return true;
		return false;
	}
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public static int getMinimumbalance() {
		return minimumBalance;
	}

	public static int getMinimumBalance() {
		return minimumBalance;
	}

	//Instance or Non-static methods
	public void deposit(int depositAmount) {
		if(depositAmount>0) {
			this.balance+=depositAmount;
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}	
	
	
	//Method Signature--> withdraw(int).
	public void withdraw(int withdrawalAmount) {
		//Rules to withdraw amount from a branch
		if (withdrawalAmount<= this.balance && withdrawalAmount>0) {
			this.balance-=withdrawalAmount;
		}else {
			System.out.println("You have insufficient funds");
		}
		
	}
	
	public void withdraw(int pin, int withdrawalAmount) {
		if(this.pin == pin) {
			if(withdrawalAmount <= 500) {
				withdraw(withdrawalAmount);
			}else {
				System.out.println("Withdrawal limit exceeded");
			}
		}else {
			System.out.println("Invalid pin");
		}
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is "+this.balance);
	}
	
	
}
//parameters: it represents the variable to store the arguments(part of method definition)
//arguments : it represents the value to be passed to the method(part of method calling)