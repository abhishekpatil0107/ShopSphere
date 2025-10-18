package multithreading;

public class ThreadNameId extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println(Thread.currentThread().getId()
					+"\n"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)
	{
		ThreadNameId t1=new ThreadNameId();
		System.out.println(t1);
		t1.setName("Th1");
		t1.start();
		ThreadNameId t2=new ThreadNameId();
		t2.setName("Th2");
		t2.start();
		
	}

}
