package collections;

public class TestClass {
	
	public void testEquals()
	{
		String s1 = "good";
		String s2 = "good";
		
		
		Integer i1 =23;
		Integer i2 =33;
		
		Student st1 = new Student ("joel",1);
		Student st2 = new Student ("joel",1);
		
		System.out.println(st1.equals(st2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
