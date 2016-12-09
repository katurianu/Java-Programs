package com.practice;

public class ArrayEx {

	public static void main(String args[]) 
	{
		  String[] stringArray = {"A","B","C","D","A","B","C","D","A","B","C","D","A","B","C","D"};
		    System.out.println("stringArray.length-->"+stringArray.length);
		  for(int i =0;i<stringArray.length;i++)
		  {
		   System.out.println("I value-->"+i);
		   System.out.println("Value at "+i+"--"+stringArray[i]);
		  }
	}	  
}
