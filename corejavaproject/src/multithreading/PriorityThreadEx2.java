package multithreading;

public class PriorityThreadEx2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=1;i++)
		{
			System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId()+"\n"+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args) 
	{
		PriorityThreadEx1 p1= new PriorityThreadEx1();
		p1.setName("Th1");
		p1.setPriority(10);  
		p1.start();
		
		PriorityThreadEx1 p2= new PriorityThreadEx1();
		p2.setName("Th2");
		p2.setPriority(5);  
		p2.start();
		
		PriorityThreadEx1 p3= new PriorityThreadEx1();
		p3.setName("Th3");
		p3.setPriority(6);  
		p3.start();
		
	}

}
