package collections;

import java.util.ArrayList;

public class CreateAnArraylistAndaddElements {

	public static void main(String[] args) {
	
		ArrayList<Integer> elements = new ArrayList<>();
		
		elements.add(5);
		elements.add(10);
		elements.add(15);
		
		int count = elements.size();
		System.out.println("number of times is " + count);
		
		for(int i = 0; i < elements.size(); i++)
		{
			int value = elements.get(i);
			System.out.println("Element is :" + value);
		}
		

	}

}
