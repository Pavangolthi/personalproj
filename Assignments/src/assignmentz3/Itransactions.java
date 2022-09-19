package assignmentz3;

public class Itransactions {
	
	private Transactions transactions;
	
	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}
	
	public void performWithdraw() {
		this.transactions.withdraw();
	}
	
	public void checkBalance(int accNo) {
		this.transactions.checkBalance(accNo);
	}
	
}
