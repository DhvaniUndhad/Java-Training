package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();
		list.add(new Book(101, "abc", "dhvani", "abcd", 15));
		list.add(new Book(102, "xyz", "Vivek", "xyzz", 8));
		list.add(new Book(103, "pqr", "kesha", "pqrst", 30));
		list.add(new Book(105, "lep", "Lubdhi", "qmnch", 27));

		// Comparable
		System.out.println("After sorting author name using Comparable:");
		Collections.sort(list);

		for (Book b : list) {

			System.out.println(b);
		}
		
		//Comparator
		System.out.println("After sorting Quantity using Comparator:");
		
		
		Collections.sort(list, new QuantityComparatorExample());
		for (Book b : list) {

			System.out.println(b);
		}

	}

}
