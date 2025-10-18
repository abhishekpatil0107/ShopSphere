package collection;
import java.util.*;
public class TreeMapEx 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1,"APple");
		map.put(3,"Mango");
		map.put(4,"Kop");
		//map.put(null,null);    //If key is null then it will give error
		map.put(5,"Kivi");
		map.put(21,"Banana");
		map.put(2,"Jackfruit");
		map.put(3,"Watermelon");
		
		System.out.println(map);
		
		for(Map.Entry m1: map.entrySet())
		{
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		System.out.println(map.get(5));
		
		System.out.println(map.getClass());
	}
	


}
