package com.string;

public class StringClass
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2=new String("Program is here");
		
		System.out.println("String 1 is: "+s1);
		System.out.println("String 2 is: "+s2);
		
		System.out.println(s1.length());
		System.out.println(s2.charAt(1));
		System.out.println(s2.indexOf('s'));
		
//		String newString=s1.concat(s2);
//		System.out.println(newString);
		
		//System.out.println(s1+" is language");
		String nstring=s1+" Language ";
		System.out.println(nstring);
		
		System.out.println(nstring.substring(0));
		System.out.println(nstring.substring(2,9));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String str1="Java", str2="java", str3="Cpp";
		
		
		//equals: check the spelling and charactercase
		System.out.println(s1.equals(str1));     //true
		System.out.println(s1.equals(str2));	//false
		System.out.println(s1.equals(str3));	//false
		
		System.out.println(s1.equalsIgnoreCase(str1));
		System.out.println(s1.equalsIgnoreCase(str2));
		System.out.println(s1.equalsIgnoreCase(str3));
		
		System.out.println(s1.contains("va"));		//va=true,  Va=false
		
		s1=" Abhi Patil ";
		System.out.println(s1.trim());		//It trims initial & last blank spaces
	}

}
