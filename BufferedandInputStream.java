package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedandInputStream {

	
	public static void main(String[] args) throws  IOException 
	{
		String str;
		int ivar1;
		int ivar2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer value :");
		str = br.readLine();
		ivar1 = Integer.parseInt(str);
		System.out.print("Enter another integer value :");
		ivar2 = Integer.parseInt(br.readLine());
		System.out.println("The integer value ivar1 : " + ivar1);
		System.out.println("The integer value ivar2 : " + ivar2);
		int sub;
		sub = ivar1 - ivar2;
		System.out.println("The diffrence of two numbers is : " + sub);
		
		
	    	  
	      
	}

}
