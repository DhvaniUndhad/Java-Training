package Java8Example;

public interface Phone {
	
	void call();
	default void message() {
		System.out.println("Message sent");
	}
	static void bettery() {
		System.out.println("Bettry is 100%");
	}

}


