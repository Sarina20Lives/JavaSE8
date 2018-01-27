public class Item{
	char color;
	String desc;
	int quantity;
	double price;

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
