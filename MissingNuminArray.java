package com.practice;

import java.util.Arrays;

public class MissingNuminArray {

	public static void main(String[] args) {
		
		//int[] array={1,2,3,4,6};
		//int missingNumber = getmissingNumber(array, 6);
		//System.out.printf("Missing number in array %s is %d %n",Arrays.toString(array),missingNumber);

	//}

	//private static int getmissingNumber(int[] array, int i) {
	//int actualSum = 0;
	//int n = 4;
	//int expectedSum = (n*(n+1)/2);
	//for(int i : array)
	//{
	//	actualSum = actualSum+i;
	//}
		//return  expectedSum-actualSum;
		
		int[] number = {10,20,35,45,50};
		
		int numToFind =10 ,i=0;
		
		while(i<number.length)
		{
			if(numToFind==number[i])
			{
				System.out.println("Missing number in Array is " + number[i] + " Index location is " + i);
				i++;
				break;
			}
			else
			{
				i++;
				continue;
			}
		}
	}

}
