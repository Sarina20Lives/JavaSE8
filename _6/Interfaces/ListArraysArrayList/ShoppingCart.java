import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ShoppingCart{
	public static void main(String[] args){
		String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};
		/* 
			1. Covierte el array de dias en un arraylist
			2. Iterar sobre el array list, imprimiendo el domingo en mayusculas y los demás en minusculas
			3. Imprimir el array list con syso
		*/
		List<String> listDays = new ArrayList<>(Arrays.asList(days));
		for(String day : listDays)
			System.out.println(day.equals("sunday") ? day.toUpperCase(): day);
		System.out.println(listDays);

	}
}
