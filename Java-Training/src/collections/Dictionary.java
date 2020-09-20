package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

	public static void main(String[] args) {
		{
			List<String> list3 = Arrays.asList("cyber", "cat", "cincinati", "colombia", "cave");

			List<String> list4 = Arrays.asList("dog", "diary", "dejavu", "darling", "dost");

			Map<Character, List<String>> hm = new HashMap<Character, List<String>>();
			hm.put('a', Arrays.asList("apple", "astoria", "all", "ahmedabad", "arraylist"));
			hm.put('b', Arrays.asList("boston", "bhuro", "buffalo", "bomb"));
			hm.put('c', list3);
			hm.put('d', list4);
			System.out.println(hm.get('a'));
			System.out.println(hm.get('b'));
			System.out.println(hm.get('c'));
			System.out.println(hm.get('d'));

		}
	}

}
