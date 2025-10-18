package commandline;
//write a program find factorial of 10;

public class FactorialEx 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);     //convert string array args into int array args is :
		int fact=1;
		
		while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("Fact number is : "+fact);
		
	}

}
