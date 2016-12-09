package com.practice;

public class AddingNum
{

	public static void main(String[] args)
	{
		int a=5;
		int b=4;
		
		AddingNum AN = new AddingNum();
		int sum = AN.addsum(a, b);
		
		System.out.println("adding two numbers" + sum);	
		
	}
	public int addsum (int n,int n1)
	{
		return n + n1;
	}
	
}