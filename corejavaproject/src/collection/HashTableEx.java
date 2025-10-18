package collection;
import java.util.*;
public class HashTableEx 
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(1,"MH");
		map.put(102,"GA");
		map.put(3,"KA");
		map.put(8,"DL");
		map.put(15,"RJ");
		//map.put(null, null);       //Hash Table doesn't contain any 'null' value
		map.put(54,"GJ");
		map.put(45,"MP");
		//map.put(87, null);		 //Hash Table doesn't contain any 'null' value
		
		System.out.println(map);
		for(Map.Entry m1: map.entrySet())
		{
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		
		System.out.println(map.put(64,"AP"));
		
		System.out.println(map.containsKey(122));
		System.out.println(map.containsValue("PB"));
		
		map.replace(15,"HR");
		System.out.println(map);
		
		
		System.out.println(map.isEmpty());
		map.clear();
		
		System.out.println(map);
	}

}
