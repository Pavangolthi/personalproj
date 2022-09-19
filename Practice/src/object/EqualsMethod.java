package object;

public class EqualsMethod {
	String name;
	int rollNo;
	
	public EqualsMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public EqualsMethod(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	@Override
	public boolean equals(Object arg0) {
		try {
			String name1 = this.name;
			int rollNo1 = this.rollNo;
			EqualsMethod e = (EqualsMethod) arg0;
			String name2 = e.name;
			int rollNo2 = e.rollNo;
			if(name1.equals(name2) && rollNo1==rollNo2) {
				return true;
			}else {
				return false;
			}
		}catch(ClassCastException e) {
			return false;
		}catch(NullPointerException e) {
			return false;
		}

	}
	
	public static void main(String[] args) {
		EqualsMethod e1 = new EqualsMethod("Sravan",101);
		EqualsMethod e2 = new EqualsMethod("RamChandu",102);
		EqualsMethod e3 = new EqualsMethod("Sravan",101);
		EqualsMethod e4 = e1;
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals("RamChandu"));
		System.out.println(e1.equals(null));

	}
}
