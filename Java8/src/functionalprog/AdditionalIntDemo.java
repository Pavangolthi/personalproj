package functionalprog;

import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class AdditionalIntDemo {

	public static void main(String[] args) {
		IntFunction<Integer> f=i->i*i;
		System.out.println(f.apply(50));
		
		ToIntFunction<String> f1 = s->s.length();
		System.out.println(f1.applyAsInt("Sravan"));
		
		ToDoubleFunction<Integer> f2 = d->Math.sqrt(d);
		System.out.println(f2.applyAsDouble(16));
		
		UnaryOperator<Integer> u = i->i*i;
		System.out.println(u.apply(20));
	}

}
