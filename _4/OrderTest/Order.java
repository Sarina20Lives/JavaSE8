public class Order{
	public static final char CORP = 'C';
	public static final char PRIVATE = 'P';
	public static final char NON_PROFIT = 'N';

	String name;
	double total;
	String stateCode;
	double discount;
	char custType;

	public Order(String name, double total, String stateCode, char custType){
		this.name = name;
		this.total = total;
		this.stateCode = stateCode;
		this.custType = custType;
		calcDiscountSW();
	}

	public String getDiscount(){
		return Double.toString(discount) + "%";
	}

	public void calcDiscountIF(){
		if(this.custType == NON_PROFIT){
			this.discount = (this.total>900) ? 10 : 8;
			return;
		}
		if(this.custType == PRIVATE){
			this.discount = (this.total>900) ? 7 : 0;
			return;
		}
		if(this.custType == CORP){
			this.discount = (this.total>500) ? 8 : 5;
			return;
		}
		this.discount = 0;
	}

	public void calcDiscountSW(){
		switch(this.custType){
			case NON_PROFIT:
				this.discount = (this.total>900) ? 10 : 8;
				break;
			case PRIVATE:
				this.discount = (this.total>900) ? 7 : 0;
				break;
			case CORP:
				this.discount = (this.total>500) ? 8 : 5;
				break;
			default:
				this.discount = 0;
				break;
		}

	}
}
