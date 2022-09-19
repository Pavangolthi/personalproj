package assignment1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount();
		s.balance = 5000;
		s.accountNo = 1001;
		s.pin = 3690;
		s.annualInterest = 5f;
		s.timePeriod = 10;
		
		s.addInterest();
		
		
		CurrentAccount c = new CurrentAccount();
		c.balance=41000;
		c.withdrawalAmount=450;
		
		c.withdrawalLimit();
	}

}
