package object;

public class Student {
	String name;
	int rollNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	//If we do not override toString(), then object class to string method will be executed which will return className@hashcode_in_
	// hexadecimal_form.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"..."+rollNo;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Sravan", 101);
		Student s2 = new Student("RamChandu",102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}

}
