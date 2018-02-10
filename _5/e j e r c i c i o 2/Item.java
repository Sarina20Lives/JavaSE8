public class Item{
	private int id;
	private String desc;
	private double price;
	static int nextId = 1;

	public Item(){
		setId();
		setDesc("No description assigned.");
		setPrice(0.00);
	}

	public Item(String desc, double price){
		setId();
		setDesc(desc);
		setPrice(price);

	}

	public void display(){
		System.out.println("Item description " + getDesc());
		System.out.println("Id " + getId());
		System.out.println("Price "+ getPrice());
	}

	public int getId(){ return this.id; }
	public String getDesc(){ return this.desc; }
	public double getPrice(){ return this.price; }
	public void setId(){ this.id = nextId; nextId++; }
	public void setDesc(String desc){ this.desc = desc; }
	public void setPrice(double price){ this.price = price; }


}