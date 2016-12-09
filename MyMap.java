package collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	public void testmaps()
	{
		Map<Integer,String> children = new HashMap<Integer,String>();
		children.put(1,"Rohit is 9 years");
		children.put(2,"Jayant is 5 years");
		children.put(3,"Yashwant is 3 years");
		
		for(Map.Entry<Integer, String> mp : children.entrySet())
			
		{
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}

	public static void main(String[] args) {
		MyMap map = new MyMap();
		map.testmaps();

	}

}
