package filehandling;
import java.io.*;

//WAP to copy & paste data from one file to another
public class FileCpyPstIOStreamEx 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\AP.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\Haddop Commands.txt");
		int n;
		while((n=fin.read())!=-1)
		{
			fout.write(n);
		}
		
		System.out.println("Data Paste Successfully");
		fin.close();
		fout.close();
		
	}
	

}
