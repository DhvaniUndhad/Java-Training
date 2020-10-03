package Java8Example;

public class LambdaTester {

	public static void main(String[] args) {
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println("Addition: " + addition.operation(20, 40));

		MathOperation subtraction = (a, b) -> a - b;
		System.out.println("Subtractoin: " + subtraction.operation(30, 10));

		MathOperation multiplication = (a, b) -> (a * b);

		System.out.println("Multiplication: " + multiplication.operation(20, 8));

		MathOperation division = (a, b) -> a / b;
		System.out.println("Division: " + division.operation(50, 5));

	}

}

interface MathOperation {
	int operation(int a, int b);
}