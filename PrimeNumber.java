package com.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 11;
		int r;
		boolean isprime = true;
		for(int i=2; i<a/2; i++)
		{
			r = a-(a/i)*i;
		if(r == 0)
		{
			isprime = false;
			break;
		}
			
		}
		if (isprime)
		{
			System.out.println("The number is primenum");
		}
		else
		{
			System.out.println("The number is not prime");
		}

	}

}
