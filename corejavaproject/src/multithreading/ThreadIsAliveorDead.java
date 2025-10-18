package multithreading;

public class ThreadIsAliveorDead extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isAlive())
		{
			System.out.println("It is alive");
		}
		else
		{
			System.out.println("It is dead");
		}
	}
	public static void main(String[] args) 
	{
		ThreadIsAliveorDead ad=new ThreadIsAliveorDead();
		System.out.println(ad);
		ad.start();
		
	}

}
