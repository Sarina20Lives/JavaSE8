package com.nabenik.shopping;
public class Customer{
	public String name = "Duke";
	public int customerId = 0;
	public String address;
	public int orderNum;
	public int age;
	public void displayCustomer(){
		if(name!="")
			System.out.println("Customer: " + name);
		else
			System.out.println("El nombre del customer no ha sido asignado aún..");
	}
}
