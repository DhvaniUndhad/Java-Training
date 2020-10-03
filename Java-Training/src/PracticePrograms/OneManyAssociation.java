package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//One-Many association example
public class OneManyAssociation {
	public static void main(String[] args) {

		// One company can have more than one employee
		List<Employee> employee = new ArrayList<Employee>();
		Employee e = new Employee("Dhvani", 5, "2018", "Global solutions");
		Employee e1 = new Employee("Raghav", 3, "2019", "Global solutions");
		Employee e2 = new Employee("Jenny", 4, "2015", "Global solutions");
		employee.addAll(Arrays.asList(e, e1, e2));

		Company c = new Company("Global solution", employee);
		System.out.println("Company name: "+c.getName());
		System.out.println("Employee details:");
		c.getEmployees().forEach(emp -> System.out.println(emp));
	}

}

class Employee {
	private String name;
	private int ratings;
	private String startYear;
	private String company;

	public Employee(String name, int ratings, String startYear, String company) {
		super();
		this.ratings = ratings;
		this.startYear = startYear;
		this.name = name;
		this.company = company;

	}

	@Override
	public String toString() {
		return "[name=" + name + ", ratings=" + ratings + ", startYear=" + startYear + ", company=" + company
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
