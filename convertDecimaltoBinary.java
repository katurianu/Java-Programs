package com.practice;

public class convertDecimaltoBinary {
	
	public void convertBinary(int no)
	{
		int i = 0;
		int binary[] = new int [6];
		while(no > 0)
		{
			binary[i++] = no%2;
			no = no/2;
		}
		for (int y = i -1; y >=0; y--)
		{
			System.out.print(binary[y]);
		}
	}
	public static void main(String[] args) {
		convertDecimaltoBinary CDB = new convertDecimaltoBinary();
		System.out.print("Binary num for 8 is ::");
		CDB.convertBinary(8);
	}

}
