package collection;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 
{
	public static void main(String[] args)
	{
		LinkedHashSet<String>list=new LinkedHashSet<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add(null);
		list.add("Five");
		list.add("Six");
		list.add(null);
		
		System.out.println(list);
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(list.size());
		
		list.remove("Six");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains("Fifty"));
		
		list.addFirst("122");
		System.out.println(list);
		
		list.addLast("202");
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		
		list.remove(20);
		System.out.println(list);
		
		
		
	}

}
