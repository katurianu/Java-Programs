package com.practice;

public class LinearSearch {

	public static void main(String[] args) {
	
		int[] arr = {2,4,3,6,7};
		int num = 5;
		boolean found = true;
		
		for(int i= 0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				System.out.println("Number found: " + arr[i]);
				
				break;
			}
			else
			{
				found = false;
			}
			
		}
		if(!found)
		{
			System.out.println("Number not found");
		}

	}

}
