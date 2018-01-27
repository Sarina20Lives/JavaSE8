public class Numero2{
	int numero = 1000;
	String nombre = new String("Sarina");
	String nombre2 = "Esvin";
	String nombre3;

	public boolean equals(Object b){
		return this.nombre2 == ((Numero2)b).nombre2;
	}	
}
