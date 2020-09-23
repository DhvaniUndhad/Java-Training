package day9;

public class Program {

	public static void main(String[] args) {
		Program p2 = new Program();
		p2.replace(
				"PHP is one of the programming languages commonly used. PHP follows OOPS concept in it.Java is very well known for its as a platform independent language.");
		p2.replaceFirstOccurance(
				"PHP is one of the programming languages commonly used. PHP follows OOPS concept in it. Java is very well known for its as a platform independent language.");
		
	}
	//Replace all
	public void replace(String str1) {
		str1 = str1.replaceAll("PHP", "Java");
		System.out.println(str1);
	}
	//Replace first occurence 
	public void replaceFirstOccurance(String s) {
		s = s.replaceFirst("PHP", "Java");
		System.out.println(s);
	}
	
	
	

}
