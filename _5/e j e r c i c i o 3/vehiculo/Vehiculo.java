package vehiculo;

public class Vehiculo{
	
	String color;
	private String marca;
	public String modelo;
	protected String motor;

	public Vehiculo(){}
	
	public Vehiculo(String modelo, String motor){
		this.modelo = modelo;
		this.motor = motor;
	}

	public void mover(){
		System.out.println("Me muevo");
	}


}