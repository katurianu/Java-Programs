package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Copycontentoffileintoanotherfile
{

	public static void main(String[] args)  
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		//Create an ArrayList object to hold the lines of input file
		
		ArrayList<String> lines = new ArrayList<String>();
		
		//Creating BufferedReader object to read the input file
		
		try {
			reader = new BufferedReader(new FileReader("C:/anujava/input.txt"));
		
		
		// Reading all the lines of input file one by one and adding them into ArrayList
		String currentLine = reader.readLine();
		while (currentLine != null)
		{
			lines.add(currentLine);
			currentLine = reader.readLine();
		}
		//Creating Bufferedwriter object to write into output file
		
		writer = new BufferedWriter(new FileWriter("C:/anujava/output.txt"));
		//Writing lines into output file
		for (String line : lines)
		{
			writer.write(line);
			writer.newLine();
		}
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			//Closing the resources
			try
			{
				if (reader != null)
				{
				 reader.close();	
				}
				if(writer != null)
				{
					writer.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
 
	}

}
