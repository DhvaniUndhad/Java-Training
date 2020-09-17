package inheritance;

public class Circle extends Calculations{
	
	double result;
	
	public double area(int radius) {
		
		result = pi*radius*radius;
		return result;
	}

}
