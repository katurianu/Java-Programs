package com.practice;

public class StringImmutableExample {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("Memory of Str Hello" + str.hashCode());
		String str2 = "Hello";
		System.out.println("Memory of str2 Hello"+str2.hashCode());
		str = "Hello world";
		System.out.println("Memory of str Hello"+str);
		String str1 = new String("Hello");
		System.out.println("Memory of str1 with new :" + str1.hashCode());
		String str3 = new String("Hello");
		System.out.println("Memory of str3 with new :" + str1.hashCode());
	
		System.out.println("give you the charecter at the index : " + str.charAt(0));
		System.out.println("give you the substring from the current index and till last index value character : " + str.substring(0));
		System.out.println("give you the length  : " + str.length());
		System.out.println("give you the equal methods : " + str.equals(str2));
		System.out.println("give you the equals ignore case : " + str.equalsIgnoreCase(str2));
		
		str.concat("!!!");
		str = str + "Hello" .concat("!!!");
		String s = "Hello" + "Welcome to java" + " programing";
		
		System.out.println(str);
		System.out.println(s);
	}

}
