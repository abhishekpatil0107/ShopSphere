package commandline;

public class PrimeNumberEx 
{
	public static void main(String[] args) 
	{
		int no=Integer.parseInt(args[0]);
		int count=0;
		
		for(int i=2;i<no/2;i++)
		{
			if(no%i==0)
			{
				count=1;
				break;
			}
		}
		if(count==0)
		{
			if(no<=1)
			{
			System.out.println("Number is not prime");
			}
			else
			{
				System.out.println("Number is PRIME");
			}
			
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
	}

}
