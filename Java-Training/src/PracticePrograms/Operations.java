
package PracticePrograms;

import java.util.Scanner;

public class Operations {
	public final String plus = "plus";
	public final String divide = "divide";
	public final String minus = "minus";
	public final String multiply = "multiply";

	public double calculate(double num1, double num2, String operation) {
		switch (operation.toLowerCase()) {
		case "plus":
			return num1 + num2;
		case "minus":
			return num1 - num2;
		case "multiply":
			return num1 * num2;
		case "divide":
			return num1 / num2;
		default:
			throw new AssertionError("Invalid operation");
		}

	}

	public static void main(String[] args) {
		Operations opr1 = new Operations();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter operation: ");
		String operation = scan.next();
		System.out.println("Enter num1: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter num2: ");
		double num2 = scan.nextDouble();
		System.out.println("Result: " + opr1.calculate(num1, num2, operation));
	}
}
