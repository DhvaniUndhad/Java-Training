package Java8Example;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String args[]) {
		OptionalClassDemo obj = new OptionalClassDemo();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);
		System.out.println("Value of a is " + a);
		Optional<Integer> a1 = Optional.of(value2);// =>try
		System.out.println("Value of a is " + a1);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(obj.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not

		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = b.orElse(20);
		Integer value2 = a.orElse(new Integer(20));

		// Optional.get - gets the value, value should be present
		Integer value3 = b.get();// 10
		return value1 + value2 + value3;
	}
}
