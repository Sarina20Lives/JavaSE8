import vehiculo.*;
import vehiculo.terrestre.*;
import vehiculo.aereo.*;

public class Test{
	public static void main(String ... args){
		VehiculoTerrestre vt = new VehiculoTerrestre("Toyota", "2.0", 4);
		vt.rodar();

		Vehiculo v1, v2, v3;
		v1 = new Vehiculo();
		v2 = new VehiculoTerrestre();
		v3 = new VehiculoAereo();
		imprimir(v1);		
		imprimir(v2);		
		imprimir(v3);		
		instanceOfVehicule(v1);		
		instanceOfVehicule(v2);		
		instanceOfVehicule(v3);		
	}

	public static void imprimir(Vehiculo v){
		v.mover();
	}

	public static void instanceOfVehicule(Vehiculo v){
		System.out.println("Instance of Vehiculo " + (v instanceof Vehiculo));
		System.out.println("Instance of Vehiculo Terrestre " + (v instanceof VehiculoTerrestre));
		System.out.println("Instance of Vehiculo Aereo " + (v instanceof VehiculoAereo));
		System.out.println("Instance of Object " + (v instanceof Object));

	}

}