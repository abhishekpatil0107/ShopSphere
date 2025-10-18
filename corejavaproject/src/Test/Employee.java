package Test;

import java.util.Scanner;

public class Employee
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int eid;
		int basicsal;
		int hra,ta,da,pf,gs;
		
		System.out.println("Enter EID: ");
		eid=sc.nextInt();
		
		System.out.println("Enter basic sal: ");
		basicsal=sc.nextInt();
		
		hra=(basicsal*(40/10));
		System.out.println("House Rent Allowance: "+hra);
		
		ta=(basicsal*(20/10));
		System.out.println("Travel Allowance: "+ta);
		
		da=(basicsal*(10/10));
		System.out.println("D Allowance: "+da);
		
		pf=(basicsal*(5/10));
		System.out.println("PF: "+pf);
		
		gs=(basicsal+hra+ta+da-pf);
		System.out.println("Gross Salary: "+gs);
		
	}

}
