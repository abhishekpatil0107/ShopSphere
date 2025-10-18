package Practice;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");   
		int k=sc.nextInt();
		
		for(i=1;i<=k;i++)
		{
			if(k%i==0)
			{
				System.out.println(i);	
			}
			else
			{
			}	
		}
	}

}


