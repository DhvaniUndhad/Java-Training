package inheritance;

import java.util.Scanner;

public class CalculationTest extends Calculations {

	
	//protected int height = 18;
	//protected int width = 20;

	public void method() {

		System.out.println("This is super class number: " + super.height);

	}

	public static void main(String[] args) {

		CalculationTest test = new CalculationTest();
		System.out.println("This is sub class number: " + test.height);
		test.method();

		// Single inheritance
		Calculations obj = new Calculations();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a and b: ");
		System.out.println("Addition: " + obj.addition(scn.nextInt(), scn.nextInt()));
		System.out.println("Enter value of a and b: ");
		System.out.println("Multiplication: " + obj.multiplication(scn.nextInt(), scn.nextInt()));

		
		//Hierarchical inheritance
		Circle obj1 = new Circle();
		System.out.println("Enter radius: ");
		System.out.println("Area of circle: " + obj1.area(scn.nextInt()));
		
		
		Calculations object = new CalculationTest();
		System.out.println(object.height);

	}

}
