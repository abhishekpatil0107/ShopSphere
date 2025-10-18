package multithreading;

public class SynchEx1 extends Thread
{
	int amount=10000;
	
	public synchronized void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			try 
			{
				System.out.println("Going to withdraw....");
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Perform Withdraw Op");
		this.amount=this.amount-amount;
		System.out.println("Withdraw Completed...");
	}
	
	
	public synchronized void deposit(int amount)
	{
		if(this.amount>0)
		{
			try 
			{
				System.out.println("Going to deposit");
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Perform Deposit Op");
		this.amount=this.amount+amount;
		System.out.println("Deposit Completed...");
	}
	

}
