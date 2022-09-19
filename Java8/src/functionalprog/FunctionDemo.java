package functionalprog;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {
		//To find the square of a number
		System.out.println("Square of a number");
		Function<Integer, Integer> f=x->x*x;
		System.out.println(f.apply(5));
		System.out.println(f.apply(4));
		
		//To find the length of a string\
		System.out.println("\nString Length");
		Function<String, Integer> f1=s->s.length();
		System.out.println(f1.apply("Sravan Reddy"));
		
		Function<Student, String> f2 = s -> {
			int marks = s.marks;
			String grade = "";
			if(marks>=80) grade = "A[Distinction]";
			else if(marks>=60) grade = "B[First Class]";
			else if(marks>=50) grade = "C[Second Class]";
			else if(marks>=35) grade = "D[Third Class]";
			else grade = "E[Failed]";
			
			return grade;
		};
		
		//To print students with marks >=60
		Predicate<Student> p = s1->s1.marks>=60;
		
		Student[] s = {new Student("Sravan",100),
				new Student("Sunny",65),
				new Student("Bunny",55),
				new Student("Chinni",45),
				new Student("Vinny",25)};
		
		//Consumer interface is used to print an set of statements
		Consumer<Student> c= s2-> {
			System.out.println("\nStudent name: "+s2.name);
			System.out.println("Marks: "+s2.marks);
			System.out.println("Grade: "+f2.apply(s2));
		};
		
		for (Student student : s) {
			c.accept(student);
		}
		
		for (Student student : s) {
			if(p.test(student)) {
				c.accept(student);
			}
		}
		
		
		
		//Misc methods
		Function<Integer, Integer> f3 = i->2*i;
		Function<Integer, Integer> f4 = i->i*i*i;
		
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
		
	}
		

}

class Student{
	String name;
	int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}
