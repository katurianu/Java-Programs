package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TocreateHashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put( 9,"Dublin");
		hmap.put(10,"Sanramon");
		hmap.put(8,"Pleaston");
		
		Set set = hmap.entrySet();
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			 Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
		}

		 String var= hmap.get(10);
	      System.out.println("Value at index 2 is: "+var);

	}

}
