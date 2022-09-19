package map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		//If HashMap is used then the GC is dominated by HashMap
		//HashMap m = new HashMap();
		// output: {temp=Sravan} {temp=Sravan} 
		//If WeakHashMap is used then the GC dominates WeakHashMap
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "Sravan");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}

class Temp{
	
	public Temp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "temp";
	}	
	public void finalize() {
		System.out.println("finalize method is called");
	}
}