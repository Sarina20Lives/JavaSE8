public class ShoppingCar{
	public static void main(String...args){
		Shirt shirt1, shirt2;
		int y = 5;
		
		System.out.println(">-- Modificando Shirt");
		shirt1 = new Shirt();
		ShoppingCar sp = new ShoppingCar();
		sp.calculate(shirt1, y);
		sp.reCalculate(shirt1, y);

		System.out.println(">-- Trabajando con Item");
		Item item = new Item();
		if(item.setColor('B'))
			System.out.println("El nuevo color del item es: "+ item.getColor());
		else
			System.out.println("El código de color no es valido");

		System.out.println(">-- Usando sobrecarga de métodos OVERLOAD");
		item.setItemsFields('C', 4, "Sobrecarga 1");
		item.display();
		item.setItemsFields('D', 3, "Sobrecarga 2", 34.89);
		item.display();

		System.out.println(">-- Usando private atributes for Item");
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
	}



	public void calculate(Shirt s, double y){
		System.out.println(s.price * y);
		s.price = 25; 
		//La modificación se hace a nivel de referencia, el objeto no vuelve a ser el mismo..
		this.reCalculate(s,y);
	}

	public void reCalculate(Shirt s, double y){
		System.out.println(s.price * y);
	}
}
