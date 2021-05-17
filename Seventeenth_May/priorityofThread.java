
public class priorityofThread extends Thread {

	public static void main(String[] args) {
		priorityofThread t1 = new priorityofThread();
		priorityofThread t2 = new priorityofThread();
		priorityofThread t3 = new priorityofThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}
