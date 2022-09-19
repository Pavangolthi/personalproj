package assignmentz3;

public class AtmApp implements Transactions{
	private int pin;
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean checkPin(int pin) {
		if(this.getPin()==pin) {
			return true;
		}
			return false;
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance(int accNo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
