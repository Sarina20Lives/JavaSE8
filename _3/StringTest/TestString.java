public class TestString{

	public static void main(String...args){
		Numero a,b;
		a = new Numero();
		b = new Numero();
		
		System.out.println("Ejemplo con Numero");

		//False, las direcciones de memoria no son las mismas.
		System.out.println(a==b);

		//False, para objetos que no sean String, equal también compará la dirección de memoría a menos que yo implemente mi propia versión de equals
		System.out.println(a.equals(b));
		
		//True		
		System.out.println(a.elNumero == b.elNumero);

		//No compila por que no existe el método equal para variables de tipo primitivo.
		//System.out.println(a.elNumero.equals(b.elNumero)); 
		
		//En la clase Numero, no existe un new para String, por tanto apunta al pool, ambas en la misma posición
		System.out.println(a.elNombre == b.elNombre);
		
		//Los valores son los mismos
		System.out.println(a.elNombre.equals(b.elNombre));
		

		Numero2 c,d;
		c = new Numero2();
		d = new Numero2();

		System.out.println("Ejemplo con Numero2");

		//false
		System.out.println(c==d);
		//true		
		System.out.println(c.equals(d));
		//true		
		System.out.println(c.numero == d.numero);
		//false		
		System.out.println(c.nombre == d.nombre);
		//true
		System.out.println(c.nombre.equals(d.nombre));
		//true
		System.out.println(c.nombre2 == d.nombre2);
		//true
		System.out.println(c.nombre2.equals(d.nombre2));
		//true
		System.out.println(c.nombre3 == d.nombre3);
		//null pointer exception
		//System.out.println(c.nombre3.equals(d.nombre3));

		System.out.println("Ejemplo con Numero3");

		Numero3 x,y,z;
		x = new Numero3();
		y = new Numero3();
		z = y;
		//false
		System.out.println(x==y);
		//true
		System.out.println(z==y);
		//false
		System.out.println(x.equals(y));
		//true
		System.out.println(z.equals(y));
		//true
		System.out.println(x.elNumero == y.elNumero);
		//true
		System.out.println(z.elNumero == y.elNumero);
		//false
		System.out.println(x.nombre == y.nombre);
		//true
		System.out.println(x.nombre.equals(y.nombre));
		//false
		System.out.println(x.nombre2 == y.nombre2);
		//true
		System.out.println(x.nombre2.equals(y.nombre2));
		//true
		System.out.println(z.nombre2 == y.nombre2);
		//true
		System.out.println(z.nombre2.equals(y.nombre2));	
	}
}
