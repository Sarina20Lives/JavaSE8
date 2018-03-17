public class Test{
	public static MyInterface generarObjeto(){
		MyInterface s1 = new MyClass();
		return s1;
	}

	public static MyInterface generarObjeto2(){
		//Clase Anonima
		MyInterface s2 = new MyInterface(){
			public void saluda(String saludo){
				System.out.println(saludo);
			}
		};
		return s2;
	}

	public static MyInterface generarObjeto3(){
		//Lambda

		// V1
		// MyInterface s3 = (String saludo) -> { System.out.println("Hacer algo funcional"); };

		// V2
		MyInterface s3 = (saludo) -> System.out.println(saludo);
		return s3;
	}

	public static void main(String...args){
		generarObjeto().saluda("Hola por implementación");
		generarObjeto2().saluda("Hola por clase anonima");
		generarObjeto3().saluda("Hola desde lambdas");
	}

}
