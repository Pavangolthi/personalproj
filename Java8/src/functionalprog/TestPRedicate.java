package functionalprog;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPRedicate {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Sravan",8000));
		l.add(new Employee("Priya",5000));
		l.add(new Employee("Krishna",80000));
		l.add(new Employee("RamChandu",100000));
		l.add(new Employee("Swathi",10000));
		
		Predicate<Employee> p = e -> e.salary>15000;
		for(Employee e1: l) {
			if(p.test(e1)) {
				System.out.println(e1);
			}
		}
	}

}

class Employee{
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
