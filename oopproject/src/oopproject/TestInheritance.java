package oopproject;

public class TestInheritance {

	public static void main(String[] args) {
		
		JuniorSavingsAccount account = new JuniorSavingsAccount(101,5000,1234,"Swathi");
		/*
		account.accountNo = 101;
		account.balance = 5000;
		account.pin = 1234;
		account.guardianName = "Swathi";*/
		
		account.deposit(6000);
		account.checkBalance();
	}

}
