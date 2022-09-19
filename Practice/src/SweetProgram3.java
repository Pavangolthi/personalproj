import java.util.ArrayList;
import java.util.List;

public class SweetProgram3 {
	public static void main(String[] args) {
		/*
		 * User user = new User(); User user2 = new User(); user2.setFirstName("Priya");
		 * user2.setLastName("Reddy");
		 * 
		 * user.setFirstName("Sravan"); user.setLastName("Reddy");
		 * System.out.println(user.getFullName());//most preferred way of accessing
		 * methods
		 */		
		String[] firstNames = {"Sravan", "Priya", "Swathi", "Viraj"};
		String[] lastNames = {"Reddy", "Srinivas", "Naveen", "Krishna"};
		
		//Creating Array Lists of Custom type
		List<User> users = new ArrayList<User>();
		//Adding user objects to the list of type User
		/*
		 * users.add(user); users.add(user2)
		 */
		for(int i = 0; i<firstNames.length;i++) {
			User user = new User();
			user.setFirstName(firstNames[i]);
			user.setLastName(lastNames[i]);
			users.add(user);
		}
		
		for(User u:users) {
			System.out.println(u.getFullName());
		}
		
		 User.printUser(users);
		 
		 //Method Overloading Call
		 User user = new User();
		 users.add(user);
		 user.setFirstName("Cobra");
		 user.setLastName("Kai");
		 //Invoking two different methods
		 System.out.println(user.output());
		 System.out.println(user.output(true));
		 
		 //Methods call for searching a custom user object
		 System.out.println("Object is found at index "+User.searchUser(users, "Viraj", "Krishna"));
		 
		 System.out.println(users.get(1));
		 
		Student s = new Student();
		s.major = "Project Management";
		s.sayHello();
		
		//Implementing abstract classes and method overriding
	/*	AbsTestChild child1 = new AbsTestChild();
		child1.favMovie = "Bahubali";
		child1.favPlace = "Beach";
		
		AbsTestChild2 child2 = new AbsTestChild2();
		child2.favMovie = "Anand";
		child2.favPlace = "Home";
		
		List<AbsTest> absList = new ArrayList<AbsTest>();
		absList.add(child1);
		absList.add(child2);
		
		child1.sayHey();
		child2.sayHey();   */
		
		// make the constructor only way to assign the values
		AbsTestChild child = new AbsTestChild("Sravan", "Reddy");
		System.out.println(child.getFavMovie()+" "+child.getFavPlace());
		
		//Implementing the methods of the interface in the implemented classes
		//Let us create a list of type Talk 
		List<Talk> thingsThatTalk = new ArrayList<Talk>();
		thingsThatTalk.add(s);//We can add the objects of the interface implementing classes to the list of type interface
		thingsThatTalk.add(user);
		thingsThatTalk.get(0).sayHi();//implementing the methods of the interface
		thingsThatTalk.get(1).sayHi();
		
		
		//Using Enum variables
		s.gymMembership = s.gymMembership.Silver;
		System.out.println(s.gymMembership);
		
		//Using enum in switch statements
		switch(s.gymMembership) {
			case Bronze:
				System.out.println("Bronze Membership");
				break;
			case Gold:
				System.out.println("Gold Membership");
				break;
			case Silver:
				System.out.println("Silver Membership");
				break;
		}
		
		
			
	}	
}


