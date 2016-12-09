package Ooopsconsepts;

public abstract class shapeandmethods {
	
	public abstract double area(); //Abstact method
	public abstract double circum(); //semicolon instead of body
}

class Circle extends shapeandmethods 
{
	public static final double PI = 3.1415;
	protected double r;
	public Circle(double r) { this.r = r;}
	public double getRadius() { return r;}
	public double area() { return PI*r*r;}
	public double circum() {return 2*PI*r;}
}

class Rectangle extends shapeandmethods
{
	protected double w, h;
	public Rectangle(double w, double h)
	{ this.w = w; this.h = h;}
	public double getWidth() {return w;}
	public double getHeight() {return h;}
	public double area() { return w*h;}
	public double circum() { return 2*(w+h);}
	}


