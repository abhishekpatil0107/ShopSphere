package filehandling;
import java.io.*;
public class FileUpperCaseEx 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New1.txt");
		byte b[]=new byte[fin.available()];
		fin.read(b);
		String s1=new String(b);
		s1=s1.toUpperCase();
		b=s1.getBytes();
		fout.write(b);
		System.out.println("Data paste successfully...");
		fin.close();
		fout.close();

//		fin.read(b);
//		String s1=new String(b);
//		s1=s1.toUpperCase();
//		b=s1.getBytes();
//		fout.write(b);
//		System.out.println("Data paste successfully...");
//		fin.close();
//		fout.close();
	}

}
