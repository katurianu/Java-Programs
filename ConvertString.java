package com.practice;

public class ConvertString {

	public static void main(String[] args) 
	{
		
			
			String s = "This is nice";
			String s1 = "1 2 3";
			StringBuffer buffer = new StringBuffer();
			
			String[] str = s.split(" ");
			String[] str1 = s1.split(" ");

			for(int i=0;i<str.length;i++)
			{
				buffer.append(str[i]);
				buffer.append(str1[i]);
			}
			System.out.println("\n Original string: " + s);
			System.out.println("\n Modified string: " + buffer.toString());
		}


	}


