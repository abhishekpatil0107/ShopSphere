package collection;
import java.util.*;

public class HashSetEx
{
	public static void main(String[]args) 
	{
		HashSet<String>set=new HashSet<String>();
		set.add(null);
		set.add("PineApple");
		set.add("Watermelon");
		set.add("Graphes");
		set.add("Banana");
		set.add(null);
		set.add("Apple");
		set.add("Mango");
		set.add("Mango");
		set.add("Orange");
		
		System.out.println(set);
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(set.size());
		System.out.println(set.hashCode());
		set.remove("Mango");
		System.out.println(set);
		
		set.add("Kiwi");
		System.out.println(set);
		
		System.out.println(set.contains("Graphes"));
	}


}
