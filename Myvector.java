package collections;

import java.util.Vector;

public class Myvector 
{
	public void vectorEx()
	{
	Vector<Integer> v1 = new Vector<Integer>();
	v1.add(23);
	v1.add(41);
	v1.add(32);
	System.out.println(v1.size());
	for(Integer i1 : v1)
	{
		System.out.println(i1);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myvector mv = new Myvector();
		mv.vectorEx();
	}

}
