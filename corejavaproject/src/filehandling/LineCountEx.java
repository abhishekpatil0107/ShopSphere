package filehandling;
//WAP to create class file read file data and count how many lines are exist in the file 
//then print on console

import java.io.*;
public class LineCountEx
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Abhishek\\OneDrive\\Desktop\\New1.txt");
		BufferedReader br=new BufferedReader(fr);
		String s1;
		int count=0;
		while((s1=br.readLine())!=null)
		{
			count=count+1;
			System.out.println(s1+"\n"+count);
		}
		br.close();
		fr.close();
	}

}
