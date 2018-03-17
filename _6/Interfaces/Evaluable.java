public interface Evaluable{
	void doEvaluation();
	
	//Métodos default: son los únicos que pueden poseer código.
	default void doSomething(){
		System.out.println("Say Something, I'm giving up on you...");
	}
}
