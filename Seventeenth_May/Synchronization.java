
public class Synchronization extends Thread{
	
	public void print(int n)
	{
		synchronized(this)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.print(n+" ");
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.print(e);
				}
			}
		}
	}

	public static void main(String [] args)
	{
		Synchronization obj = new Synchronization();
		Thread t = new Thread() {
			public void run()
			{
				obj.print(3);
			}
		};
		Thread t1 = new Thread() {
			public void run()
			{
				obj.print(8);
			}
		};
		t.start();
		t1.start();
	}

}
