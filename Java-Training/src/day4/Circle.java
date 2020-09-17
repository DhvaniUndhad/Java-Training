package day4;

import java.util.Scanner;

import Interfaces.Car;
import Interfaces.Shape;

//Interface Example
public class Circle implements Shape, Car {
	private double radius;
	public double pi = 3.14;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}

	@Override
	public double getArea() {

		return pi * this.radius * this.radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter radius: ");
		Shape shape = new Circle(scn.nextInt());
		shape.draw();
		System.out.println("Area of a circle: " + shape.getArea());

		System.out.println("Enter width and height: ");
		shape = new Rectangle(scn.nextInt(), scn.nextInt());
		shape.draw();
		System.out.println("Area of Rectangle: " + shape.getArea());

	}

	@Override
	public int area() {
		return 0;
	}

}

//Another Class
class Rectangle implements Shape {

	private double width;
	private double height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;

	}

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}

	@Override
	public double getArea() {

		return this.width * this.height;
	}

}
