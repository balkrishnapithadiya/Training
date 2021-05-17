
public class allRunningThread extends Thread {

	public static void main(String[] args) {
		  allRunningThread t1 = new allRunningThread();
	      t1.setName("thread1");
	      t1.start();
	      ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
	      int noThreads = currentGroup.activeCount();
	      Thread[] lstThreads = new Thread[noThreads];
	      currentGroup.enumerate(lstThreads);
	      for (int i = 0; i < noThreads; i++)
	      {
	    	  System.out.println("Thread No:" + i + " & The Name of Thread is: " + lstThreads[i].getName());
	      }

	}

}
