package constructor;
import java.util.Scanner;
public class PowerOfNum 
{
	Scanner sc=new Scanner(System.in);
	int p,n;   //p=5,n=4   4*4*4*4*4
	int power=1;
	public PowerOfNum()
	{
		//n=num;   p=pow;
		System.out.println("Enter number :");
		n=sc.nextInt();
		System.out.println("Enter power : ");		
		p=sc.nextInt();
		for(int i=1;i<=p;i++)
		{
			power=power*n;   //1*4  //4*4  //16*4  //64*4
		}
		System.out.println("Power is : "+power);
	}
	
	public static void main(String[] args)
	{
		PowerOfNum p=new PowerOfNum();
		//PowerOfNum p1=new PowerOfNum(8,3);
		
	}

}
