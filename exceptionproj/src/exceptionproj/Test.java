package exceptionproj;

public class Test {

	public static void main(String[] args) {
		try {
		SavingsAccount account = new SavingsAccount(101, 5000, 1234);
		
		account = null;
		
		account.deposit(6000);
		
		System.out.println("Balance after deposit"+account.getBalance());
		
		}catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("End of main()");
	}

}
