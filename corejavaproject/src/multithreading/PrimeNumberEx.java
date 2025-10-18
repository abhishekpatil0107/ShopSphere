package multithreading;

public class PrimeNumberEx implements Runnable
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			try 
			{
				Thread.sleep(null);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
