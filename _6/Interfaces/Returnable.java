public interface Returnable extends Evaluable{
	public void doReturn();
	//Equivalentes: 
	//	public abstract void doReturn();
	//	void doReturn();
	//Por defecto el compilador agrega a los métodos los modificadores de acceso public abstract, 
	// Todo método de una interfaz es public
	// Todo método de una interfaz 

	//Una interface puede heredar solo de una interfaz.

	public void doEvaluation();
}
