package oopsPresentationExample;

public class PolymorphismExample extends Test {
	public void display() {
		System.out.println("Polymorphism method");
	}

	public void method1(int n) {
		System.out.println(n + n);
	}

	public static void main(String[] args) {
		Test obj = new PolymorphismExample();
		obj.display();
		Test obj1 = new Test();
		obj1.display();

	}

}

class Test {
	public void display() {
		System.out.println("Overriding method");
	}

	public void method1(String n) {
		System.out.println("World");
	}
}
