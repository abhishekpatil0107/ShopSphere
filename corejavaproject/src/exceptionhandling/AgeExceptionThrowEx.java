package exceptionhandling;
import java.util.Scanner;
public class AgeExceptionThrowEx 
{
	int age;
//	AgeExceptionThrowEx(int age)
//	{
//		this.age=age;        //parameters are same then"this" keyword
//	}
	public void show()
	{
		try
		{
			if(age<18||age>90)
			{
				throw new AgeException();
			}
			else
			{
				System.out.println("Valid");
			}
		}
		catch(AgeException e)
		{
			e.InvalidAge();
		}
	}
	
	public static void main(String[] args) 
	{
		AgeExceptionThrowEx a1=new AgeExceptionThrowEx();   //(17)  Parmeters passed when parameters are same then"this" keyword
		a1.show();
	}

}
