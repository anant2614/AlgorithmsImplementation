import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamps {
	public static void main(String gh[]) throws ParseException{
	    BigDecimal date1=new BigDecimal("15:31:23".split(":")[0]+"15:31:23".split(":")[1]);
	    System.out.println(date1.divide(new BigDecimal(100)));
	}
}
 	