package filehandling;
import java.io.*;
public class StudentSerltnEx implements Serializable
{
	int rollno;
	String name;
	char grade;
	float per;

	public static void main(String[] args) throws FileNotFoundException
	{
		StudentSerltnEx s1=new StudentSerltnEx();
		s1.rollno=10;
		s1.name="Abhi";
		s1.grade='A';
		s1.per=90.22f;
		
//Below i want to perform serialization..
		//FileOutputStream fout;
		try 
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Abhishek\\OneDrive\\Desktop\\NewFile.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fout);
			ob.writeObject(s1);
			ob.close();
			fout.close();		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}

}
