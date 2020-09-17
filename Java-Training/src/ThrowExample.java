
public class ThrowExample {

	public static void main(String[] args) {
		ThrowExample exc = new ThrowExample();
		exc.votingEligibility(10);
	}

	
	public void votingEligibility(int age)  throws ArithmeticException{
		if(age<18) {
			//throw new ArithmeticException("Person is not eligible for voting");
			System.out.println("Person is not eligible for voting");
		}
		else {
			System.out.println("Person is eligible for voting");
			
		}
	}
}
