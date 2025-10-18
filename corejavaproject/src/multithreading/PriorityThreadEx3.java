package multithreading;

public class PriorityThreadEx3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=1;i++)
		{
			try
			{
			System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId()+"\n"+Thread.currentThread().getPriority());
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
		PriorityThreadEx3 p1= new PriorityThreadEx3();
		p1.setName("Th1");
		p1.setPriority(10);  
		p1.start();
		
		PriorityThreadEx3 p2= new PriorityThreadEx3();
		p2.setName("Th2");
		p2.setPriority(5);  
		p2.start();
		
		PriorityThreadEx3 p3= new PriorityThreadEx3();
		p3.setName("Th3");
		p3.setPriority(8);  
		p3.start();
		
	}

}
