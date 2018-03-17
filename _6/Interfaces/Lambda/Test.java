public class Test{
	public static void funcionHightOrder(MyInterface comportamiento, String saludo){
		comportamiento.saluda(saludo);
	}

	public static void main(String...args){

		//Declarando una clase anonima
		MyInterface s2 = new MyInterface() {
			public void saluda(String saludo){
				System.out.println(saludo);
			}
		};
		funcionHightOrder(s2, "Hola, fui definido desde una clase anonima");

		//Declarando una lambda, es similar a haber declarado la clase anonima.
		MyInterface s1 = (saludo) -> {
			//Definiendo el contenido del método "saluda" que existe en MyInterface. 
			//Para lambdas solo se requiere colocar las instrucciones en esta sección.
			//No es necesario colocar la firma ni el tipo de parametros de los métodos.
			System.out.println(saludo);
		}; 					
		funcionHightOrder(s1, "Hola, fui definido desde lambda");

		funcionHightOrder((t)->System.out.println(t.toUpperCase()), "Sarina y Esvin");

	}

}
