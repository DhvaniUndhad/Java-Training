package collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMap {
	static Map<String, Employee> map = new HashMap<>();
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {

		Address address1 = new Address("jenkins", "Beaverton", "US", 97006);
		Address address2 = new Address("Walker", "Ahmedabad", "India", 97015);
		Address address3 = new Address("Baseline", "Bethany", "US", 97078);
		Employee employee1 = new Employee("Dhvani", 28, "female", Arrays.asList(address1, address2, address3));

		Address address4 = new Address("Sardar", "Beaverton", "US", 360311);
		Address address5 = new Address("Bose", "Ahmedabad", "India", 67815);
		Address address6 = new Address("Rendell", "Cedar hills", "US", 90568);
		Employee employee2 = new Employee("Vivek", 30, "male", Arrays.asList(address4, address5, address6));

		map.put(employee1.getName(), employee1);
		map.put(employee2.getName(), employee2);
		//retrieving address manually
		EmployeeMap eMap = new EmployeeMap();
		System.out.println(eMap.getByName("Vivek").getAdress().get(1));
		//Exception Handling
		try {
			System.out.println(eMap.getByName("Vivek").getAdress().get(4));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Can not retrieve address at index " + e.getMessage());
		}
		
		//Retrieving address after exception handling
		System.out.println(eMap.getByName(employee1.getName()));
		
		
		
		//Retrieving Distinct cities where employees lived.
		
		for(Employee e : map.values()) {
			e.getAdress().forEach(address -> {
				set.add(address.getCity());
			});
		}
		
		System.out.println("List of Distinct cities of employees: " + eMap.getCities());
	}

	
	
	public Employee getByName(String name) {
		return map.get(name);
	}

	public List<String> getCities(){
		return new ArrayList<>(set);
	}
}
