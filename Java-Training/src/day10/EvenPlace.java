package day10;

public class EvenPlace {

	public static void main(String[] args) {
		EvenPlace obj = new EvenPlace();
		obj.even("Application");

	}
	
	public void even(String s) {
		int length = s.length();
		String even = "";
		String odd = "";
		for(int i = 0 ; i < length ; i++) {
			if(i%2==0) {
				even += s.charAt(i);
			}else {
				odd += s.charAt(i);				
			}
			
			
		}
		System.out.println("Odd characters: " + even);
		System.out.println("Even characters: " + odd);
		
	}

}
