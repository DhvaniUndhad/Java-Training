package oopsPresentationExample;

// Dog class extends Animal class
public class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Woof");
	}

	public void eat() {
		System.out.println("Dog eats vegetables");
	}

	public static void main(String args[]) {
		// Create object of abstract class
		/*
		 * Animal obj2 = new Animal(); obj2.anotherMethod();
		 */

		Animal obj = new Dog();
		obj.sound();
		obj.anotherMethod();

		Dog obj1 = new Dog();
		obj.sound();
		obj1.eat();

	}

	@Override
	protected void run() {
		System.out.println("Dog run");
	}

}
