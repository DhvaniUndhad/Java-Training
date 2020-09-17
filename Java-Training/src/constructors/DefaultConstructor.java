package constructors;

public class DefaultConstructor {
	
	
	static int a;
	double x;
	boolean y;
	
	//Default constructor will be created at run-time
	
	static void method() {
		System.out.println("Static method is also accesible without creating an object.");
	}
	
	
	public static void main(String[] args) {
		//Creating abject of class
		a=50;
		System.out.println("Value of a can be accesible without creating an object becuase it is static.");
		System.out.println("a = " + a);
		method();
		
		//Object creation
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println("Values of x and y are: " + obj.x + " and " + obj.y);
	}

}
