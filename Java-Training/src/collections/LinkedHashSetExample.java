package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet();
		set.add(null);
		set.add("West");
		set.add("East");
		set.add("North");
		set.add("South");
		System.out.println(set);
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		LinkedHashSet<Book> hs = new LinkedHashSet<Book>();

		Book b1 = new Book(101, "Let grow together", "Abc", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Xyz", "hilton berry", 4);
		Book b3 = new Book(103, "Operating System", "asbd", "billy", 6);

		// Adding Books to hash table
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);

		// Traversing hash table
		for (Book b : hs) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
