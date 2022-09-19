package oopproject;

public class Test {

	public static void main(String[] args) {
		// The following statement instructs the JVM to create an object of type SavingsAccount	
		SavingsAccount account = new SavingsAccount();
		
		//Initialization
		account.setAccountNo(101);
		account.setBalance(5000);
		account.setPin(1234);
		//Since static variables belong to the class, we access them using the class name
		System.out.println("Minimum Balance: "+SavingsAccount.minimumBalance);
		System.out.println("Minimum Balance:"+SavingsAccount.getMinimumBalance());
		account.deposit(6000);
		
		SavingsAccount account2 = new SavingsAccount();
		account2.setAccountNo(102);
		account2.setBalance(10000);
		account2.setPin(2345);
		
		SavingsAccount.minimumBalance=600;// we can change the value of the static variable once it is initialized unless they are declared as final
		System.out.println(SavingsAccount.minimumBalance);
		
		SavingsAccount account3 = new SavingsAccount(103, 15000, 5678);		
		account3.checkBalance();
	
		SavingsAccount obj = new JuniorSavingsAccount(101, 5000, 1234, "Harry");
		obj.withdraw(1234, 800);
		obj.checkBalance();
		
		//Compiler needs to be mentioned that the object reference stored in the variable is of type sub-class and explicitly mention
		// to the compiler by type-casting
		JuniorSavingsAccount juniorSavingsAccount = (JuniorSavingsAccount) obj;
		juniorSavingsAccount.display();
	}

}
