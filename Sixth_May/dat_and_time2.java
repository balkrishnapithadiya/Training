import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class dat_and_time2 {
	public static void main(String[] args) {  
        LocalDateTime now = LocalDateTime.now();   
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");  
        String formatDateTime = now.format(format);  
        System.out.println("Local Date And Time :" + formatDateTime);  
    }  
}
