package day10;

public class Sequence {

	public static void main(String[] args) {
		Sequence obj = new Sequence();
		obj.change("MyEmployerIsTechouts");
	}

	public void change(String s) {
		String result = "";
		if(s.substring(12,20).equals("Techouts")) {
			result += s.substring(12,20);
		}
		if(s.substring(10,12).equals("Is")) {
			result += s.substring(10,12);
		}
		if(s.substring(0,2).equals("My")) {
			result += s.substring(0,2);
		}
		if(s.substring(2,10).equals("Employer")) {
			result += s.substring(2,10);
		}
		System.out.println(result);
	}

}
