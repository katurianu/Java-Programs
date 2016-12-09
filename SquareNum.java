package com.practice;

public class SquareNum {
	
	public static void main(String[]args)
	{
		int a = 5;
		
		SquareNum SN = new SquareNum();
		int sq = SN.square(a);
		System.out.println("square num" + sq);
	}
   public int square (int n)
   
   {
	   return (n*n);
   }
   
}
