package day9;

import java.util.Set;

public class ThreadExample extends Thread {
	int n;

	public ThreadExample(int n) {
		this.n = n;
	}
	
	

	public void run() {
		if (n % 2 == 0) {
			System.out.println("Even number");
		}
		System.out.println("Odd number");
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadExample ex = new ThreadExample(15);
		// ex.n = 10;
		ex.start();
		
		ThreadExample ex1 = new ThreadExample(30);
		ex1.start();
		ex1.sleep(4500);
		ex1.join();
		Runnable obj = new AnotherClass(19);
		Thread thread = new Thread(obj);
		thread.start();
		thread.setPriority(MAX_PRIORITY);
		System.out.println("Thread name before:" + thread.getName());
		thread.setName("Dhvani");
		System.out.println("Thread name after: " + thread.getName());
		thread.setPriority(MIN_PRIORITY);

		Set<Thread> set = Thread.getAllStackTraces().keySet();

		for (Thread t : set) {
			String name = t.getName();
			System.out.println(name);
			Thread.State state = t.getState();
			System.out.println(state);
			int priority = t.getPriority();
			System.out.println(priority);
			String type = t.isDaemon() ? "Deamon" : "Normal";
			System.out.println(type);
			String type1 = t.isAlive() ? "Alive" : "Deamon";
			System.out.println(type1);
			System.out.println(t.getId());

		}
	}
}

class AnotherClass implements Runnable {

	int n;

	public AnotherClass(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		if (n % 2 == 0) {
			System.out.println("Even number");
		}
		System.out.println("Odd number");
	}
}
