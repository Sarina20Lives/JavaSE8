package com.nabenik.shopping;
public class ShoppingCart{
	int [] enteros;

	public static void main(String[] args){

		//Whithout objects
		/*
		String custName = "Mary Smith";
		String message;
		double price = 21.99;
		int quantity = 2;
		double tax = 1.04;

		String items[] = {"Shirt", "Belt", "Scarf", "Skirt"};
		message = custName + " wants to purchase " + items.length + " items";
		for(String item : items){
			System.out.println(item + " con precio " + (price * quantity * tax));	
		}
		System.out.println(message);
		*/
		Customer customer01 = new Customer();
		Customer customer02 = new Customer();
		System.out.println(customer01.name);
		System.out.println(customer02.name);

		Item item01 = new Item();
		item01.id = 34433;
		item01.description = "item01";
		item01.quantity = 12;
		item01.price = 123.99;
	
		Item item02 = new Item();
		item02.id = 234555;
		item02.description = "item02";
		System.out.println(item01.id + item02.description);

		ShoppingCart sc = new ShoppingCart();
		int[] enteros = new int[3];
		for(int ent : sc.enteros){
			System.out.println(ent);
		}
		

		
	
	}
}



