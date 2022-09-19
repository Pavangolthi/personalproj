import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		String message1 = new String();
		message1 = "How are you doing?";
		System.out.println(message1);
		String message = "Hi there!!! What's up?";//Reference data type
		System.out.println(message);
		// System.out.println(message.startsWith("Hi"));
		System.out.println("My age is "+age);
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));// we need to import Arrays from java.util library and toString() is used to print arrays
		int[][] numberarr = {{1,2,3,4,5},{6,7,8,9,10}};
		System.out.println(Arrays.deepToString(numberarr));// for multi-dimensional arrays, we use deeptoString()
		
		final float num = 3.14F;// we need to explicitly mention F after the number because any decimal is considered 
		// as double by default. final is used to declare a variable as a constant
		double div = (double)10/(double)3;// we need to consider it as double else the numbers after decimals will be lost
		System.out.println(div);
		// Implicit Casting byte>short>int>long>float>double(no chance for data loss)
		short x= 1;
		int y = x+2;
		System.out.println(y);
		//Explicit casting
		String z = "1";
		int a= 5 + Integer.parseInt(z);//Integer is the wrapper class for int data type
		System.out.println(a);
		// MAthematical Operations
		int result = Math.round(3.1F);
		System.out.println(result);
		System.out.println(Math.ceil(4.5F));
		System.out.println(Math.floor(3.9F));
		System.out.println(Math.max(4.6, 5.1));
		System.out.println((int)(Math.random()*100));
		//Formatting numbers
		NumberFormat currency = NumberFormat.getCurrencyInstance();//NumberFormat is an abstract class, so we use factory method to create an instance of that class
		String money = currency.format(1234567.89);//Outputs the result in string format
		System.out.println(money);
		String percent = NumberFormat.getPercentInstance().format(0.26);//To convert into percentage
		System.out.println(percent);
		//Reading Input
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.print("Enter your age ");
		 *  byte a1 = scanner.nextByte();
		 * System.out.println("Your age is"+a1);
		 */
		System.out.print("Enter your name ");
		// String name = scanner.next();// Takes only one token spaces and tabs are not considered.
		String name = scanner.nextLine().trim(); //Considers all spaces and tabs.
		System.out.println("Your name is " +name); 
		
		//Operators == equal to, != not equal to, logical AND &&, logical OR ||(the expressions are evaluated from left to right)
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		System.out.println(hasHighIncome||hasGoodCredit); // first the variable hasHighIncome is evaluated, if it is false then the hasGoodCredit is evaluated
		int temp = 35;
		if(temp >= 30) {
			System.out.println("It's a hot day");
		} else if(temp>20 && temp<30){
			System.out.println("It's a nice day");
		}else {
			System.out.println("It's a cold");
		}
		int income = 90000;
		boolean hasIcome = (income > 100000);
		System.out.println(hasIcome);
		String className = income > 100000 ? "First Class" : "Economy";
		System.out.println(className);
		
		//FizzBuzz
		int entered = scanner.nextInt();
		if(entered % 5 == 0) {
			if(entered % 3 == 0) {
				System.out.println("FizzBuzz");
			}else
			System.out.println("Fizz");
		}else if (entered % 3 == 0)
			System.out.println("Buzz");
		else
			System.out.println(entered);
		
		// for loop
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		//while loop
		String input = "";
		while (true) {//make sure to have a break statement when using "true" as iterating condition
			System.out.print("Input: ");
			input=scanner.next().toLowerCase();
			if(input.equals("pass")) 
				continue;//brings the control to the beginning of the loop
			if(input.equals("quit"))
				break;//brings the control outside the loop
			System.out.println(input);	
		}
		
		String[] fruits = {"Apple","Banana","Mango"};
		for (String fruit: fruits) {//the limitation with for each loop is that it only iterates forward no backward
			System.out.println(fruit);
		}
		
			
		
	}

}
