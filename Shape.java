package Ooopsconsepts;

interface Shape {
	double getArea();
}
class Circle2 implements Shape { // using keyword "implements" instead of "extends"

	// private member variables
	private int length;
	private int width;
	
	// Contructor
	public Circle2(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString()
	{
		return "Circle[length= " + length + ",width=" + width + "]";
	}

	//Need to implement all the abstract methods defined in the interface
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
