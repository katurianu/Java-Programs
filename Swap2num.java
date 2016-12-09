package com.practice;

public class Swap2num {
	

	void swap1(int a,int b)
	{
		   System.out.println("using third variable - value of A before swap: " + a);
		   System.out.println("using third variable - value of B before swap: " + b);
		   int c = a;
		    a = b;
		    b = c;
			   System.out.println("using third variable - value of A bfter swap: " + a);
			   System.out.println("using third variable - value of B after swap: " + b);	

		}
	
void swap2 (int a,int b)
	{
	   System.out.println("using two variables - value of A before swap: " + a);
	   System.out.println("using two variables - value of B before swap: " + b);
		   a = a+b;
		   b = a-b;
		   a = a-b;
		   System.out.println("using two variables - value of A bfter swap: " + a);
		   System.out.println("using two variables - value of B after swap: " + b);		   
	}

	public static void main(String[] args) {
		Swap2num s = new Swap2num();
		 s.swap1(5,6);
		 
		 Swap2num r = new Swap2num();
		 r.swap2(2, 9);
     
		 
	}

}
