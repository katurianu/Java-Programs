package collections;

import java.util.ArrayList;

public class Tocopyarraylisttoanarray
{

	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Random"); 
		System.out.println("Actual ArrayList :" + arr);
		String[] strarr = new String[arr.size()];
		arr.toArray(strarr);
		System.out.println("Created Array content :");
		for(String str:strarr)
		{
			System.out.println(str);
		}

	}

}
