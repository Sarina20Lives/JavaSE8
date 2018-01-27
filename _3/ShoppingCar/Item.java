public class Item{
	private char color;
	private String desc;
	private int quantity;
	private double price;
	private int id;
	private static int nextId = 0;

	public Item(){
		setId();
		desc = "Esta es la descripción";
		price = 0.0;
		System.out.println("El objeto " + id + " ha sido construido");	
	}

	public void setId(){
		this.id=nextId++;
	}

	//Agregando método de acceso para atributo privado
	public char getColor(){
		return this.color;	
	}
	//Overloading no permitido, dado que existe otro método con la misma firma (mismo nombre, mismo tipo de parametro y misma cantidad de parametros)
	//public void setColor(char c){
	//	this.color = c;	
	//}

	public boolean setColor(char c){
		if((c>='a' && c<='z') ||
			(c>='A' && c<='Z') ||
			(c>='0' && c<='9')){
			this.color = c;
			return true;		
		}
		return false;
	}

	public void display(){
		System.out.println("Color: " + this.color + " Descripción: " + this.desc + " Cantidad: " + this.quantity + " Precio: " + this.price); 
	}

	//Overloading Methods of SetItemsFields
	public void setItemsFields(char c, int q, String d){
		this.color = c;
		this.quantity = q;
		this.desc = d;
	}

	public void setItemsFields(char c, int q, String d, double p){
		this.color = c;
		this.quantity = q;
		this.desc = d;
		this.price = p;
	}
}
