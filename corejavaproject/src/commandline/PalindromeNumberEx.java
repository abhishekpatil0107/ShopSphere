package commandline;

public class PalindromeNumberEx 
{
	public static void main(String[] args)
	{
		int num1=Integer.parseInt(args[0]);
		int rem,temp=num1,rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num1==rev)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		
	}

}
