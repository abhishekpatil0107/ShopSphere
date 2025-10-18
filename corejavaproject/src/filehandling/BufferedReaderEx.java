package filehandling;
import java.io.*;
public class BufferedReaderEx 
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name here: ");
			String s1=br.readLine();
			System.out.println("Name: "+s1);
			System.out.println("Enter the digit here: ");
			int i1=Integer.parseInt(br.readLine());
			System.out.println("Enter the grade: ");
			String ch= br.readLine();
			
			
			System.out.println("Name:"+s1);
			System.out.println("Integer:"+i1);
			System.out.println("Character:"+ch);

		} 
		catch (Exception e) 
		{
			
		}
	}

}
