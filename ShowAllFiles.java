package IO;

import java.io.File;

public class ShowAllFiles 
{

	public static void main(String[] args) 
	{
		File folder = new File("F:/Path");
		
		File[] files = folder.listFiles();
		
		for (File file : files)
		{
			System.out.println(file.getName());
		}

	}

}
