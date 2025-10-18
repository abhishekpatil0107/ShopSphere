package filehandling;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamEx 
{
	public static void main(String[] args)  throws IOException
	{
		try 
		{
		FileInputStream fin=new FileInputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\AP.txt");
		int x=fin.read();		//To read single char from file
		System.out.println((char)x);
		int i;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
		fin.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
