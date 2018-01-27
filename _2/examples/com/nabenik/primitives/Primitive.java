package com.nabenik.primitives;
public class Primitive{
	public static void main(String[]args){
		//float pi = 3.1416; No compila,
		//Debido a que si no se específica un número con punto decimal se toma como double (64 bits), 
		//para especificar que es float (32 bits) se debe agregar la letra f o F al final del valor decimal.
		float pi = 3.1416f;
		System.out.println(pi);

		double price = 34.56;
		final int age = 27;
		price = price + age;
		//age = age + 1; No compila,
		//Debido a que la palabra final, establece a una variable para solo lectura, no se puede modificar su valor
		System.out.println(price);

		int num1= 55555;
		int num2= 66666;
		long num3;
		num3 = num1 * num2;
		System.out.println(num3); //-591337666 no es una salida correcta, debido a la promoción automática del producto obtenido.
	

		int num4= 55555;
		long num5= 66666; //Si existe un long, la promoción no procede, debido a que ya existe.
		long num6;
		num6 = num4 * num5;
		System.out.println(num6); //3703629630

		int num7= 7;
		int num8= 2; 
		double num9;
		num9 = num7 / num8;
		System.out.println(num9); //3.0, la división entre enteros da un entero, truncando el resultado, perdiendo exactitud

		int num10= 7;
		double num11= 2; 
		double num12;
		num12 = num10 / num11;
		System.out.println(num12); //3.5, la división no es truncada y el resultado es exacto

		short a,b,c;
		a = 1;
		b = 2;
		//c = a+b; Error de compilación, debido a que byte y short son automaticamente promovido a int, 
		//Si se quiere conservar el short se debe establecer un casteo
		c = (short) (a+b);
		System.out.println(c);

		int int1;
		long long1 = 23444;
		float float1 = 2.1f;
		char char1 = 'a';
		int1 = (int) long1;
		System.out.println("Valor long: "+long1+" Valor int: "+int1);

		



		
	}

}
