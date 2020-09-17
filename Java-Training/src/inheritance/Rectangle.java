package inheritance;

public class Rectangle extends CalculationTest {

	public void area() {
		//Taking values from super classes either from CalculationTest OR calculations 
		// Reason: Multilevel inheritance
		
		System.out.println(super.height * super.width);

	}

	public static void main(String[] args) {
		// Multilevel inheritance
		Rectangle rec = new Rectangle();
		// System.out.println("Area of Rectangle: " + rec.area());
		rec.area();
		System.out.println("Accessing addition method of parent class:" + rec.addition(2, 9));
		System.out.println("value of pi is: " + rec.pi);

	}
}
