package Java8Example;

import java.util.Arrays;

public class ParallelSortDemo {
	public static void main(String[] args) {
		int numbers[] = { 22, 89, 1, 32, 19, 5, 4, 49, 32, 07, 108, 35 };
		/*
		 * Specifying the start and end index. The start index is 0 here and the end
		 * index is 6. which means the the elements starting from index 0 till index 6
		 * would be sorted.
		 */
		//Arrays.parallelSort(numbers);
		//System.out.println("-------------------next-----------");
		Arrays.parallelSort(numbers, 6, 9);
		System.out.println("-------------------next-----------");
		Arrays.parallelSort(numbers, 9, 12);
		System.out.println("-------------------next-----------");

		// converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n -> System.out.println(n + " "));

		/*
		 * System.out.println("Finally the list is "); for(int i:numbers){
		 * System.out.println(i); }
		 */
	}
}