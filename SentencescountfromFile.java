package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SentencescountfromFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("firstFile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		int sentencecount = 0;
		String count;
		String sentence = "?!.";
		try {
			while ((count = br.readLine()) != null)
			{
				for(int i = 0; i< count.length(); i++)
				{
					if (sentence.indexOf(count.charAt(i)) != -1)
					{
						sentencecount++;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//br.close();
		System.out.println("The number of sentences are :"+sentencecount);
	}

}
