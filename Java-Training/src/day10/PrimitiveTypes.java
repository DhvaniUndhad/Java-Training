package day10;

import java.util.ArrayList;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		//Autoboxing
		method(50);
		
		//other automatic Autoboxing
		Integer i = 300;
		Long l = 40l;
		Float f = 5.9f;
		Character ch = 'D';
		Double d = 24d;
		
		System.out.println(i + " " + l + " " + f + " " + ch + " " + d);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(45);
		System.out.println("Autoboxing in collection framework: " + list);
		//Un boxing
		Integer a = new Integer(80);
		unbox(a) ;
		
	}
	
	//Passed int value will be converted to Integer object at runtime
	public static void method(Integer i) {
		System.out.println("Autoboxing: "+i);
	}
	
	public static void unbox(int n) {
		System.out.println("Unboxing: " + n);
	}
	
	

}
