public class OrderTest{
	public static void main(String...args){
		Order order = new Order("prueba", 500, "C6798", Order.CORP);	
		System.out.println("El descuento es: "+order.getDiscount());
	}

}
