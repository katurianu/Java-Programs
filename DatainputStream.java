package IO;

import java.io.DataInputStream;
import java.io.IOException;

public class DatainputStream {

	public static void main(String[] args) throws IOException {
		
		//int a,b,c;
		
		System.out.println("Enter two integers to calculate their multiplication :");
		DataInputStream in = new DataInputStream(System.in);
		String s = in.readLine();
		int a = Integer.parseInt(s);
		 int b = Integer.parseInt(s);
		int c = a* b;
		
		System.out.println("multiplication of two numbers is :" + c);
		
		//String s = new String();
		
		//float f = Float.valueOf(s).floatValue();
		//System.out.println(f);

	}

}
