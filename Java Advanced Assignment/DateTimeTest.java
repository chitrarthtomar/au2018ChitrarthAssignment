import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeTest {
	public static void main(String args[]) {
		Date date = new Date();
		DateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
		

		dataFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String PST = dataFormat.format(date);
		System.out.println("Date in Paris Timezone : "+PST);
		
		dataFormat.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
		String MST = dataFormat.format(date);
		System.out.println("Date in Mexico Timezone : "+MST);
		
		dataFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		String LST = dataFormat.format(date);
		System.out.println("Date in London Timezone : "+LST);
		
		dataFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = dataFormat.format(date);
		System.out.println("Date in Indian Timezone : "+IST);
		
		dataFormat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		String AST = dataFormat.format(date);
		System.out.println("Date in Sydney Timezone : "+AST);
		
		
		
		
		
	}

}
