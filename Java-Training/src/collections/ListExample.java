package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {

		List<String> fruites = new ArrayList();
		fruites.add("Banana");
		fruites.add("Apple");
		fruites.add("Kiwi");
		fruites.add("Orange");
		fruites.add("Grapes");
		fruites.add("Watermelon");
		
		System.out.println("Size of l1 is: " + fruites.size());

		Iterator itr = fruites.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Different methods
		System.out.println("\nMethods Result:");
		System.out.println(fruites.contains("Kiwi"));
		System.out.println(fruites.get(3));
		System.out.println(fruites.indexOf("Grapes"));
		Collections.sort(fruites);
		 for (String str : fruites) {
	         System.out.println(str);
	      }
	
		System.out.println("Second List:");
		List<String> animals = new ArrayList<>();
		animals.add("Monkey");
		animals.add("Cow");
		animals.add("Dog");
		
		fruites.addAll(animals);
		System.out.println(fruites);
		
		System.out.println(fruites.remove(3));
		System.out.println(fruites.equals(animals));
		System.out.println(animals.set(2, "NewValue"));
		System.out.println(animals);
		
		
		
		
	}

}
