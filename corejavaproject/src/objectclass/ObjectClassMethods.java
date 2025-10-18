package objectclass;

public class ObjectClassMethods
{
	public static void main(String[] args) 
	{
		String s="asd";
		ObjectClassMethods o=new ObjectClassMethods();
		
		System.out.println(o.getClass());
		System.out.println(s.getClass());
		
		System.out.println(o.hashCode());
		System.out.println(s.hashCode());
		
		String s1="asd";    //s1=s
		String s2="xyz";
		
		System.out.println(s1.equals(s2));	//false
		System.out.println(s1.equals(s));	//true
	}

}
