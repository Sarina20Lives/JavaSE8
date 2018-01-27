public class Customer{
	private String name;
	private String ssn = "ssn no modificable";

	public Customer(){}

	public Customer(String name){
		this.name = name;
	}

	public Customer(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getSsn(){
		return this.ssn;
	}
	public String toString(){
		return "Name: " + this.name + " Ssn: " + ssn;
	}

}
