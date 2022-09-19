import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram2 {

	public static void main(String[] args) {
		/*
		User user = new User();
		user.firstName = "Sravan";//setting a property
		user.lastName = "Kambapu";
		System.out.println(user.getFullName());
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		switch(name) {
			case "Sravan": 
				System.out.println("First Name");
				break;
			case "Reddy": 
				System.out.println("Last Name");
				break;
			default:
				System.out.println("Enter name");
		}
		int a= 10;
		int b = 5;
		String states = a>b ? "Andhra" : "Telangana";//Ternary operator
		System.out.println(states);
		
		String password = "";
		
		while(true) {
			System.out.println("Enter password");
			password = scanner.nextLine();
			if(password.toLowerCase().equals("ramchandu")) {
				System.out.println("Access Granted");
				break;
			}
			System.out.println("Wrong password");
		} 
		for (int i=9; i>=0; i--) {
			for(int j=i; j>+0; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}*/
		
		for (int i=0; i<5; i++) {
			for(int j=i; j<5;j++) {
				System.out.print("Hi");
			}
			System.out.print("\n");
		}
		
		int[][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(Arrays.deepToString(m));//used for multi dimensional arrays
		
		//List can dynamically resize
		List<Integer> grades = new ArrayList<Integer>();//syntax for creating a list 
		grades.add(5);// adding an element to the list
		grades.add(10);//gets appended to the list
		grades.add(1, 7);//this function is used to add an element at a particular index, it pushes the element at the element to the next index.
		
		System.out.println(grades.get(0)+" "+grades.get(1)+" "+grades.get(2));
		System.out.println(grades.indexOf(5));
		//System.out.println(grades.get(6)); throws index out of bounds exception
		System.out.println(grades.indexOf(1));//if the element is not present, it return -1
		System.out.println(grades.contains(10));//returns a boolean if present or not
		System.out.println(grades.isEmpty());//conditional expression to check whether a list is empty or not
		System.out.println(grades.remove(0));//returns and removes an element from the index defined
		//grades.clear();//removes all the elements in the list
		System.out.println(grades);
		//To add elements to the list, we can use array to add elements
		List<Integer> marks = Arrays.asList(11,2,38,4,5,16,7);
		System.out.println(marks);
		
		//Iterating through the list using for loop
		/*
		 * for (int i=0; i<marks.size(); i++) { marks.set(i, marks.get(i)*5);
		 * System.out.println(marks.get(i)); }
		 */
		//for each loop
		for (int i : marks) {
			System.out.println(i);
		}
		
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(23,54,56,23,54));
		allGrades.add(Arrays.asList(253,44,66,263,124));
		allGrades.add(Arrays.asList(243,54,76,29,32));
		//iterating using the "for each" loop
		for (List<Integer> grade:allGrades) {
			for(int gra:grade) {
				System.out.print(gra+" ");
			}
			System.out.println();
		}
		//iterating using the "for" loop
		for (int i =0;i<allGrades.size();i++) {
			for(int j =0;j<allGrades.get(i).size();j++) {
				System.out.print(allGrades.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		// converting a list into an array
		int[] arr = new int[marks.size()];
		//adding elements of the list to an array using the for loop
		for (int i=0;i<marks.size();i++) {
			arr[i] = marks.get(i);
		}
		System.out.println(Arrays.toString(arr));
		
		//Sorting a list
		Collections.sort(marks);//sorts the list in ascending order
		Collections.reverse(marks);//reverses the elements in the list
		System.out.println(marks);
		
		
	}	
}
	
	

