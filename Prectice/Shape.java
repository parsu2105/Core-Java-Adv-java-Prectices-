package com.Prectice;

 abstract class ShapeOf {
 public abstract void calculateArea();
 void display() {
	 System.out.println("this is a shape");
 }
}
class Circle extends ShapeOf{
	double radius =5;
	@Override
	public void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle" + area);
	}
}
class Rectangle extends ShapeOf{
	double length =20;
	double breadth =4;
	public void calculateArea() {
		double area = length * breadth;
		System.out.println("Area of Rectangle =" +area);
	}
}

public class Shape{
	public static void main(String[] args) {
		Circle s1 = new Circle();
		s1.calculateArea();
		s1.display();
		Rectangle s2 = new Rectangle();
		s2.display();
		s2.calculateArea();
	}
}
