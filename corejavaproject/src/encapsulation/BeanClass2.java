package encapsulation;

public class BeanClass2 
{
	public static void main(String[] args)
	{
		BeanClass b=new BeanClass();
		System.out.println("Inside the bean 2");
//		System.out.println("Value of A is: "+b.a);    //compiler error coz of privaye field
		System.out.println("Value of x is: "+b.x);
		System.out.println("Value of Z is: "+b.z);
		System.out.println("Value of K is: "+b.k);
	}

}
