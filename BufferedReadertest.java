package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadertest {

	public static void main(String[] args) {
		
		//File file = new File ("thirdFile.txt");
		
		//System.out.println("DO FILE EXIST ::"+file. exists());
		
		try {
			
			
			FileWriter fw =new FileWriter("fourth.txt");
			BufferedWriter wr = new BufferedWriter (fw);
			
			wr.write("This is using  my Bufferedwritter\n This is next line");
			wr.flush();
			wr.close();
			
           // System.out.println("create file::"+file.createNewFile());
			
			//System.out.println("DO FILE EXIST ::"+file. exists()); 
			
			FileReader fr = new FileReader("third.txt");
			
		
			BufferedReader br = new BufferedReader (fr);
			
			String str = br.readLine();
			System.out.println("READ THE FILE: " +str.toUpperCase());
			str = br.readLine();
			System.out.println("READ THE FILE: " +str.toUpperCase());
			str = br.readLine();
			
			try {
				System.out.println("READ THE FILE: " +str.toUpperCase());
			} catch (Exception e) {
                        System.out.println("there is an exception");
			}
			
			br.close();
			
			
		} catch (FileNotFoundException  e) {
			
			e.printStackTrace();
			
		}
		catch (IOException  e) {
			
			e.printStackTrace();
			
		}
	}

}
