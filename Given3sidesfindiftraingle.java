package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Given3sidesfindiftraingle {

	public static void main(String[] args) throws Exception {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter side a");
		a=Integer.parseInt(BR.readLine());
		System.out.println("Enter side b");
		b=Integer.parseInt(BR.readLine());
		System.out.println("Enter side c");
		c=Integer.parseInt(BR.readLine());
		
		if(a==b && b==c)
			System.out.println ("It is a Triangle");
		else if(a >= (b+c) || c>=(b+a) || b >= (a+c))
			System.out.println ("It is not a Traingle");
		else if ((a == b && b!=c) || (a!=b && c==a) || (c==b && c!=a))
			System.out.println ("It is equal 2 sides");
		else if (a!=b && b!=c && c!=a)
			System.out.println("It is 3 unequal sides");
		
	}

}
