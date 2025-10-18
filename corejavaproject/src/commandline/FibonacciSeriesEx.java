package commandline;

public class FibonacciSeriesEx 
{
	public static void main(String[] args) 
	{
		int no=Integer.parseInt(args[0]);
		int f1=0;
		int f2=1;
		int f3;   			// int f3=0;
		
		System.out.println(f1+"\n"+f2);
		for(int i=2;i<=no;i++)    		//for(int i=2;f3<=no;i++)
		{
			f3=f1+f2;
			if(f3<=no)
			{
				System.out.println(f3);
				f1=f2;
				f2=f3;
			}
			else
			{
				System.out.println();
			}
			
			
		}
		
	}

}
