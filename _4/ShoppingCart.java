public class ShoppingCart{
	public static void main(String...args){
		String name;
		int age;
		if(args.length<2){
			System.out.println("Error, no se han ingresado los argumentos necesarios");
			return;
		}
		name = args[0];
		age = Integer.parseInt(args[1]);
		System.out.println("Name: "+ name);
		System.out.println("Age: " + age);
		doPrint(new String []{"a","b"}, "Sarina", "Bolaños");
		doPrint(args);
		//Llamada ambigüa con método doPrint, versión 2 y versión 3
		//doPrint("java", "kotlin", "ecma-script");
		doPrint();
	}

	//Versión 1
	public static void doPrint(String... args){
		System.out.println("Parametros ...");
		for(String arg:args){
			System.out.println(arg);		
		}
	}

	//Versión 2
	public static void doPrint(String[] ints, String... args){
		System.out.println("Parametros [] ...");
		for(String arg:ints){
			System.out.println(arg);		
		}
	}
	
	//Versión 3
	public static void doPrint(String str, String... args){
		System.out.println("Parametros str ...");
		for(String arg:args){
			System.out.println(arg);		
		}
	}
}
