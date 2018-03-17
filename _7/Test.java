public class Test{
	public static void main(String...args){
		Demo demo1 = new Demo();
		try{
			demo1.operar();
		}catch(MyException ae){
			System.out.println("He caído en una ArithmeticException");
		}
	}
}
