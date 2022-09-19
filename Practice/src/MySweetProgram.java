
public class MySweetProgram {
	
	//public static final double PI = 3.14; global variable
	public static void main(String[] args) {//method
		System.out.println("Hello There!!");
		MySweetProgram x= new MySweetProgram();
		System.out.println(x.tacos());//creating an object
		//java.util.Scanner scanner = new java.util.Scanner(System.in); Scanner can be defined in this way too
		int y = 5;
		Integer z = 10;//(10 is auto boxed to int type = from obj to variable)
		System.out.println(y+" "+z);
		System.out.println(Integer.max(y, z));//returns the greater among the two
		System.out.println(Integer.compare(y, z));//returns 0 if equal, -1 if x<y and 1 if x>y
		
		String money = "500";
		String name = "Sravan";
		System.out.println(Integer.valueOf(money));//returns Integer i.e Integer a = Integer.valueOf(money);
		System.out.println(Integer.parseInt(money));//returns int 
		System.out.println(String.format("Hi there %s", money));// other way of concatenation
		System.out.println(name.concat(" Reddy"));//method to concatenate two strings
		
		String fullAd = "    yummm...my oh my chicken pot pie";
		System.out.println(fullAd.concat("chicken"));//returns true or false
		System.out.println(fullAd.indexOf("my", fullAd.indexOf("my")+1));//this statement is used to skip the first occurrence and find the index of the second occurrence
		System.out.println(fullAd.lastIndexOf("my", fullAd.lastIndexOf("my")-1));//returns the index of second last occurrence of the string
		
		
	}
	public String tacos() {
		System.out.println("Hello There Tacos!!");
		return "This is a return statement";

	}
}
//variable - used to store value
//expression- evaluates to a value
//operator - works on operands to produce a value
//operand- the things the operator works on 
//literal - the value(may be a string literal)
//statically typed - the data types of the variables need to be defined up front (before compilation) = java
//dynamically typed - variables do not have types = Python and Javascript
//primitive - int,byte, short, long , boolean, float, double, char, 
//reference(objects) - instance of a class(class is the data type)
