package com.practice;

import java.util.Scanner;

public class MuitiDimentionalArrays {

	public static void main(String[] args) {
		
		int [][] multiArray = new int[3][2];
		
		int numToFind = 0;
		multiArray[0][0] = 10;
		multiArray[0][1] = 20;
		
		multiArray[1][0] = 100;
		multiArray[1][1] = 200;
		
		multiArray[2][0] = 50;
		multiArray[2][1] = 60;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the search number please");
		numToFind = s.nextInt();
		
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(multiArray[i][j]== numToFind)
				{
					System.out.println("Number Found is = " + multiArray[i][j]);
				}
			}
		}
		

	}

}
