package classandobject;

public class Student {
	int rollno=1;
	String name="ABC";
	String address="Kolhapur";
	double per=90.23;
	int mobno=1234567896;
	
	public static void main(String[] args) {
		System.out.println("Student detaisls are: ");
		Student s=new Student();
		System.out.println("Roll no : "+s.rollno);
		System.out.println("Name  : "+s.name);
		System.out.println("Address : "+s.address);
		System.out.println("Percentage : "+s.per);
		System.out.println("Mobile No : "+s.mobno);
		
	}

}
