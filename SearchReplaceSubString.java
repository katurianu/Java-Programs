package com.practice;

public class SearchReplaceSubString {

	public static void main(String[] args) {
		
		String str = "This is a search and replace of substring example";
		System.out.println("The original String is: " + str);
		
		String searchword = "search";
		String replaceword = "find";
		
		int startIndexval = 0;
		int endIndexval = 0;
		
		startIndexval = str.indexOf(searchword);
		
		endIndexval = startIndexval + searchword.length();
		
		if(startIndexval != -1)
		{
			str = str.substring(0, startIndexval) + replaceword + str.substring(endIndexval);
			System.out.println("The modified string is: " + str);
					
		}
		else
		{
			System.out.println("There is no match found");
		}

	}

}
