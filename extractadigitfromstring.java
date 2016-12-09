package com.practice;

public class extractadigitfromstring {

	public static void main(String[] args) {
		String a = "ghj7hj8k90";
		int sum = 0;
		String num = "";
		StringBuffer buff  = new StringBuffer();
		
		for(int i= 0; i<a.length(); i++)
		{
			char c = a.charAt(i);
			if(Character.isDigit(c))
			{
				
				num = num + a.charAt(i);
				buff.append(c);
			}
			else
			{
				if(!num.equals(""))
				{
					sum = sum + Integer.parseInt(num);
					num = "";
					
				}
				
			}
				
		}
		
	System.out.println("extract numbers sum is : " + sum);
	}

}
