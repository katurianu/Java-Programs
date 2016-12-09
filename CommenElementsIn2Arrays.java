package com.practice;

public class CommenElementsIn2Arrays {

	public static void main(String[] args) {
		int[] arr1 = {4,3,5,10,20};
		int[] arr2 = {10,4,30,6,8,7};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
