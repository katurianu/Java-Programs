package com.practice;

public class Calcu 
{
	void sum(int a, int b)
	{
	int	c = a+b;
	System.out.println(c);
		
	}
	
	void sum(int a, int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	void sum(int a, int b,double c)
	{
		double d = a + b + c;
		System.out.println(d);
	}
	
	void sum (double a,double b)
	{
		double d = a+b;
		System.out.println(d);
	}
	
	public static void main(String[]args)
	{
		Calcu E = new Calcu();
		 E.sum(20, 40);
		 E.sum(10.5, 12.8);
		 E.sum(2, 3,2.5);
		 E.sum(30, 40,70);
		 
		 
		 int a = 100;
		 
		 if(a>100)
		 {
			 System.out.println("pong");
			 
		 }
		 else if (a==101)
		 {
			 System.out.println("true");
		 }
		 else 
		 {
			 System.out.println("ping");
		 }
		 
		 char r = 'B';
		 switch (r)
		 {
		 case 'A':
		 System.out.println('A');
		 
		 case 'C':
		 System.out.println('C');
		 
		 case 'd':
		System.out.println('d');
		
		 case 'B':
		System.out.println('B');
		
		default :
		System.out.println("default");
		
			 
		 }
	}
}