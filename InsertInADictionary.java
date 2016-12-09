package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsertInADictionary {
	
	public void Dictionary()
	{
		Set<String> linkedList = new TreeSet<String>();
		linkedList.add("take -> carry or bring with one");
		linkedList.add("jump -> move suddenly and quickly in a specified way");
		linkedList.add("walk -> an act of traveling or an excursion on foot");
		linkedList.add("run -> an act or spell of running");
		linkedList.add("dance -> move in a quick and lively way");
		linkedList.add("help -> serve someone with");
		linkedList.add("run -> an act or spell of running");
		
		for(String d : linkedList)
		{
			System.out.println(d);
		}
		
	}

	public static void main(String[] args) {
		InsertInADictionary obj = new InsertInADictionary();
		obj.Dictionary();

	}

}
