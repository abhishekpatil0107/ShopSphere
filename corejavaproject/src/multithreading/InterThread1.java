package multithreading;

public class InterThread1 extends Thread
{
	int num;
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			try
			{
				this.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		InterThread1 i=new InterThread1();
	}
}


class Thread1 extends Thread
{
	InterThread1 i1;
	
	Thread1(InterThread1 i1)
	{
		this.i1=i1;
	}
	public void run()
	{
		i1.printTable(5);
	}
}