package com.practice;

public class StringImmutableEX {

	public static void main(String[] args) 
	{
		String s1 = new String("JAVA");
		System.out.println(s1);
		s1.concat("J2EE");
		System.out.println(s1);
	}

}
