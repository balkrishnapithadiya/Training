import java.io.IOException;

public class runStopExecution implements Runnable{
	boolean continueThread=true;
	public void run()
    {
         try
         {
        	 while(continueThread)
        	 {
               System.out.println(Thread.currentThread().getName()+" is Running");
               Thread.sleep(300);
        	 }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }
	public static void main(String[] args) {
		runStopExecution obj = new runStopExecution();
        Thread t = new Thread(obj);
        t.start();

        System.out.println(Thread.currentThread().getName()
                 +" thread waiting for user to press enter");
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        obj.continueThread = false;

        
	}

}
