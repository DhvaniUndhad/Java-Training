package Java8Example;

interface A {
	void show(int i, int j);
	//void show(int i);
	// String message();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// Can not instantiate an Interface
		/*
		 * A obj = new A();
		 */

		A obj = new A() {

			public void show(int i, int j) {
				System.out.println("Values are: " + i + " & " + j);
			}
		};
		obj.show(50, 30);

//		 Single parameter
//		A obj1 = (i) -> i+5; 
//		System.out.println(obj1.show(6));

		// 2 parameters
//		A obj = (i,j) -> i+j;
//		System.out.println(obj.show(90, 70));

		//String return type
//		A obj = () -> {
//		return ("Say hello");
//	};
//	System.out.println(obj.message());

	}

}
