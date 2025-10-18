package basicjava;

class StudFr
{
	int rollno;
	char grade;
	String name="ABC";
	public void display()
	{
		System.out.println("Roll No:"+rollno+"\nGrade:"+grade+"\nName:"+name);
	}
}

public class StudentEx 
{
	int rollno;
	char grade='A';
	String name="Abhi";
	double per=78.32;
	
	public void show()
	{
		System.out.println("RollNo: "+rollno+"\nGade:"+grade+"\nName: "+name+"\nPer"+per);
	}
	
	public static void main(String[] args)
	{
		StudentEx st=new StudentEx();
		st.show();
		StudFr sf=new StudFr();
		sf.display();
		
	}
	

}
