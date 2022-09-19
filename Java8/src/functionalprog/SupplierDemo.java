package functionalprog;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String otp ="";
			for(int i =0;i<6;i++) {
				otp=otp+ (int)(Math.random()*10);
			}
			return otp;
		};
		
		Supplier<Date> s1 = ()->{
			return new Date();
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		System.out.println(s1.get());
	}

}
