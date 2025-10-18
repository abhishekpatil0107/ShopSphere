package filehandling;
import java.io.*;
public class FileReaderEx
{
	public static void main(String[] args) throws IOException
	{
		 try 
		    {
		    FileReader fr = new FileReader("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New1.txt");
//		    int d=fr.read();
//		    System.out.println(d+"ReadSuccessfully...");
		    int n;
		    while((n=fr.read())!=-1)
		    {
		      System.out.print((char)n);
		    }
		    fr.close();
		    
		    } 
		    catch (FileNotFoundException e) 
		    {
		      
		      e.printStackTrace();
		    }  
		
	}

}
