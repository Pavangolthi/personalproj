package assignmentz3;

import java.util.Scanner;

public class BankApp implements Transactions{
	
	private int accNo;
	private double balance;
	double amount;
	int inputAccNo;
	
	Scanner scanner = new Scanner(System.in);
	
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public BankApp() {
	
	}
	
	public boolean checkAccountNo(int accNo) {
		if(accNo==1234)
			return true;
		else
			return false;
	}
	
	@Override
	public void withdraw() {
		System.out.println("Enter the Account Number: ");
		inputAccNo = scanner.nextInt();
		if(checkAccountNo(inputAccNo)) {
			System.out.println("Enter amount you want to withdraw: ");
			amount = scanner.nextDouble();
			if(amount<=5000) {
				
			}
		}
	}

	@Override
	public void checkBalance(int accNo) {
		// TODO Auto-generated method stub
		
	}
	

	
}
