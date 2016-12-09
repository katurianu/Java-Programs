package IO;

import java.util.Scanner;

public class ConsoleDevide2Num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first value :");
		int x = s.nextInt();
		System.out.println("Enter second value :");
		int y = s.nextInt();
		
		s.close();
		
		int Quotient = x/y;
		
		System.out.println("Quotient is : "+ Quotient);
	}

}
