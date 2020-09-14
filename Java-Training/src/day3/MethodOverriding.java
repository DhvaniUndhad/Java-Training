package day3;

public class MethodOverriding extends Overriding {
	
	public void  speedLimit() {
		System.out.println("Speed limit is 50 ");
	}

	public static void main(String[] args) {
		
		Overriding obj = new MethodOverriding();
		obj.speedLimit();
		
		
		
		
	}

}


class Overriding {
	public  void speedLimit() {
		System.out.println("Speed limit is 70");
	}
}
