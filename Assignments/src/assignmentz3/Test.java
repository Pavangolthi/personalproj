package assignmentz3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		BankApp bankapp = new BankApp();
		AtmApp atmApp = new AtmApp();
		atmApp.setPin(9087);
		bankapp.setAccNo(1234);
		bankapp.setBalance(5000);
	
		
		System.out.println("Enter Banking or Atm");
		
		Scanner scanner = new Scanner(System.in);
		String source = scanner.next();
		
		if(source.toLowerCase().equals("banking")) {
			Itransactions itransactions = new Itransactions();
			BankApp bankApp = new BankApp();
			itransactions.setTransactions(bankApp);
			System.out.println("Enter 1 to withdraw, 2 to check balance.");
			
			int input = scanner.nextInt();
			if(input==1) {
				itransactions.performWithdraw();
			}
		}else if(source.toLowerCase().equals("atm")) {
			Itransactions itransactions = new Itransactions();
			AtmApp atmApp1 = new AtmApp();
			itransactions.setTransactions(atmApp1);
			System.out.println("Enter 1 to withdraw, 2 to check balance.");
		}else {
			System.out.println("Enter valid input");
		}
	
	}

}
