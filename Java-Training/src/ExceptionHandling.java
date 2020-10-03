
public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling exc = new ExceptionHandling();
		exc.arithmeticException();
		exc.indexOob();

	}

	public void arithmeticException() {
		int a = 10;
		int b = 0;
		int k = 0;

		try {
			k = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Can not divide by O ");
		} finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Continue further");
	}

	public void indexOob() {
		int[] arry = new int[3];

		try {
			// arry[2] = 23/0;

			for (int i = 0; i <= 3; i++) {
				arry[i] = i + 1;
			}
			for (int value : arry) {
				System.out.println(value);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum nuber of value is 3");
		} catch (Exception e) {
			System.out.println("Some other exception");
		}

	}
}
