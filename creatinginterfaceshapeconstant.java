package Ooopsconsepts;

public class creatinginterfaceshapeconstant 
{
 // constant PI is defined at the class level.
	static final double PI = 3.14;
	
	
	public static void main(String[] args) {
		
		// Local variables
		double radius, area;
		
		
		// Input radius from keyboard
		radius = Anu.inDouble("Enter radius: ");
		
		// Perform calculations and display result
		area = PI * (radius * radius);
		System.out.println("The area is : " + area);
	}

}
