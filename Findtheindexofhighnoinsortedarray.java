package com.practice;

public class Findtheindexofhighnoinsortedarray 
{

	public static void main(String[] args)
	{
			int arr[] = {18,11,20,76,85};
			for (int i = 0; i<arr.length;i++)
			{
			if (i + 1 == arr.length)
				{
					System.out.println("high index number is :" + arr[i]);
				}
				else
				{
					System.out.println("index number is :"+ arr[i]);
				}
			}
			
				
		}
	}


