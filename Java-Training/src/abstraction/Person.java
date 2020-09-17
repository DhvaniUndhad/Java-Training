package abstraction;

import Interfaces.Shape;

public abstract class Person implements Shape{
	public final String university = "New York University";

	//Concrete method
	public void work() {
		System.out.println("HOD Person is working at " + university);
	}


	public abstract void cook();

	public abstract void teach();

	public abstract void ride();

}
