public class Shirt{
	public String description;
	public char colorCode;
	public double price = 20.0;


	public Shirt(){
		description = "--description required--";
		colorCode = 'U';
		price = 0.00;
		this.display();
	}

	public void display(){
		System.out.println("Shirt description: " + description);
		System.out.println("Color code: " + colorCode);
		System.out.println("Shirt price: " + price);
	}


}
