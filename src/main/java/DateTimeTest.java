import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTimeTest {
	public static void main(String[] args) throws ParseException {
		
		Date date = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("22-06-2012 04:46");
		System.out.println("Date is: "+date);
	}

}
