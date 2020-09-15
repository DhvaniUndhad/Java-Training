package day4;
//Abstract Example
public class Employee extends Person {

	private int emId;

	public Employee(String n, String g, int id) {
		super(n, g);
		this.emId = id;
	}

	@Override
	public void work() {
		if (emId == 0) {
			System.out.println("Person is not working here");
		} else {
			System.out.println("Person is working as Employee here");
		}
	}

	public static void main(String[] args) {

		Person student = new Employee("Dhvani", "Female" , 0);
		Person employee = new Employee("Meena", "Female", 586);
		
		student.work();
		employee.work();
		
		System.out.println("After changing name: ");
		employee.changeName("Neha Sharma");
		student.changeName("Dhvani Undhad");
		System.out.println(employee.toString());
		System.out.println(student.toString());
		
		
		
		
	}

}
