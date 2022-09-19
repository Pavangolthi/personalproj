import java.text.NumberFormat;
import java.util.Scanner;

public class MortagageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final byte MONTHS = 12;
		final byte PERCENT = 100;
		int principal;
		float annualInterest;
		int timePeriod;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {  
			System.out.print("Principal ($1k - $1M): "); 
			principal = scanner.nextInt();
			if (principal>1000 && principal<=1000000)
				break;
			System.out.println("Enter a number between 1,000 and 1,000,000.");
		}	
		  while(true) {
			System.out.print("Annual Interest Rate: "); 
			annualInterest = scanner.nextFloat(); 
			if(annualInterest>0 && annualInterest<=30)
				break;
			System.out.println("Enter a value greater than 0 and less than 30.");
		  }
		  
		  float monthlyInterest = annualInterest/PERCENT/MONTHS;
		  
		  while(true) {
			  System.out.print("Time Period: "); 
		  	  timePeriod = scanner.nextInt(); 
		  	  if(timePeriod>0 && timePeriod<=30)
		  		  break;
		  	  System.out.println("Enter a value between 1 and 30");
		  }
		  int timeInMonths = timePeriod*MONTHS;
		  
		  double mortagage =principal*(Math.pow(1+monthlyInterest, timeInMonths)*monthlyInterest)/(Math.pow(1+monthlyInterest, timeInMonths)-1);
		  System.out.println("Mortagage: "+NumberFormat.getCurrencyInstance().format(mortagage));
		 
		
	}


}
