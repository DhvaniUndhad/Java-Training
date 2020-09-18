package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String args[]) {
        // TreeSet of String Type
        TreeSet<String> tset = new TreeSet<String>();

        // Adding elements to TreeSet<String>
        tset.add("ABC");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");

        Iterator i=tset.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.print(i.next() + " ");  
        }  

        System.out.println();
        
        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        tset2.add(8);
        tset2.add(7);
        tset2.add(11);
        tset2.add(0);
        tset2.add(3);
        tset2.add(22);
        System.out.println(tset2);
   }
}
