package com.practice;

public class SubjectsName {

	public static void main(String[] args) {
		String Subjects[]= new String[5];
		
		 Subjects[0] = "Maths";
		 Subjects [1] = "science"; 
		 Subjects [2] = "social"; 
		 Subjects [3] = "English"; 
		 Subjects [4] = "Telugu"; 
		
		for (int i=0; i<5; i++)
		{
			System.out.println("The subject name is :" + Subjects [i]);
		}
		
       if (Subjects [1] == "science1")
       {
    	   System.out.println("True");
       }
       else if (Subjects [4] == "kannada")
       {
    	   System.out.println("No result found");
       }
       else 
       {
    	   System.out.println("False");
       }
	}

}
