package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Mango", "Apple", "Kiwi", "grapes"));

		// Iterator
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		// ListIterator

		ListIterator<String> l = list.listIterator();
		System.out.println("\nNext index "+l.nextIndex());
		// Forward list
		while (l.hasNext()) {
			System.out.print(l.next() + " ");
		}

		System.out.println();
		// Reverse list
		while (l.hasPrevious()) {
			System.out.print(l.previous() + " ");
		}
		System.out.println();
		// Replace element
		l.next();
		l.set("Banana");
		// Add element
		l.next();
		l.add("Watermelon");
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		

	}

}
