package collection;
import java.util.*;
public class ArrayListCharEx
{
	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<String>();    
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add(null);
		list.add("five");
		list.add("six");
		list.add(null);
		list.add("seven");
		list.add("eight");
		list.add("nine");
		System.out.println(list);
		
		Iterator<String>itr=list.iterator();  
		while(itr.hasNext())        
		{
			System.out.println(itr.next());    
		}
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		System.out.println(list.contains("Fifty"));
		
		list.remove(3);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		list.add("Abhi");
		System.out.println(list);
		
		
	}

}
