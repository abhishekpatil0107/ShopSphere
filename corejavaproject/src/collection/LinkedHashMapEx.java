package collection;
import java.util.*;
public class LinkedHashMapEx
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String>list=new LinkedHashMap<Integer,String>();
		list.put(1,"India");
		list.put(50,"Russia");
		list.put(null, null);
		list.put(45, "Pak");
		list.put(43,"Brazil");
		list.put(100,"China");
		list.put(60,"SA");
		
		System.out.println(list);
		
		for(Map.Entry m1:list.entrySet())
		{
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		System.out.println(list.equals(45));
		
		list.size();
		System.out.println(list);
		
		list.put(75,"UK");
		System.out.println(list);
		
		list.remove(100,"China");
		System.out.println(list);
		
		list.containsValue("France");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.hashCode());
		
		list.replace(45,"India2");
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}
