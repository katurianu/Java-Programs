package com.practice;

public class ReplaceALetter {

		public static void main(String[] args) {
			
	String name = "America";
	System.out.println("String Leanth-->"  + name.length());
	System.out.println("String Leanth-->"  + name.toUpperCase());
	System.out.println("String Leanth-->"  + name.toLowerCase());

	name = name.replace('a', '0');
	System.out.println("name-->"  + name);


		}

	}


