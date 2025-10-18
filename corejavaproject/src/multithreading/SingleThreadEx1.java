//Write a program to create single thread print even number in between 1 to 50 & each number will print after 1 second later
package multithreading;

public class SingleThreadEx1 extends Thread
{
	public void run()
	{
		for(int i=2;i<=50;i+=2)   //i=i+2    //Take i=1 for odd numbers
		{
			try
			{
				System.out.println(i);
				this.sleep(500);   //1000=1 second   //We can use 'Thread' instead of 'this' 
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		SingleThreadEx1 s1=new SingleThreadEx1();
		s1.start();
	}

}
