package day2;

public class Java {

	public String inheritence;
	public String polymorphism;
	public String abstraction;
	public String encapsulation;

	{
		inheritence = "Not described yet";
		polymorphism = "Not described yet";
		abstraction = "Not described yet";
		encapsulation = "Not described yet";
	}

	public static void main(String[] args) {
		Java java = new Java();

		java.inheritence = "Inheritence: The process by which one class(Child class) acquires the properties(Variables) and functionalities(Methods) "
				+ "of other class(Parent class)is called inheritence. Main aim of inheritence is to provide the reusability "
				+ "of code so a class(Child class) has to write only the unique features and rest of the common properties and functionalities"
				+ " can be extended from the onother class (parent class). To inherit a class we use extends keyword.";

		java.polymorphism = "Polymorphism: This OOPs feature allows us to perform a single action in different ways, which means that it allows you todefine one interface "
				+ "and have multiple implementations.Polymorphism has two types: Method Overloading and Method Overriding";

		java.abstraction = "Abstraction: A class that declared using a abstarct keyword called abstarct class , which means that it can have abstarct methods as well as "
				+ "non-abstarct methods (concrete methods). An abstract class can not be instansiated, which means you are not allowed to create object of it.";

		java.encapsulation = "Encapsulation: Main idea behind encapsulations is to hide the implementation details from users. This means binding(hiding) the variables(state) "
				+ "and methods(behaviour) together. If a data member is private it means it can only accessed within the same class. No outside class can accessed "
				+ "the private member of other class. To access the private data members and methods we need to set up getter and setter methods to update and read.";

		System.out.println(java.getOopsDescription(java.encapsulation));
	}

	public String getOopsDescription(String s) {
		return s;

	}

}
