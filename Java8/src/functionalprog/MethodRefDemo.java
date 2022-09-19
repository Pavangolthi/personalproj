package functionalprog;

interface Interf{
	public void add(int a, int b);
}

public class MethodRefDemo {
	
	private void sum(int a, int b) {
		System.out.println("The Sum is: "+(a+b));
	}

	private static void sums(int a, int b) {
		System.out.println("The Sum is: "+(a+b));
	}
	public static void main(String[] args) {
		//Using the Lambda Expression
		Interf i = (x,y)->System.out.println("The Sum is: "+(x+y));
		i.add(10, 20);
		
		//Using the method reference
		MethodRefDemo demo = new MethodRefDemo();
		Interf in = demo :: sum;
		in.add(100, 200);
		
		Interf i1 = MethodRefDemo::sums;
		i1.add(500, 600);
		
	}

}
