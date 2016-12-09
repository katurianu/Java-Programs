package com.practice;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello world");
		System.out.println(sb);
		sb.append("  programing");
		System.out.println(sb);
		
		if(sb.equals(sb))
		{
		System.out.println("The string buffer is same");
		}
		
		StringBuilder sbuild = new StringBuilder("Hi good day");
	}

}
