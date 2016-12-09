package com.practice;

public class StringtoArray {

	public static void main(String[] args) {
		String example = null;
		byte[] bytes = example.getBytes();
		
		System.out.println("Text : " + example );
		System.out.println("Text [Byte Format] :" + bytes);
		System.out.println("Text [Byte Format] : " + bytes.length);
		
		String s = new String(bytes);
		System.out.println("Text Decryted : " + s);
		

	}

}
