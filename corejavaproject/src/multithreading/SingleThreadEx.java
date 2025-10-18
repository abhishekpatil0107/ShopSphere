package multithreading;

public class SingleThreadEx extends Thread
{
	public void run()
	{
		for(int i=1;i<=1;i++)
		{
			System.out.println("Yess Info");
		}
	}
	public static void main(String[] args) 
	{
		SingleThreadEx s1=new SingleThreadEx();
		s1.start();
		for(int a=1;a<=1;a++)
		{
			System.out.println("Pune");
		}
		
	}

}
