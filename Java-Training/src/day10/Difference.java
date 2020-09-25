package day10;

public class Difference {

	public static void main(String[] args) {
		String s1 = "Hello world";
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1);
		System.out.println(s1.length());
		System.out.println(s1.compareTo("h"));
		System.out.println(s1.contains("number"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.equalsIgnoreCase("HeLLo WoRld"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replaceFirst("Hello", "Congrats"));
		
		
		
		
		StringBuilder s2 = new StringBuilder("My name is Dhvani ");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);
		//Methods 
		System.out.println(s2.charAt(3));
		System.out.println(s2.equals(s1));
		//System.out.println(s2.reverse());
		System.out.println(s2.indexOf("living"));
		System.out.println(s2.append("vvvvvvvv"));
		

		StringBuffer s3 = new StringBuffer("Hello world ");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
		System.out.println(s3.equals(s1));
		System.out.println(s3.lastIndexOf("employer"));
		System.out.println(s3.substring(16));
		System.out.println(s3.subSequence(16, 25));
		System.out.println(s3.deleteCharAt(8));
	}

	public static void concat1(String s1) {
		s1 = s1 + " I completed my masters";
	}
	public static void concat2(StringBuilder s2) {
		s2.append("I am living in OR");
	}
	public static void concat3(StringBuffer s3) {
		s3.append("My employer is Techout");
	}
}
