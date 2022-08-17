package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy 
{

	// duplicate allowed
	// multiple null allowed
	// cursors--> iterator, listIterator 
	
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("vishal");
		al.add("date");
		al.add(12);
		al.add(12.43);
		al.add(null);
		al.add(12);
		al.add(12);
		al.add(null);
		
		System.out.println("==============================================");
		System.out.println(al);
		System.out.println("==============================================");
		System.out.println(al.contains(12));
		System.out.println("==============================================");
		//System.out.println(al.remove(2));
		System.out.println("==============================================");
		System.out.println(al);
		System.out.println("==============================================");
		System.out.println(al.isEmpty());
		System.out.println("======== Using for loop ========");

		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("======== Using For Each loop ========");
		
		for (Object r:al)
		{
			System.out.println(r);
		}
		
		System.out.println("======== Using Iterator ========");
		
		Iterator it = al.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("======== Using List Iterator ========");
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

				


		
		




		

	}

}
