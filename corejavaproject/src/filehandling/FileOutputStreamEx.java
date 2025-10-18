package filehandling;
import java.io.*;

public class FileOutputStreamEx
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\AP.txt");
//		fout.write(90);
//		System.out.println(fout);
		
		String s1="Abhishek Patil";
		byte b[]=s1.getBytes();
		fout.write(b);
		System.out.println("Data write successfully..."+fout);
		fout.close();
		}

}
