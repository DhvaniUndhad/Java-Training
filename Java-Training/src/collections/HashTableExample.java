package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(12, "Company");
		hmap.put(2, "Managers");
		hmap.put(7, "Customers");
		hmap.put(49, "Employee");
		hmap.put(3, "Headquarters");

		// Converting HashMap into Set.
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mapData = (Map.Entry) iterator.next();
			System.out.println("Key: " + mapData.getKey() + " ,Value: " + mapData.getValue());
		}

		Map<String, Integer> map = new HashMap<>();
		// Map allows multiple null values but only one null Key
		map.put(null, 1);
		map.put(null, 90);
		map.put("Dhvani", 2);
		map.put("Binal", null);
		map.put("Vivek", null);

		Hashtable<String, Integer> table = new Hashtable<>();
		// Hashtable does not allow null Key or values and throws Null Pointer during
		// execution
		try {
			table.put(null, 5);
			table.put("Dhvani", 6);
			table.put("Neha", null);
		} catch (NullPointerException e) {
			System.out.println("Hashtable does not allow null key or values");
		}
		System.out.println("Hash map: " + map.get("Dhvani"));
		System.out.println("Hashtable: " + table.get("Neha"));

	}

}
