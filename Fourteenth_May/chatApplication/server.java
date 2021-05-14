package chatApplication;
import java.io.*;
import java.net.*;
public class server {

	public static void main(String[] args) {
		try
		{
			try (ServerSocket sersock = new ServerSocket(3000)) {
				System.out.println("Server  ready for chatting");
				  Socket sock = sersock.accept( );                          
				  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
				  OutputStream ostream = sock.getOutputStream(); 
				  PrintWriter pwrite = new PrintWriter(ostream, true);
				  InputStream istream = sock.getInputStream();
				  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

				  String receiveMessage, sendMessage;               
				  while(true)
				  {
				    if((receiveMessage = receiveRead.readLine()) != null)  
				    {
				       System.out.println(receiveMessage);         
				    }         
				    sendMessage = keyRead.readLine(); 
				    pwrite.println(sendMessage);             
				    pwrite.flush();
				  }
			}
		}catch (IOException e)
		{
			System.out.print(e);
		}
	}

}
