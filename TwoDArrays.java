package com.practice;

public class TwoDArrays {

	public static void main(String[] args) {
		int [] intArray = {11,12,13,14,15};
		  int [][] intTwoDArray = {{11,12,13},{21,22,23,24},{31,32,33,34,35}};
		  
		  for(int i = 0 ; i<intTwoDArray.length;i++) {
		   for (int j=0;j<intTwoDArray[i].length;j++) {
		   System.out.print("Two Dimension Output ->"+intTwoDArray[i][j]);
		   }
		   System.out.println(" ");
		  }

	}

}
