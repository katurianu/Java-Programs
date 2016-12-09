package com.practice;

import java.util.Scanner;

public class EvenOrOddWOutmodulusandDevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a number to check even or odd");
		number = n.nextInt();
		
		if((number &1)==0)
		{
			System.out.println(+number+ " is even number");
			
		}
		else
			{
				System.out.println(+number+ " is odd number");
			}
		
	}

}
