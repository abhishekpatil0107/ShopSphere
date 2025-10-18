package multithreading;

public class RunableInterfaceEx implements Runnable
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			try
			{
				System.out.println("MH");
				Thread.sleep(500);       //we cannot use 'this' at 'Thread' in runable
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		RunableInterfaceEx s1=new RunableInterfaceEx();
		Thread th=new Thread(s1);
		th.start();
		
	}

}
