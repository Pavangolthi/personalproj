package memorymanagement;

public class TestRunTime {

	public static void main(String[] args) {
		//fetching runtime class object reference
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("Total Memory: "+runtime.totalMemory());
		System.out.println("Free Memory before creating objects: "+runtime.freeMemory());
		
		for (int i = 0; i < 4000; i++) {
			new SavingsAccount(101,5000,1234);
		}
		
		System.out.println("Free Memory after creating objects: "+runtime.freeMemory());
		
		System.out.println("Calling gc...");
		runtime.gc();
		
		System.out.println("Free Memory: "+runtime.freeMemory());
	}

}
