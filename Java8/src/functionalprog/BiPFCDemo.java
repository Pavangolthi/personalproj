package functionalprog;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPFCDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (x,y)->(x+y)%2==0;
 		System.out.println(bp.test(10, 20));
 		System.out.println(bp.test(15, 20));
 		
 		BiFunction<String, Integer, Employees> bf = (ename,eno) -> new Employees(ename,eno);
 		ArrayList<Employees> l = new ArrayList<Employees>();
 		l.add(bf.apply("Sravan", 100));
 		l.add(bf.apply("RamChandu", 101));
 		l.add(bf.apply("Krishna", 102));
 		l.add(bf.apply("Viraj", 103));
 		
 		for (Employees employees : l) {
			System.out.println(employees);
		}
 		
 		//add 100 to the employee number for every employee
 		BiConsumer<Employees, Integer> bc = (e,i)->e.eno=e.eno+i;
 		
 		for (Employees employees : l) {
			bc.accept(employees, 100);
		}
 		
 		for (Employees employees : l) {
			System.out.println(employees);
		}
	}

}

class Employees{
	String name;
	int eno;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", eno=" + eno + "]";
	}
	
	
}
