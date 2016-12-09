package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CreateAlistofListStrings {

	public static void main(String[] args) {
		
		String sArray[] = new String[] {"Java 1","Unix 2","Sql 3"};
		
		List<String> lList = Arrays.asList(sArray);
		
		Iterator <String> iterator = lList.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		}

	

}
