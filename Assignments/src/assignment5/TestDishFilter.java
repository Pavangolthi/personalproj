package assignment5;

import java.util.ArrayList;
import java.util.List;

public class TestDishFilter {
	public static List filterDishes(List<Dish> ufList, IFilterCondition condition){
		List filteredDish = new ArrayList();
		
		for (Dish dish : ufList) {
			if(condition.filterDish(dish)) {
				filteredDish.add(dish.getName());
			}
		}
		return filteredDish;		
	}
	
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
		
		/*
		 * IFilterCondition filtercondition = new IFilterCondition() {
		 * 
		 * @Override public boolean filterDish(Dish dish) {
		 * 
		 * return dish.getDishtype().equals(DishType.MEAT); } };
		 */
		
		IFilterCondition condition = new IFilterCondition() {
			
			@Override
			public boolean filterDish(Dish dish) {
				// TODO Auto-generated method stub
				return dish.isVegetarian();
			}
		};
		
		IFilterCondition condition1 = new IFilterCondition() {
			
			@Override
			public boolean filterDish(Dish dish) {
				// TODO Auto-generated method stub
				return (dish.getDishtype().equals(DishType.MEAT)||dish.getDishtype().equals(DishType.FISH)) && dish.getCalories()>300;
			}
		};
		
		IFilterCondition condition2 = new IFilterCondition() {
			
			@Override
			public boolean filterDish(Dish dish) {
				// TODO Auto-generated method stub
				return dish.isVegetarian();
			}
		};
		
		
		ArrayList<String> filter =  (ArrayList) filterDishes(al, condition2);
		for (String dish : filter) {
			System.out.println(dish);
		}
		
		
	}
}
