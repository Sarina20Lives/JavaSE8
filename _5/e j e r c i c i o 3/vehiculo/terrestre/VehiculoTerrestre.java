package vehiculo.terrestre;
import vehiculo.*;

public class VehiculoTerrestre extends Vehiculo{
	int cantidadRuedas;

	public VehiculoTerrestre(){}
	
	public VehiculoTerrestre(String modelo, String motor, int ruedas){
		super(modelo, motor);
		this.cantidadRuedas = ruedas;
	}

	public void rodar(){
		System.out.println("Ruedas: " + cantidadRuedas + "Modelo: " + modelo + " Motor: " + motor);
	}

	public void mover(){
		System.out.println("Ando rodando bajo");
	}



}