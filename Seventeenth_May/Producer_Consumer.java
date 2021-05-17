import java.util.*;
public class Producer_Consumer{
	
	public static void main(String[] args) throws InterruptedException {
		p_c obj = new p_c();
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					obj.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
		t1.start();
		t.join();
		t1.join();
	}
	
	public static class p_c
	{
		LinkedList <Integer> ll = new LinkedList <> ();
		int capacity = 2;
		
		public void produce() throws InterruptedException
		{
			int produce=0;
			while(true)
			{
				synchronized(this)
				{
					while(ll.size()==capacity)
					{
						wait();
					}
					System.out.println("Producer produced-"+ produce);
					ll.add(produce++);
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException
		{
			while(true) 
			{
				synchronized (this)
				{
					while(ll.size()==0)
					{
						wait();
					}
					int consume = ll.removeFirst();
					System.out.println("Consumer consumed-"+consume);
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}

}


