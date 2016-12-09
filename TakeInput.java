package com.practice;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		System.out.println("Hi, how are you today.");
		System.out.print(name);

	}

}
