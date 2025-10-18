package multithreading;

public class AlphabetThreadEx extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			try
			{
				System.out.println(ch);
				this.sleep(500);
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
		s1.start();
	}

}
