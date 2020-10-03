package oopsPresentationExample;

public class MyDemo  implements MyInterface  {
	/*
	 * This class must have to implement both the abstract methods else you will get
	 * compilation error
	 */
	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String arg[]) {
		// can not intantiated interface
		/*
		 * MyInterface ob = new MyInterface();
		 */

		MyInterface obj = new MyDemo();
		obj.method1();
		obj.method2();
		//Final variable can not be assigned new values
		/*
		 * obj.a = 20;
		 * obj.s = "New Value";
		 */
		
		System.out.println(obj.a);
		System.out.println(obj.s);
	}

}
