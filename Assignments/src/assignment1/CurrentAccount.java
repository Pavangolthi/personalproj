package assignment1;

public class CurrentAccount extends Account{
	static int overDraftLimit = 500;
	
	public void withdrawalLimit() {
		if(withdrawalAmount <= overDraftLimit) {
			if(withdrawalAmount<=balance) {
				balance-=withdrawalAmount;
				System.out.println("Balance is "+balance);
			}
			else
				System.out.println("Insufficient Funds");
		}else {
			System.out.println("Overdraft Limit Exceeded");
		}
	}
}
