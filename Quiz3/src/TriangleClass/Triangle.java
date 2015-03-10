package TriangleClass;

public class Triangle extends GeometricObject {
//Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	
//A no-arg constructor that creates a default triangle.
	public Triangle() {
	
	}
//A constructor that creates a triangle with the specified side1, side2, and side3.
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	
	}
//The accessor methods for all three data fields.
	public double getSide1() {
		return side1;
		
	}
	public double getSide2() {
		return side2;
		
	}
	public double getSide3() {
		return side3;
		
	}
//A method named getArea() that returns the area of this triangle.
	public double getArea() {
		//Below is Heron's formula for solving area of triangle
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s*(s-side1) * (s-side2) * (s-side3));
		return area;
		
	}
//A method named getPerimeter() that returns the perimeter of this triangle.
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
		
	}
//A method named toString() that returns a string description for the triangle.
@Override
	public String toString() {
		//Shortcut using "Source" tab to "Generate toString()" and selecting the following below:
		return "Triangle [getSide1()=" + getSide1() + ", getSide2()="
				+ getSide2() + ", getSide3()=" + getSide3() + ", getArea()="
				+ getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
}
