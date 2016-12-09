package IO;

import java.io.File;
import java.io.IOException;

public class ToShowAllFiles {

	public static void main(String[] args) {
		
		File dir = new File("New Directory");
		dir.mkdir();
		
		File file = new File("New Directory","test.txt");
		System.out.println("Do file exist :" + file.exists());
		try {
			System.out.println("Create file :" + file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Do file exist :" + file.exists());

	}

}
