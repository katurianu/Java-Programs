package collections;

public class Createpairofsum {
	public static void findpairs(int inputArray[], int inputnum)
	{
		System.out.println("Pairs of elements of sum is "+inputnum+ " are : ");
		for(int i =0; i<inputArray.length; i++)
		{
			for (int j = i+1; j < inputArray.length; j++)
			{
				if(inputArray[i]+inputArray[j] == inputnum)
				{
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputnum);
				}
			}
		}
	}

	public static void main(String[] args) {
		findpairs(new int [] {2,4,3,1,6}, 5);

	}

}
