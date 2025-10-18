package collection;
import java.util.*;
public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		LinkedList<Character>l1=new LinkedList<Character>();
		l1.add('A');
		l1.add(null);
		l1.add(null);
		l1.add('E');
		l1.add('I');
		l1.add('O');
		l1.add('U');
		l1.add(6,'P');
		l1.addFirst(null);
		l1.addLast('S');
		l1.add(5,'Y');
		Iterator<Character>i1=l1.descendingIterator(); 
		while(i1.hasNext())        
		{
			System.out.println(i1.next());    
		}
		System.out.println();
		System.out.println(l1.containsAll(l1));
		System.out.println();
		l1.add(7,'K');
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		System.out.println(l1.contains('S'));
		
		System.out.println(l1.isEmpty());
		
		
	}

}
