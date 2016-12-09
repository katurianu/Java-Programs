package collections;

public class SearchElement {

	public static void main(String[] args) {
		int[] array = {2,10,3,11,16};
		System.out.println("The contents of the Array are :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Array["+ i + "] = " + array[i]);
		}
		
		int searchelement = 15;
		int findindex = 1;
		
		for(int j=0;j<(array.length-1);j++)
		{
			if(array[j]==searchelement)
			{
				findindex=j;
				break;
			}
		}
		
		if(findindex!= 1)
		{
			System.out.println("The search element is : " + searchelement);
			System.out.println(" It is found in the array at position : " + findindex);
		}
		else
		{
			System.out.println(" The search element is not found in the array .");
		}

	}

}
