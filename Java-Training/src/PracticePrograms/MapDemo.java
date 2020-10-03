package PracticePrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		int[] values = new int[] { 2, 5, 7, 3, 2, 3, 5, 8, 1, 9 };
		List<Integer> duplicateValues = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : values) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				duplicateValues.add(i);
			}
		}
		System.out.println("Dupliate values are: " + duplicateValues);

	}

}
