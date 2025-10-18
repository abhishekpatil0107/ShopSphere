package keywords;

public class Student {
	int rollno;
	String name;
	static String course;
	
	public Student(int rollno,String name)
	{
		super();
		this.rollno=rollno;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Course name : "+course);
	}
	
	public static void main(String[] args)
	{
		Student s=new Student(1,"ASD");
		course="Java FullStack";   //static field can be accessed without object
		s.show();
		
		System.out.println();
		
		
		course="Data Science";   //we can change the value of static variables
		Student s1=new Student(2,"ERT");
		s1.show();
		Student s2=new Student(3,"DJF");
		s2.show();
		Student s3=new Student(4,"KFH");
		s3.show();
	}

}
