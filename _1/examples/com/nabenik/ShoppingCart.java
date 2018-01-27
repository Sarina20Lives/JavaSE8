package com.nabenik;

public class ShoppingCart{

	public static void main(String args[]){

	// System.out.println("Hola desde ShopppingCart class");;


	//Topics de String --------------------------------------------------------

/*
		String __ = null;
		String $ = "Hola";
		String v3 = $ + " " + "Mundo";
		double num = 1_98_98.98;
		System.out.println(num);
		System.out.println(v3);
		System.out.println(""+ 40 + 7 + 8 + __ + v3 + caracter); 
		System.out.println(num / 0); //Infinity
*/

	//Pre y Post Incremento --------------------------------------------------

/*
		int a;
		int b = 10;
		a = b++;
		System.out.println(a);
		a = ++b;
		System.out.println(a);
*/

	//If Example ------------------------------------------------------------

		String customerName = "Mary Smith";
		String itemDesc = "Shirt";

		//numeric fields
		double price = 21.99;
		int quantity = 1;
		double tax = 1.04;
		double total = 0.0;
		String message = customerName + " quiere comprar " + quantity + " " + itemDesc;

		boolean outOfStock = (quantity < 1);	
	
		if(quantity > 1)
			message += "s";

		if(outOfStock){
			System.out.println("Items no disponibles");		
		}else{
			System.out.println(message);
			total = quantity * price * tax;
			System.out.println("El costo total es: "+ total);
		}	
	}
}
