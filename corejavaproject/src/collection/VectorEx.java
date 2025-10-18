package collection;
import java.util.*;
public class VectorEx
{
	public static void main(String[] args)
	{
		Vector<Integer>vec=new Vector<Integer>();
		vec.add(100);
		vec.add(200);
		vec.addElement(null);
		vec.addFirst(null);
		vec.add(300);
		vec.add(500);
		vec.containsAll(vec);
		vec.add(0,600);
		vec.indexOf(vec);
		vec.addElement(30);
		
		Iterator<Integer>itr=vec.iterator(); 
		while(itr.hasNext())        
		{
			System.out.println(itr.next());    
		}
		System.out.println(vec.capacity());
		
		System.out.println(vec.hashCode());
		
		System.out.println(vec.remove(6));
		System.out.println(vec);
		
		System.out.println(vec.toArray());
		
		vec.add(5,1);
		System.out.println(vec);
		
		vec.clear();
		System.out.println(vec);
	}

}
