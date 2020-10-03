package Java8Example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		long count;
		List<String> strings = Arrays.asList("Dhvani", "Vivek", "", "Sneha", "Raj");
		List<Integer> values = Arrays.asList(1, 23, 10, 55, 5, 62);
		System.out.println("List of strings: " + strings);
		System.out.println("List of integers: " + values);

		count = strings.stream().filter(str -> str.isEmpty()).count();
		System.out.println("No of empty strings: " + count);

		count = values.stream().filter(n -> n == null).count();
		System.out.println("No of null values: " + count);

		count = strings.stream().filter(str -> str.length() < 5).count();
		System.out.println("Strings less than 5 length: " + count);

		count = values.stream().filter(n -> n < 20).count();
		System.out.println("Values less than 50: " + count);

		List<String> filtered = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered strings: " + filtered);

		List<Integer> filter = values.stream().filter(n -> n > 20).collect(Collectors.toList());
		System.out.println("Filtered values: " + filter);

		String merged = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(" : "));
		System.out.println("Merged strings: " + merged);

		List<Integer> doubleValues = values.stream().map(n -> n + n).collect(Collectors.toList());
		System.out.println("Double of values: " + doubleValues);

		count = doubleValues.stream().filter(n -> n < 50).count();
		System.out.println("Number less than 50: " + count);

		IntSummaryStatistics statistics = values.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println("Highest number in list: " + statistics.getMax());
		System.out.println("Lowest number in list: " + statistics.getMin());
		System.out.println("Sum of all numbers: " + statistics.getSum());
		System.out.println("Average of all numbers: " + statistics.getAverage());
		//System.out.println("Is equal " + statistics.equals(doubleValues));
		
		String numbers = values.toString();	
		System.out.println("Int to strings: " + numbers);
		System.out.println("Hash code of strings: "+strings.get(1).hashCode());
		//System.out.println(values.get(1).parseInt(numbers,4));
		
		
		List<String> str = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		 count = str.parallelStream().filter(string -> string.isEmpty()).count();
		 System.out.println(count);
	}

}
