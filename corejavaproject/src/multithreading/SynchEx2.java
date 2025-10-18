package multithreading;

public class SynchEx2 extends SynchEx1
{
	SynchEx1 ss=new SynchEx1();
	{
		new Thread()
		{
		public void run()
			{
			
				ss.withdraw(10000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				ss.deposit(1000);
			}
		}.start();
	}
	
	public static void main(String[] args)
	{
		SynchEx2 sn=new SynchEx2();
		sn.start();
		
		
	}
	
}
