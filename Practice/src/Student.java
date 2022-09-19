
public class Student extends User implements Talk{
	public String major;
	public enum gym {Bronze, Silver,Gold};
	public gym gymMembership;//gymMembership variable is of type enum gym.
	
	
	//We can override most of the methods(called Virtual methods) of the parent class except the static and private methods 
	@Override
	public void sayHello() {
		System.out.println("hi there i am a student and my major is "+major);
	}

	@Override
	public void sayHi() {
		System.out.println("This is Student Class");		
	}
		
	

}
