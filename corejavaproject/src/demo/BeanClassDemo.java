package demo;
import encapsulation.BeanClass;
public class BeanClassDemo extends BeanClass
{
	public static void main(String[] args)
	{
		BeanClass b=new BeanClass();
		System.out.println("Inside the bean 2 ");
//		System.out.println("Value of A is: "+b.a);   //compiler error coz of private field  
//		System.out.println("Value of x is: "+b.x);   //default field cannot access outside
//		System.out.println("Value of Z is: "+b.z);   //protected field
		System.out.println("Value of K is: "+b.k);
		
		
		BeanClassDemo d=new BeanClassDemo();
		System.out.println("Inside the bean 2...");
//		System.out.println("Value of A is: "+b.a);    //compiler error coz of private field
//		System.out.println("Value of x is: "+b.x);	  //default field cannot access outside
		System.out.println("Value of Z is: "+d.z);    //by using child class object
		System.out.println("Value of K is: "+b.k);
	}

}
