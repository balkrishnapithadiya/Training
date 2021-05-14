package chatApplication;
import java.io.*;
import java.net.*;
public class client {

	public static void main(String[] args) {
		try
		{
			try (Socket sock = new Socket("127.0.0.1", 3000)) {
				BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));    
				 OutputStream ostream = sock.getOutputStream(); 
				 PrintWriter pwrite = new PrintWriter(ostream, true);                
				 InputStream istream = sock.getInputStream();
				 BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
				 System.out.println("To Start the chat, type and press Enter key");
				 String receiveMessage, sendMessage;               
				 while(true)
				 {
				    sendMessage = keyRead.readLine();  
				    pwrite.println(sendMessage);       
				    pwrite.flush();                    
				    if((receiveMessage = receiveRead.readLine()) != null)
				    {
				        System.out.println(receiveMessage); 
				    }         
				 }
			}
		}catch(IOException e)
		{
			System.out.print(e);
		}

	}

}
