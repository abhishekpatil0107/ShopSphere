package collection;
import java.util.*;
public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>list=new ArrayList<Integer>();    //arraylist created
		list.add(100);
		list.add(300);
		list.add(null);
		list.add(0,4);
		list.add(null);
		list.add(400);
		list.add(300);
		list.add(10);
		list.add(20);
		
		System.out.println(list);
		
		Iterator<Integer>itr=list.iterator();  //to iterate till all element shift in the iterator object
		while(itr.hasNext())        //hasNext check more than one element exist or not in list
		{
			System.out.println(itr.next());    //only next element exist or not in list
		}
		
		System.out.println(list.contains(300));
		
		list.add(5,50);
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
	}

}
