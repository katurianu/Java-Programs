package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords 
{
	public static void main(String[] args) 
	{
        System.out.print("Enter string to analyse:");

        Scanner sn = new Scanner(System.in);

        String input = sn.nextLine();

        // first let us split string into words

        String[] words = input.split(" ");

        // adds all words into a map

        // we also check whether the word is already in map!

        Map<String,String> wordMap = new HashMap<String,String>();
//        System.out.println("before word");
        String word;
        int count;
        for(int i=0;i<words.length;i++)
        {
            word = words[i].toUpperCase(); // for case insensitive comparison
            if(wordMap.get(word)!=null) 
            {

            	continue;
            }
            else
            {

                wordMap.put(word, word);
            }
            
            count = 1;
            			for(int j=i+1;j<words.length;j++)
            			{
            				if(words[i].equals(words[j]))
            				{
            					count++;
            				}
            			}
            if (count>1)
            {
            System.out.println(word +": "+ count);
            }

        }
	}
}
