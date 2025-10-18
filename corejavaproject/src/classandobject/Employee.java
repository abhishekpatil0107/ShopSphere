package classandobject;

public class Employee {
	int eid=1;
	String name="Abhi";
	long mobno=2145638568;
	String address="Pune";
	String desig="Developer";
	String dept="Web Development";
	int sal=60000;
	
	public static void main(String[] args) {
		System.out.println("Employee details are : ");
		Employee emp=new Employee();
		System.out.println("Employee ID : "+emp.eid);
		System.out.println("Name        : "+emp.name);
		System.out.println("Contact     : "+emp.mobno);
		System.out.println("Address     : "+emp.address);
		System.out.println("Designation : "+emp.desig);
		System.out.println("Department  : "+emp.dept);
		System.out.println("Salary      : "+emp.sal);
		
	}
	

}
