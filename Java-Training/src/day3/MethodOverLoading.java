package day3;

public class MethodOverLoading {

	public static void main(String args[]) {
		Overload obj = new Overload();
		obj.sum(20);
		obj.sum(20,30);
	}

}

class Overload{
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println("Result: " + c);
	}
	
	public void sum(int a) {
		int c = a*a;
		System.out.println("Second method: " + c);
	}
}
