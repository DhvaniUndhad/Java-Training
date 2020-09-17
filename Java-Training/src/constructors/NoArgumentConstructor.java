package constructors;

public class NoArgumentConstructor {
	
	String treeName;
	int numOfTree;
	static int total;
	static String area;
	
	static {
		total = 50;
		area = "Elmonica";
		System.out.println("Total trees in " + area + "are " + total);
	}
	//Default constructor
	 NoArgumentConstructor() {
		 this.treeName = "Pin cherry";
		 this.numOfTree = 5;
//		 this.total=60;
//		 this.area = "Beaverton";
	}
	
	

	public static void main(String[] args) {
		//Creating objects of class
		
		NoArgumentConstructor obj = new NoArgumentConstructor();
		System.out.println("There are " + obj.numOfTree + " trees of " + obj.treeName + " in your area.");
		
		
		
		
	}

}
