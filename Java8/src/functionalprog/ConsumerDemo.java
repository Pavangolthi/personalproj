package functionalprog;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m->System.out.println(m.name+" is yet to release");
		Consumer<Movie> c2 = m->System.out.println(m.name+" released but it is a flop");
		Consumer<Movie> c3 = m->System.out.println(m.name+" is stored in the database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		cc.accept(new Movie("Spyder"));
	}

}

class Movie{
	String name;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(String name) {
		super();
		this.name = name;
	}
	
}