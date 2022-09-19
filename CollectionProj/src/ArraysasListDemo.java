import java.util.Arrays;
import java.util.List;

public class ArraysasListDemo {

	public static void main(String[] args) {
		String[] s = {"A","Z","B"};
		List l = Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "L");
		for (Object o : l) {
			System.out.println(o.toString());
		}
		//l.add("M");//RE:UnsupportedOperationException
		//l.remove(0);//RE:UnsupportedOperationException
		//l.set(1, new Integer(10));//RE:ArrayStoreException
	}

}
