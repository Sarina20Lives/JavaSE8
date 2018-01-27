package com.nabenik.exercise_5_2;
public class Buy{
	public static void main (String...args){
		String[] names = {"Esvin González", "Syaoran Lee", "Masamune Takano"};
		int items = 5;
		int customer = 0;
		System.out.println("El customer quiere " + items + " items");
		if(customer<0 || names.length <= customer)
		  System.out.println("El customer indicado actualmente no existe");
		else
		  System.out.println(names[customer] + " ha comprado " + items + " items");
	}
}
