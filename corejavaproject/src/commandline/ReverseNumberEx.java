package commandline;

public class ReverseNumberEx 
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int rev=0,rem;
		
		while(num!=0)  //546!=0,54!=0,5!=0,0!=0
		{
			rem=num%10;  //546%10=6,54%10=4,5%10=5
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is : "+rev);
		
	}

}
