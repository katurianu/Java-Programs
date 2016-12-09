package IO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class printwriter {

	

	public static void main(String[] args) {
		
		//FileWriter fw =new FileWriter("fourth.txt");
		//BufferedWriter wr = new BufferedWriter (fw);
		
		try {
			PrintWriter pw = new PrintWriter("fifth.txt");
			pw.println("Hey there");
			pw.println("Whats up");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 

	}

}
