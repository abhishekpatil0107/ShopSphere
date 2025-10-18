package multithreading;

class DigitThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(20000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class CharThread implements Runnable
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class DiigitAlphabetThreadEx 
{
	public static void main(String[] args)
	{
		DigitThread dd=new DigitThread();
		Thread td=new Thread(dd);
		td.start();
		
		CharThread cc=new CharThread();
		Thread tc=new Thread(cc);
		tc.start();
		
		
	
		
	}

}
