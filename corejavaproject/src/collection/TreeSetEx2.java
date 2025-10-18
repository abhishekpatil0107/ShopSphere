package collection;
import java.util.*;

public class TreeSetEx2
{
	
		public static void main(String[] args) 
		{
			TreeSet<Integer>set=new TreeSet<Integer>();
			set.add(100);
			set.add(300);
			set.add(900);
			set.add(700);
			set.add(300);
			set.add(200);
			set.add(800);
			set.add(100);
			
			System.out.println(set);
			System.out.println("Ascending Iterator");
			Iterator<Integer>itr=set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("Descending Iterator");
			Iterator<Integer>itr1=set.descendingIterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			System.out.println(set.size());
			System.out.println(set);
			System.out.println(set.remove(300));
			
			System.out.println(set.isEmpty());
			
			set.add(500);
			System.out.println(set);
			
			System.out.println("PollFirst method is Below");
			System.out.println(set.pollFirst());
			
			System.out.println("PollLast method is Below");
			System.out.println(set.pollLast());
			
			System.out.println(set);
			System.out.println(set.size());
			System.out.println(set.removeAll(set));
			System.out.println(set);
		}

	}

