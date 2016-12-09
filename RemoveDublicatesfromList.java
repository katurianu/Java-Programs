package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDublicatesfromList {

	public static void main(String[] args) {
		List<String> duplicateList = (List<String>) Arrays.asList("katuri" , "katuri", "manne", "chekoori");
		
		System.out.println("size of Arraylist with duplicates: " + duplicateList.size());
	       
		System.out.println(" Arraylist with duplicates: " + duplicateList);
		
		 LinkedHashSet<String> listToSet = new LinkedHashSet<String>(duplicateList);
		 
		 List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
		 
		 System.out.println("size of ArrayList without duplicates: " + listToSet.size());
	        System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);

	
	}

}
