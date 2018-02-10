public class Shirt extends Clothing{
	public int size;

	public Shirt(int size){
		this(size, "constructor 1");
	}

	public Shirt(int size, String constructor){
		//Aquí se hace la llamada implicita del constructor por defecto por Clothing
		System.out.println("Size: " + size + " Constructor 2 - " + constructor);
	}
}
