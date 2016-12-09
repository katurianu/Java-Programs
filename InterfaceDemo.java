package Ooopsconsepts;
interface CircleInterface
{
	double pi = 3.14;
	void findArea();
	}
 class Circle1 implements CircleInterface {
	int r;
	public Circle1(int rad){
		r= rad;
	}
	
	@Override
	public void findArea() {
		System.out.println(pi*r*r);
		
	}
	public void disp()
	{
		System.out.println("circle disp..");
	}

}

public class InterfaceDemo {
	
		public static void main(String[] args)
		{
			CircleInterface c =  new Circle1(3);
			c.findArea();
		}
	
}
