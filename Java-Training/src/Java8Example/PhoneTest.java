package Java8Example;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone = new AndroidPhone();
		phone.call();
		phone.message();
		AndroidPhone a = new AndroidPhone();
		a.bettery();
		
		Phone.bettery();
	}
}

class AndroidPhone implements Phone {
	public void call() {
		System.out.println("Calling");
	}
	
	public static void bettery() {
		System.out.println("Bettery");
	}
}
