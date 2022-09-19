package assignment2;

public class Lion extends Animal{
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}
	
	public Lion(String string, float f, float g, int i) {
		super(string, i, g, i);
	}

	@Override
	public void makesSound() {
		System.out.println("Roar!!!");
	}

}
