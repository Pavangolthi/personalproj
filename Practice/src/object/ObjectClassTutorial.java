package object;

public class ObjectClassTutorial {

	public static void main(String[] args) {
		
		checkObjectType(2);
		checkObjectType(5L);
		checkObjectType(1.5f);
		checkObjectType("RamChandu");
		checkObjectType(2.5D);
		
	}
	
	public static void checkObjectType(Object input) {
		//instanceof operator is used to compare objects/instance with specified type.
		if(input instanceof Integer) {
			System.out.println(input+" is of type Integer.");
		}
		else if(input instanceof Long){
			System.out.println(input+" is of type Long.");
		}
		else if(input instanceof Float){
			System.out.println(input+" is of type Float.");
		}
		else if(input instanceof String){
			System.out.println(input+" is of type String.");
		} 
		else
		{
			System.out.println(input+" is of "+input.getClass().getTypeName()+" type.");
		}
		
	}
}
