package oopsPresentationExample;

public abstract class Bear extends Animal {

	
	@Override
	public void sound() {
		System.out.println("Bear sound");
	}
	
	public void eat() {
		System.out.println("Bear eats grass");
	}

}
