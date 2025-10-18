package multithreading;

public class DemonThreadEx extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("It is Daemon Th");
		}
		else
		{
			System.out.println("It is not Daemon Th");
		}
	}
	
	public static void main(String[] args) 
	{
		DemonThreadEx d1=new DemonThreadEx();
		d1.setDaemon(true);
		d1.start();
		DemonThreadEx d2=new DemonThreadEx();
		d2.start();
		DemonThreadEx d3=new DemonThreadEx();
		d3.start();

	}

}
