package set;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomCompareTo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sravan",105);
		Employee e2 = new Employee("RamChandu",101);
		Employee e3 = new Employee("Viraj",102);
		Employee e4 = new Employee("Swathi",109);
		Employee e5 = new Employee("Priya",107);
		Employee e6 = new Employee("Sravan",105);
		/*
		 * This constructor internally calls the default natural sorting order i.e. the compareTo() of Comparable interface, since we are 
		 * not passing any comparator object
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t); */
		
		//Here we are passing the Comparator interface implemented Employee class object as an argument, so the compare() will be called
		TreeSet t = new TreeSet(new Employee());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6); 
		System.out.println(t);
	}

}

class Employee implements Comparable, Comparator{
	String name;
	int id;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.id+" Name: "+this.name;
	}

	@Override
	public int compareTo(Object arg0) {
		int id1 = this.id;
		Employee e = (Employee) arg0;
		int id2 = e.id;
		if(id1<id2) {
			return -1;
		}else if(id1>id2) {
			return 1;
		}else {
			return 0;
		}
			
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1 = (Employee) arg0;
		Employee e2 = (Employee) arg1;

		return e1.name.compareTo(e2.name);
	}
	
	
}
