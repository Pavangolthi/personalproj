package memorymanagement;

public class Test {

	public static void main(String[] args) {
		
		//local variable
		int i = 10;
		
		//account is a local reference variable
		SavingsAccount account = new SavingsAccount(101,5000,1234);
		
		account.deposit(1000);

		System.out.println("End of main()");
	}

}
