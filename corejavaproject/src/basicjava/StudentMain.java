package basicjava;

class Teacher
{
	int tid=123;
	String tadd;
	char tgrade;
	public void display()
	{
		System.out.println("Teacher ID:"+tid+"\nTaecgher add:"+tadd+"\nTeacher grade:"+tgrade);
	}
}
public class StudentMain
{
	int sal;
	long mobno=4898432167l;
	public void input()
	{
		System.out.println("Salary: "+sal+"\nMob No."+mobno);
	}
	
	public static void main(String[] args)
	{
		Teacher t1=new Teacher();
		t1.display();
		StudentMain sm=new StudentMain();
		sm.input();
		
		
	}

}
