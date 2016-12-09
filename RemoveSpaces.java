package com.practice;

public class RemoveSpaces
{

	public static void main(String[] args) {
		
		{
			String str =  " String  with  multiple  space";
			
			String strWithoutSpace = str.replaceAll("\\s", " ");
			
			System.out.println(strWithoutSpace);
		}
		
	}
}
