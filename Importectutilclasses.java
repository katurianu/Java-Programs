package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Importectutilclasses {
	
	public void test()
	{
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(24);
		ll.add(243);
		ll.add(245);
		
		Collections.sort(ll);
		
		//list to array - call toarray method on u r arralist
		
		Object[] il = (Object[])ll.toArray();
		for (Integer i1 : ll)
		{
			System.out.println(il);
		}
	}

	public static void main(String[] args) {
		Importectutilclasses iu = new Importectutilclasses();
		
		iu.test();

	}

}
