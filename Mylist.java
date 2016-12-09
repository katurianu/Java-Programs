package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mylist {
	
	public void arraylistEx()
	{
		//List cities = new ArrayList();
		
		//cities.add("Sanramon");
		//cities.add(234);
		
		List<String> cities = new ArrayList<String>();
		cities.add("Sanramon");
		cities.add("dublin");
		cities.add("pleaston");
		
		Iterator<String> itr = cities.iterator();
		
		//while(itr.hasNext())
		//{
		//	System.out.println(itr.next());
		//}
		
		for (int i=0; i<cities.size(); i++)
		{
			System.out.println(cities.get(i));
		}
		//System.out.println("Using enhanced for loop");
		//for(String city: cities)
	//	{
			//System.out.println(city);
		//}
		
		//List<Student> studentList = new ArrayList<Student>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mylist ml = new Mylist();
		ml.arraylistEx();
	}

}
