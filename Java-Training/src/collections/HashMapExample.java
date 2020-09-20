package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		count("This is a program of HashMap, This is a program");
	}

	public static void count(String s) {
		String[] a = s.split(" ");

		System.out.println("Total words: " + a.length);

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		System.out.println(map);

	}

}
