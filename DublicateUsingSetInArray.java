package collections;

import java.util.HashSet;

public class DublicateUsingSetInArray {

	public static void main(String[] args) {
		String[] strArray = {"abc", "def", "mni", "xyz", "def", "abc"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is :" + arrayElement);
			}
		}

	}

}
