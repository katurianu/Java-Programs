package com.practice;

public class Subtraction 
{

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 9;
		//int sub = a-b;
	Subtraction sb = new Subtraction();
	int sub = sb.result(a, b);
		System.out.println("result is :" + sub);

	}

	public int result (int n, int n1)
	{
		return n-n1;
	}
}
