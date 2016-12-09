package IO;

import java.io.File;
import java.io.IOException;

public class Testfile {


	public static void main(String[] args){
		
		File file = new File ("firstFile.txt");
		
		System.out.println("DO FILE EXIST ::"+file. exists());
		
		try {
			System.out.println("create file::"+file.createNewFile());
			
			System.out.println("DO FILE EXIST ::"+file. exists());
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
				
	}
}
