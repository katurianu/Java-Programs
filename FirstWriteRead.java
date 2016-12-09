package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstWriteRead {

	public static void main(String[] args) {
		
		File file = new File ("secondFile.txt");
		
		System.out.println("DO FILE EXIST ::"+file. exists());
		
		try {
			
			//file.createNewFile();
			//FileWriter fr = new FileWriter(file);
			System.out.println("create file::"+file.createNewFile());
			
			System.out.println("DO FILE EXIST ::"+file. exists());
			//fr.write("HELLO! HOW ARE YOU TODAY");
			//fr.flush();
			//fr.close();
			
			//FileReader fread = new FileReader (file);
			//char[] ch= new char[30];
			//fread.read(ch);
			
			//for (char c:ch){
				//System.out.println(c);
				
			//}
			//fread.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
