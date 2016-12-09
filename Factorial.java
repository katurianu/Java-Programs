package com.practice;

public class Factorial {
	
	
	int fact(int num)
	{
		int result = 1;
		
		for(int i =num;i>1;i--)
		{
			result = result * i;
		}
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
		int r = f.fact(6);
		
		
		
		System.out.println("The result is :" + r);
	}

}
