package collections;

import java.util.LinkedList;
import java.util.List;

public class LInkedList {
	public void Llist(){
	List<String> linkedList = new LinkedList<String>();
	linkedList.add("Anu");
	linkedList.add("Venkat");
	linkedList.add("Rohit");
	
	for(String ll:linkedList)
	{
		System.out.println(ll);
	}
	System.out.println("element removing :" + linkedList.size());
	System.out.println("element removed :" + linkedList.remove(1));
	System.out.println("size after moving :" + linkedList.size());
	}
	public static void main(String[] args) {
		LInkedList obj = new LInkedList();
		obj.Llist();

	}

}
