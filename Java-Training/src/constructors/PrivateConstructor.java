package constructors;

public class PrivateConstructor {
	
	
	String city;
	long population;
	
	//creating private constructor so that no outside class can access it.
	private PrivateConstructor(){
		city = "Portland";
		population = 653115;
	}
	
	public static void main(String args[])     
	   {
		//Private constructor is only accessible within the same class.
		PrivateConstructor obj = new PrivateConstructor();
		System.out.println("Population of " + obj.city + " are:" + obj.population);
	   }
	
}


	
	

