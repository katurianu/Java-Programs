package com.practice;

public class SumofonlyevennuminArray {

	public static void main(String[] args) {
		Object[] input = {4,5,'y','t',8,10,3,6};
		int evenSum(Object[] arr)
		{
			int sum = 0;
			if(null !=arr && arr.length>0)
			{
				for(int i=0; i<arr.length; i++)
				{
					int input1 = (int)arr[i];
					if(input1%2 == 0 && Character.isDigit(input1))
					{
						sum = sum+input1;
					}
				}
			}else{
				System.out.println("arr is empty or null-please provide valid input");
			}
			return;
		}
	}
}
