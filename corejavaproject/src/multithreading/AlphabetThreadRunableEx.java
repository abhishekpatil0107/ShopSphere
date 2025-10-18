package multithreading;

public class AlphabetThreadRunableEx implements Runnable 
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			try
			{
				System.out.println(ch);
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		AlphabetThreadEx s1=new AlphabetThreadEx();
		Thread th=new Thread(s1);
		th.start();
	}

}
