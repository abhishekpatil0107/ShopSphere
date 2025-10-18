package commandline;

public class ArmstrongNumberEx 
{
	public static void main(String[] args)
	{
		int no=Integer.parseInt(args[0]);
		int temp=no;
		int sum=0,rem,cube;
		
		while(temp!=0)
		{
			rem=temp%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			temp=temp/10;
		}
		if(no==sum)
		{
			System.out.println("It is Armstrong number ");
		}
		else
		{
			System.out.println("It is not armstrong number");
		}
		
	}

}
