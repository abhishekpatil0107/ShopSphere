package collection;
import java.util.*;
public class LinkedHashSetEx
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer>list=new LinkedHashSet<Integer>();
		list.add(null);
		list.add(20);
		list.add(100);
		list.add(201);
		list.add(null);
		list.add(20);
		list.add(1);
		list.add(101);
		
		System.out.println(list);
		
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(list.size());
		
		list.remove(101);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains(17));
		
		list.addFirst(122);
		System.out.println(list);
		
		list.addLast(202);
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		
		list.remove(20);
		System.out.println(list);
		
		
		
	}
	

}
