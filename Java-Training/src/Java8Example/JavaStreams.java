package Java8Example;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStreams {
	public static void main(String[] args) throws IOException {
		
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
			System.out.println(summary);
		
		
		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
		System.out.println("--------------------");
		DoubleStream is=IntStream.range(1, 6).filter( x ->  x>2).sorted().asDoubleStream().distinct();
		System.out.println("Average is "+is.average());
		System.out.println("--------------------");
		
		// 2. Integer Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		System.out.println("--------------------");
		//System.out.println("Average is "+is.average());
	
		// 3. Integer Stream with sum
		System.out.println(
		IntStream
			.range(1, 5)
			.min());
		System.out.println();
			
		// 4. Stream.of, sorted and findFirst
		Stream.of("B", "C", "A","D")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
			
		// 5. Stream from Array, sort, filter and print
		String[] names = {"Manasvi","Rohan","Vineeth","Aakash","Dhvani","Meena","Meena"};
		Arrays.stream(names)	// same as Stream.of(names)
			.filter(x -> x.startsWith("M"))
			.sorted().distinct()
			.forEach(System.out::println);
					
		// 6. average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::println);
		
		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Aa", "aB", "AAB", "Cccc", "DdA");
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x -> x.startsWith("a"))
			.forEach(System.out::println);
		System.out.println("The people values are "+people);
			
		// 8. Stream rows from text file, sort, filter, and print
		Stream<String> type1 = Files.lines(Paths.get("/Java-Training/src/Java8Example/names.txt"));
		type1
			.sorted()
			.filter(x -> x.length() >2)
			.forEach(System.out::println);
	//	type1.close();
		
		// 9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("C:\\Users\\meena\\workspace\\Techouts_Core\\src\\StreamAPI\\names.txt"))
			.filter(x -> x.contains("een"))
			.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println("The values are "+x));
		/*
		// 10. Stream rows from CSV file and count
		Stream<String> rows1 =Files.lines (Paths.get("C:\\Users\\meena\\workspace\\Techouts_Core\\src\\StreamAPI\\names.txt"));
		int rowCount = (int)rows1
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.count();
		System.out.println(rowCount + " rows.");
		rows1.close();
		
		// 11. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\meena\\workspace\\Techouts_Core\\src\\StreamAPI\\names.txt"));
		rows2
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
		rows2.close();
		
		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
			.map(x -> x.split(","))
            .filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
                x -> x[0],
                x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}
		*/
			
		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8)
			.reduce(0.01, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);
		
		// 14. Reduction - summary statistics
//		
	}
}