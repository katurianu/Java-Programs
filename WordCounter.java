package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("readword.txt");
		Scanner fileInput = new Scanner(f);
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		while(fileInput.hasNext())
		{
			String nextWord = fileInput.next();
			if(words.contains(nextWord))
			{
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index) + 1);
			}
			else
			{
				words.add(nextWord);
				count.add(1);
			}
		}
		
		fileInput.close();
		
		f.close();
		
		
		for(int i=0; i< words.size(); i++)
		{
			System.out.println(words.get(i) + " occurred " + count.get(i) + "times");
		}

	}
   
}
