import java.util.List;

public class User implements Talk{
	//members - methods and properties
	private String firstName;
	public String lastName;
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//This is a static method and we generally know that static methods are at class level and rather than passing single user objects
	// it is recommended to pass a list with user objects
	public static void printUser(List<User> users) {
		for(User u:users) {
			System.out.println(u.getFullName());
		}
	}
	
	//Method Overloading- Having the same method signature and name but different parameters
	public String output() {
		return "Hi my name is "+getFullName();
	}
	public String output(boolean val) {
		if(val) {
			return "You are great "+getFullName();
		}
		return "You are a freak "+getFullName();
	}
	
	//Searching a list for custom objects
	public static int searchUser(List<User> user, String fn, String ln) {
		return searchUser(user,fn+" "+ln);
	}
	public static int searchUser(List<User> user,String fullName) {
		for(int i=0;i<user.size();i++) {
			if(user.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}
	
	//Overriding method in child class
	public void sayHello() {
	
		System.out.println("Hi There my name is user");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("This is user class");
		
	}
	
	
	
}

/*Abstract Class-The abstract classes cannot be instantiated i.e we cannot create an object for abstract classes but we can 
gain value form abstract classes from the concept of inheritance i.e by extending them. To declare a class as abstract you need to
add in "abstract" keyword after the access modifier. Ex:public abstract class User

Abstract Methods- We cannot have a body for abstract methods and should be ended with a semicolon. We need to add "abstract" keyword
to the methods to declare it abstract. Ex:public abstract void sayHello(). **Abstract methods can only be defined in abstract classes.**
*/

/*final keyword in methods: When the final keyword is used in the method declaration, it tells the compiler that this is the final implementation
 * of the methods and no extended classes or child/subclasses extending the class containing the final method cannot override that method.
 * 
 *final keyword in classes: When the final keyword is used in class definition, no other class can extend this base class.  
 **/
