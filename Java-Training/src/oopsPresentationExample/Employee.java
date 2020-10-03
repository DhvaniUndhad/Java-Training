package oopsPresentationExample;

public class Employee {

	private int numOfEmployees = 0;
	private int ssn;
	private String empName;
	private int empAge;

	public void setNoOfEmployees(int count) {
		numOfEmployees = count;
	}

	public double getNoOfEmployees() {
		return numOfEmployees;
	}

	// Getter and Setter methods
	public int getEmpSSN() {
		return ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int newValue) {
		empAge = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
}
