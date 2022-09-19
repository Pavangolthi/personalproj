package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDish {

	public static void main(String[] args) {
		ArrayList<Dish> al = new ArrayList<Dish>();
		
		al.add(new Dish("Pork Fry",false,800,DishType.MEAT));
		al.add(new Dish("Pepper Chicken",false,700,DishType.MEAT));
		al.add(new Dish("BBQ Ribs",false,600,DishType.MEAT));
		al.add(new Dish("French Fries",true,500,DishType.OTHER));
		al.add(new Dish("Double Cheese Pizza",true,400,DishType.OTHER));
		al.add(new Dish("Season Fruit",true,120,DishType.OTHER));
		al.add(new Dish("Salmon",false,500,DishType.FISH));
		al.add(new Dish("Prawns",false,300,DishType.FISH));
		al.add(new Dish("Rice Pudding",true,200,DishType.OTHER));
		al.add(new Dish("Milk Shake",true,150,DishType.OTHER));
		
		//Collections.sort(al);
		
		Comparator<Dish> comparator = new Comparator<Dish>() {

			@Override
			public int compare(Dish arg0, Dish arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
		};
		
		Collections.sort(al, comparator);
		for (Dish dish : al) {
			//System.out.println(dish);
		}
		
		ArrayList<Dish> caloriesFilter = new ArrayList<Dish>();
		caloriesFilter=filterCalories(al);
		System.out.println("Filter");
		for (Dish dish : caloriesFilter) {
			//System.out.println(dish);
		}
		
		System.out.println("\n\nVegetarian Dishes:");
		ArrayList<String> filteredDishNames = filterDishNames(al);
		for (Object object : filteredDishNames) {
			System.out.println(object.toString());
		}
		
		System.out.println("\n\nMEAT Type Dishes");
		ArrayList<Dish> fMeatDishes = filterMeatDishes(al);
		for (Dish dish : fMeatDishes) {
			System.out.println(dish);
		}
		
		System.out.println("\n\nMEAT and FISH dishes with calories greater than 300 calories");
		ArrayList<Dish> fcalDishes = filtercal(al);
		for (Dish dish : fcalDishes) {
			System.out.println(dish);
		}
		
		System.out.println("\n\nCalories greater than 500");
		ArrayList fcalDishes1 = fildishcal(al);
		
		
		for (Object object : fcalDishes1) {
			if(object instanceof String)
				System.out.print("Dish [name="+object);
			else if(object instanceof Integer)
				System.out.print(", calories="+object+"]\n");
		}
		 
		
	}
	
	public static ArrayList<Dish> filterCalories(ArrayList<Dish> l) {
		ArrayList<Dish> filterList = new ArrayList<Dish>();
		
		for (Dish list : l) {
			if(list.getCalories()>400) {
				filterList.add(list);
			}
		}
		return filterList;
	}
	
	
	public static ArrayList<String> filterDishNames(ArrayList<Dish> ufList) {
		ArrayList<String> filteredDishNames = new ArrayList<String>();
		
		for (Dish al : ufList) {
			if(al.isVegetarian()==true) {
				filteredDishNames.add(al.getName());
			}
		}
		return filteredDishNames;
		
	}
	
	public static ArrayList<Dish> filterMeatDishes(ArrayList<Dish> ufList) {
		ArrayList<Dish> filteredDishNames = new ArrayList<Dish>();
		
		for (Dish al : ufList) {
			if(al.dishtype.equals(DishType.MEAT) ) {
				filteredDishNames.add(al);
			}
		}
		return filteredDishNames;
		
	}
	
	public static ArrayList<Dish> filtercal(ArrayList<Dish> ufList) {
		ArrayList<Dish> filteredDishNames = new ArrayList<Dish>();
		
		for (Dish al : ufList) {
			if((al.getDishtype().equals(DishType.MEAT)|| al.getDishtype().equals(DishType.FISH)) && al.getCalories()>300) {
				filteredDishNames.add(al);
			}
		}
		return filteredDishNames;
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList fildishcal(ArrayList<Dish> ufList) {
		ArrayList filteredDishNames = new ArrayList();
		/*
		for (Dish al : ufList) {
			if(al.getCalories()>500) {
				filteredDishNames.add(al.getName());
				filteredDishNames.add(al.getCalories());
			}
		} */
		
		int i = 0;
		while(i<ufList.size()) {
			if(ufList.get(i).getCalories()>500) {
				filteredDishNames.add(ufList.get(i).getName());
				filteredDishNames.add(ufList.get(i).getCalories());
			}
			i++;
		}
		return filteredDishNames;
		
	}
	
	
}	


