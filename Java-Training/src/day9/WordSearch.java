package day9;

import java.util.HashMap;
import java.util.Map;


public class WordSearch {

	public static void main(String[] args) {
		
		wordCount("A regular expression is a sequence of characters that forms a search pattern. \n" + 
				"When you search for data in a text, you can use this search pattern to describe what you are searching for.");
	}

	public boolean search(String s) {

		String[] arry = s.split(" ");
		for (int i = 0; i < arry.length; i++) {
			if (arry[i].equals("search")) {
				return true;
			}
		}
		return false;
	}

	public boolean caseInsensitiveSearch(String s) {
		String[] arry = s.split(" ");
		for (int i = 0; i < arry.length; i++) {
			if (arry[i].equalsIgnoreCase("Search")) {
				return true;
			}
		}
		return false;
	}
	
	public static void wordCount(String s) {
		String[] arry = s.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < arry.length ; i++) {
			if(!map.containsKey(arry[i])) {
				map.put(arry[i], 1);
			}else {
			map.put(arry[i], map.get(arry[i])+1);
			}
		}
		System.out.println(map.get("search"));
	}

}
