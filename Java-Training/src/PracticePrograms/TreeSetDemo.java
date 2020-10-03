package PracticePrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.addAll(Arrays.asList("Animal", "animal","Bird","Fish", "DOG", "cat", "e", "N","Z"));
		System.out.println(set);
		TreeSet set2 = new TreeSet();
		set2.addAll(Arrays.asList(2,56,3,7,12,5));
		System.out.println(set2);
		
		
	}

}
