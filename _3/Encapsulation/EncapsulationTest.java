public class EncapsulationTest{

	public static void main (String ... args){
		Customer customer = new Customer();
		customer.setName("Sarina");
		System.out.println(customer.toString());

		Customer customer2 = new Customer("Esvin");
		System.out.println(customer2.toString());

		Customer customer3 = new Customer("Elizabeth Beneth", "ssn modificado desde un constructor");
		System.out.println(customer3.toString());
	}
	

}
