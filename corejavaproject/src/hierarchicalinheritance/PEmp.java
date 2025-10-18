package hierarchicalinheritance;
import java.util.Scanner;
public class PEmp extends Employee
{
	int bonus=1000;
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter eid : ");
		eid=sc.nextInt();
		System.out.println("Enter name : ");
		name=sc.next();
		System.out.println("Enter sal : ");
		sal=sc.nextDouble();
	}
	
	public void showEmp()
	{
		System.out.println("EID : "+eid);
		System.out.println("Name : "+name);
		System.out.println("Sal : "+sal);
		System.out.println("Bonus :"+bonus);
	}
	
	public static void main(String[] args)
	{
		PEmp p=new PEmp();
		p.accept();
		p.showEmp();
	}

}
