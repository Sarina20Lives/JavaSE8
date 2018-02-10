public class Shirt extends Item{
	private int size;
	private boolean shortSleeve;
	public Shirt(double price, String desc, int size, boolean shortSleeve){
		super(desc, price);
		setSize(size);
		setShortSleeve(shortSleeve);
	}
	public int getSize(){ return this.size; }
	public boolean isShortSleeve(){ return this.shortSleeve; }
	public void setSize(int size){ this.size = size; }
	public void setShortSleeve(boolean shortSleeve){ this.shortSleeve = shortSleeve; }	
}