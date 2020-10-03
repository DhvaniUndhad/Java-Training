package PracticePrograms;

import java.util.List;

public class Company {
	
	private String name;
	private List<Employee> employees;

	public Company(String name, List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
