package Java8Example;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(3,6,4,8,9,1);
		
		//External loops--------------------------
		/*for(int i = 0 ; i < values.size();i++) {
			System.out.println(values.get(i));
		}
		*/
		
//		for(int i : values) {
//			System.out.println(i);
//		}
//		
		//Internal Loops---------------------------
		values.forEach(i -> System.out.println(i)); // consumer interface
		
	}

}
