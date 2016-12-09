package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("B");
		al.add("D");
		al.add("C");
		al.add("E");
		al.add("A");
		
		System.out.print("Original contents of al : ");
		Iterator tr = al.iterator();
		while(tr.hasNext())
		{
			Object element = tr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			Object element = litr.next();
			litr.set(element + " ");
		}
		//System.out.print("Modified contents of al: ");
		tr = al.iterator();
		while(tr.hasNext())
		{
			Object element = tr.next();
			//System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.print("Reverse order is : ");
		while(litr.hasPrevious())
		{
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();

	}

}
