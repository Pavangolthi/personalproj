package functionalprog;

class Sample{
	/*
	 * public Sample() { System.out.println("Constructor execution");
	 */
		
		public Sample(String s) {
			System.out.println("Constructor execution with argument: "+s);
	}
}

interface Inter{
	//public Sample get();
	public Sample get(String s);
}

public class ConsRefDemo {

	public static void main(String[] args) {
		Inter i = Sample::new;
		Sample s1 = i.get("Sravan");
	}

}
