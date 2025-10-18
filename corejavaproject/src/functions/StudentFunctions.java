package functions;
import java.util.Scanner;
public class StudentFunctions
{
	int rollno;
	String name;
	String address;
	double per;
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptStudentDetails()
	{
		System.out.println("Enter roll no : ");
		rollno=sc.nextInt();
		System.out.println("Enter name : ");
		name=sc.next();
		System.out.println("Enter Address : ");
		address=sc.next();
		System.out.println("Enter Per : ");
		per=sc.nextDouble();
	}
	
	public void showStudentDeatails()
	{
		System.out.println("Student Details are :");
		System.out.println("Roll no is :"+rollno);
		System.out.println("name is :"+name);
		System.out.println("Address is :"+address);
		System.out.println("Per is :"+per);
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Execution is started...");
		StudentFunctions s= new StudentFunctions();
		s.acceptStudentDetails();
		s.showStudentDeatails();
		System.out.println();
		StudentFunctions s1= new StudentFunctions();
		s1.acceptStudentDetails();
		s1.showStudentDeatails();
	}

}
