
public abstract class AbsTest {
	
	private String favMovie;
	private String favPlace;
	
	public AbsTest() {
		
	}
	
	public AbsTest(String favMovie,String favPlace) {
		this.favMovie=favMovie;
		this.favPlace=favPlace;
	}
	public String getFavMovie() {
		return favMovie;
	}


	public String getFavPlace() {
		return favPlace;
	}

	
	public void sayHey() {
		System.out.println("Parent Class!!!");
	}

}
