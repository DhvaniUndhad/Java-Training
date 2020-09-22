package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	
	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Laptop");
	      hset.add("Mouse");
	      hset.add("CPU");
	      hset.add("Keyboard");
	      hset.add("Charger");
	      //Addition of duplicate elements
	      hset.add("Mouse");
	      hset.add("Keyboard");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Iterate through HashSet
	      Iterator<String> it = hset.iterator();
	      while(it.hasNext()){
	         System.out.println(it.next());
	      }
	    }

}
