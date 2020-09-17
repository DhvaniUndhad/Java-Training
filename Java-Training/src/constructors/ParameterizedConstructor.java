package constructors;

public class ParameterizedConstructor {
	//Instance vaiables
	String cafeName;
	int numOfCafe;
	
	static int NoOfstaff = 8;

	// Parameterized constructor
	public ParameterizedConstructor(String name, int num) {
		this.cafeName = name;
		this.numOfCafe = num;
	}
	
	public static void work() {
		System.out.println(NoOfstaff + " people are working in cafe." );
	}

	public static void main(String[] args) {
		//Calling static method 
		work();
		
		//Creating an object of class
		ParameterizedConstructor obj = new ParameterizedConstructor("Starbucks", 3);
		System.out.println("There are " + obj.numOfCafe + " " + obj.cafeName + " in your area.");
		

	}

}
