package filehandling;
import java.io.*;
public class FileWriterEx 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New.txt");
	    fw.write("Yesss");
	    fw.write("infotech");
	    fw.write("Pune");
	    fw.write("&&&&&&&");
	    fw.append("Hadapsor");
	    System.out.println("Writing Successfully inside the file.....");
	    fw.close();
		
	}

}
