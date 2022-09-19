package com;

public class TestItem {

	public static void main(String[] args) {
		
		Item item = new Item(101,"IPhone",300);
		
		System.out.println("ItemId: "+item.getId());
		System.out.println("Name: "+item.getName());
		System.out.println("Price: "+item.getPrice());

	}

}
