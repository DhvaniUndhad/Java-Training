package oopsPresentationExample;

public class MultilevelInheritance extends parentB {
	
	public MultilevelInheritance(){
		System.out.println("Child class");
	}

	public void methodC() {
		System.out.println("Method of child class ");
	}
	public static void main(String[] args) {
		MultilevelInheritance child = new MultilevelInheritance();
		child.methodA();
		child.methodB();
		child.methodC();
		

	}

}

class grandParentA  {
	public grandParentA() {
		System.out.println("Grandparent class A");
	}
	
	public void methodA() {
		System.out.println("Methos of grandparent A");
	}

}

class parentB extends grandParentA{
	public parentB() {
		System.out.println("Parent class B");
	}

	public void methodB() {
		System.out.println("Method of parent B");
	}
	
}
