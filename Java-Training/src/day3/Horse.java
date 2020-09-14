package day3;

class Animal {
	public void sound() {
		System.out.println("All animal making sound");
	}

}

class Cat extends Animal {
	public void sound() {
		System.out.println("Cat sound: Meow");
	}

}

public class Horse extends Animal {
	public void sound() {
		System.out.println("Horse sounds: Neigh");
	}

	public static void main(String args[]) {
		Animal obj = new Horse();
		obj.sound();
		Animal obj1 = new Cat();
		obj1.sound();

	}

}
