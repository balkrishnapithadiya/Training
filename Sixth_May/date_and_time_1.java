import java.text.SimpleDateFormat;
import java.util.Date;
public class date_and_time_1 {

	public static void main(String[] args) {
		Date obj = new Date();
		String format = "dd-MM-yyyy a hh:mm:ss";
		SimpleDateFormat obj1 = new SimpleDateFormat(format);
		System.out.println(obj1.format(obj));
	}

}
