
public class fiboAndRev{

	public static void main(String[] args) throws InterruptedException {
		try {
		fibo fb = new fibo();
		fb.start();
		Thread.sleep(4000);
		reverse r1 = new reverse();
		r1.start();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
