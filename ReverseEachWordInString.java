package com.practice;

import java.io.*;
public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s = "Hello Every One";
		StringBuffer buffer = new StringBuffer();
		
		String[] str = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			buffer.append(str[i]);
			buffer.append(" ");
		}
		System.out.println("\n Original string: " + s);
		System.out.println("\n Reverse word string: " + buffer.toString());
	}

}
