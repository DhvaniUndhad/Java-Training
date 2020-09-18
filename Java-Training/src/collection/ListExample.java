package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
//List-1
		List<String> l1 = new ArrayList();
		l1.add("vivek");
		l1.add("ekta");
		l1.add("Dhvani");
		l1.add("Neha");
		l1.add("kinjal");
		System.out.println("Size of l1 is: " + l1.size());

		l1.remove(2);
		l1.remove(3);
		System.out.println("After removing :" + l1.size());
		System.out.println(l1.contains("Dhvani"));
		System.out.println(l1.indexOf("vivek"));

//List-2
		ArrayList<String> l2 = new ArrayList();
		l2.add("pooja");
		l2.add("hiral");

		
		System.out.println(l2.addAll(2, l1));

		l2.add(2, "p");
		System.out.println(l2);

		l2.set(2, "r");
		System.out.println(l2);

		Collections.sort(l2);
		System.out.println(l2);

		Collections.sort(l1);
		System.out.println(l1);

		l2.addAll(l1);
		System.out.println("Sublist" + l2);

		System.out.println("Size of l2 is: " + l2.size());

		Iterator itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
