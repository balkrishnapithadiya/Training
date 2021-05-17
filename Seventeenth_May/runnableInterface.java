
public class runnableInterface implements Runnable {

	public static void main(String[] args) {
		runnableInterface obj = new runnableInterface();
		Thread t = new Thread(obj);
		t.start();

	}

	@Override
	public void run() {
		System.out.println("Thread is created");  
		
	}

}
