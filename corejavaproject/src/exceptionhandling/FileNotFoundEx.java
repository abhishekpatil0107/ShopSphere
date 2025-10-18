package exceptionhandling;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class FileNotFoundEx
{
	public static void main(String[] args)
	{
		try
		{
			File f1=new File("C:\\Users\\Abhishek\\OneDrive\\Desktop\\Haddop Commands.txt");
			FileInputStream fin=new FileInputStream(f1);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("End");
		
	}

}
