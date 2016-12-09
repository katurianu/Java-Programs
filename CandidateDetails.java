package com.practice;

public class CandidateDetails {
	
	boolean isRegisterd;
	int id;
	String name;
	String email;
	
	int register(int userId,String userName,String useremail)
	{
		id = userId;
		name = userName;
		email = useremail;
		
		return userId;
		
	}
	
	void display()
	{
	System.out.println(email);
	  System.out.println("id is " + id + "name is "+ name);
	}

	public static void main(String[] args) {
		
		CandidateDetails CD = new CandidateDetails();
		CD.register(101, "Anu", "katurianu@hotmail.com");
		
		CD.display();
		

	}

}
