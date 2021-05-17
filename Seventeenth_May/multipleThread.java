
public class multipleThread implements Runnable{

	public static void main(String[] args) {
		Thread t1 = new Thread("thread1");
		Thread t2 = new Thread("thread2");
		Thread t3 = new Thread("thread3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.getName()+" is running");
		System.out.println(t2.getName()+" is running");
		System.out.println(t3.getName()+" is running");

	}

	@Override
	public void run() {
		
	}

}
