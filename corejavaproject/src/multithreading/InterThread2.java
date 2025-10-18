package multithreading;
class Thread2 extends Thread
{
	InterThread1 i1;
	Thread2(InterThread1 i1)
	{
		this.i1=i1;
	}
	public void run()
	{
		i1.printTable(10);
	}
}

public class InterThread2
{
	public static void main(String[] args) 
	{
		InterThread1 ii=new InterThread1();
		Thread1 t1=new Thread1(ii);
		t1.start();
		Thread2 t2=new Thread2(ii);
		t2.start();
		
	}

}
