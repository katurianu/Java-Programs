package com.practice;

public class Printstarpattren2 {

	public static void main(String[] args) {
		//int i,j,k;
		for(int i =4;i>=1;i--)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k =4; k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
