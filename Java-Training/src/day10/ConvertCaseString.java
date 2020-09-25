package day10;

public class ConvertCaseString {

	public static void main(String[] args) {
		ConvertCaseString obj = new ConvertCaseString();
		System.out.println("Camel case to snake case: "+obj.snakeCase("MyEmployerIsTechOut"));
	}

	public String snakeCase(String s) {
		String snakeCase = "";
		char ch = s.charAt(0);
		snakeCase = snakeCase + Character.toLowerCase(ch);
		for(int i = 1 ; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				snakeCase = snakeCase + "_";
				snakeCase = snakeCase + Character.toLowerCase(s.charAt(i));
			}
			else {
				snakeCase = snakeCase + s.charAt(i);
			}
		}
		return snakeCase;
	}
}
