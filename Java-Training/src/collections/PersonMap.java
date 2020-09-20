package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMap {
	static Map<String, Person> map = new HashMap<>();
	public static void main(String[] args) {

		PersonMap personMap = new PersonMap();
		Person person1 = new Person("Dhvani", 28, "female", "9090876648", "1234 SE baseline road");
		Person person2 = new Person("Vivek", 29, "male", "9038566648", "14 SW Walker road");
		Person person3 = new Person("Sneha", 25, "female", "9254876068", "768 Ne Jenkins road");
		Person person4 = new Person("Dhaval", 30, "male", "9763451789", "130 NW Main road");
		Person person5 = new Person("Neel", 27, "male", "9330877452", "088 SE Canby road");
		//Storing Person's info in a list.
		List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);
		//Retrieving complete list data
		personList.forEach(person -> {
			System.out.println(person);
		});
		

		//Storing person's info in map
		for (Person person : personList) {
			map.put(person.getName(), person);
		}
		
		// Manually retrieving persons info by Name.
		Person sneha = map.get("Sneha");
		System.out.println(sneha);

		//retrieving data by method
		System.out.println(personMap.getByName(person4.getName()));
	}
	
	public Person getByName(String name) {
		return map.get(name);
	}

}
