package exceptionhandling;
import java.io.*;
public class ThrowEx 
{
	public static void main(String[] args) throws IOException,ArithmeticException,Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String: ");
		String s1=br.readLine();
		System.out.println("String is: "+s1);
		
	}

}
