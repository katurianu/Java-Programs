package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class FirstnonrepeatedChar {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner in = new Scanner (System.in);
		String s = in.nextLine();
		char ch = firstnonrepeatedchar(s);
		System.out.println("The first non repeated character is"+ch);

	}

	public static char firstnonrepeatedchar(String s) {
		HashMap<Character,Integer> character = new HashMap<Character,Integer>();
		int i,length;
		Character c;
		length=s.length();
		for(i=0;i<length;i++)
		{
			c=s.charAt(i);
			if(character.containsKey(c))
			{
				character.put(c,character.get(c)+1);
			}
			else
			{
				character.put(c,1);
			}
		}
		for (i=0;i<length;i++)
		{
			c=s.charAt(i);
			if(character.get(c)==1)
				return c;
		}
		//return null;
		return null;
	}

}
