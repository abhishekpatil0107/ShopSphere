package collection;
import java.util.*;
public class HashMapEx 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(null, null);
		map.put(101,"MH");
		map.put(1,"Mumbai");
		map.put(12,"Pune");
		map.put(9,"Kolhapur");
		map.put(10,"Sangli");
		map.put(14,"PCMC");
		map.put(11,"Satara");
		map.put(6,null);
		map.put(13,"Solapur");
		map.put(null, null);
		map.put(6, "Raigad");
		
		for(Map.Entry m1: map.entrySet())
		{
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		
		map.entrySet();
		System.out.println(map);
		
		System.out.println(map.size());
		
		map.remove(14);
		System.out.println(map);
		
		map.remove(12,null);
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}

}
