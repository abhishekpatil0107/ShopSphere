package filehandling;
import java.io.*;
public class StudentDeserltnEx implements Serializable
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		StudentSerltnEx s1=new StudentSerltnEx();
		FileInputStream fout;
		try
		{
			fout=new FileInputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\NewFile.txt");
			ObjectInputStream obin=new ObjectInputStream(fout);
			s1=(StudentSerltnEx)obin.readObject();			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
		}
		System.out.println(s1.rollno+"\n"+s1.grade+"\n"+s1.name+"\n"+s1.per);

	}

}
