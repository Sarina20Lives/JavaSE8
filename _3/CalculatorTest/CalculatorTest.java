public class CalculatorTest{
	public static void main(String[]args){
		int totalOne = Calculator.sum(2,3);
		System.out.println("The total is " + totalOne);

		float totalTwo = Calculator.sum(15.99F,12.85F);
		System.out.println("The total is " + totalTwo);

		float totalThree = Calculator.sum(2,12.85F);
		System.out.println("The total is " + totalThree);
	}
}
