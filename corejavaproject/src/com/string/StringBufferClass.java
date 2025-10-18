package com.string;

//thread-safe/synchronized/slower
//1.1
public class StringBufferClass
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Java Programming");
		
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
//		s1.append(" Language");
//		System.out.println("After append : "+s1);
		
//		System.out.println(s1.reverse());
//		
//		System.out.println(s1.deleteCharAt(0));
//			
//		System.out.println(s1.delete(0, 2));
		
//		System.out.println(s1.insert(2," language"));
//		System.out.println(s1.delete(2, 11));
		
//		System.out.println(s1.replace(0, 4, "Cpp"));
		
		StringBuffer s2=new StringBuffer("Java Programming");
//		System.out.println(s1.equals(s2));    //object class methods
		
		String str=s1.toString();
		String str2=s2.toString();
		
//		System.out.println(str.equals(str2));
		
		System.out.println(s1.compareTo(s2));
	}

}
