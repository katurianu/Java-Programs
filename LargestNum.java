package com.practice;

public class LargestNum {
	
	public static void main(String[] args) {
	 int array[] = {30,80,20,5,10};
	 int index = array[0];
	 for(int i=1;i<array.length;i++)
	 {
		if(index<array[i])
		{
			index=array[i];
		}
	 }
      System.out.println(index);
	}

}
