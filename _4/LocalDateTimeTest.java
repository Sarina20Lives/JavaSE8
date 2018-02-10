import java.time.*;
import java.time.format.*;

public class LocalDateTimeTest{

public static void main(String...args){
	LocalDateTime myLocalDateTime = LocalDateTime.now();
	System.out.println("Hora y tiempo actual " + myLocalDateTime);

	LocalDate myLocalDate = LocalDate.now();
	System.out.println("Fecha actual " + myLocalDate);

	LocalTime myLocalTime = LocalTime.now();
	System.out.println("Tiempo actual " + myLocalTime);

	String strdate = myLocalDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
	System.out.println("Date in ISO_DATE_TIME format: " + strdate);

	String ldate = myLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	System.out.println("Formatted with LONG FormatStyle: " + ldate);

	String sdate = myLocalDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
	System.out.println("Formatted with SHORT FormatStyle: " + sdate);

	String fdate = myLocalDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	System.out.println("Formatted with FULL FormatStyle: " + fdate);

}
}
