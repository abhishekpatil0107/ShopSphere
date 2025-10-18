package com.string;
//non thread-safe/ faster/ unsynchronized
//1.5
public class StringBuilderClass 
{
	public static void main(String[] args)
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(78);
		System.out.println(s);
		
		System.out.println(s.reverse());
		
		System.out.println(s.length());
		System.out.println(s.capacity());
		
	}

}



