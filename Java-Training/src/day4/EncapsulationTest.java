package day4;

public class EncapsulationTest {

	public static void main(String args[]) {
		// Example of both read-only and write-only class
		Encapsulation obj = new Encapsulation();
		obj.setName("Dhvani Undhad");
		obj.setAge(28);

		System.out.println("Person Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("SSN: " + obj.getSsn());

		// Example of read-only class
		Week week = new Week();
		System.out.println("Total days in week: " + week.getDays());

		// Example of write-only class
		Professor prof = new Professor();
		prof.setCollage("Southern Arkansas University");

	}
}

class Encapsulation {

	private String name;
	private int ssn = 123456789;
	private int age;

	// Generating getter methods for Name and Age
	public String getName() {
		return name;
	}

	public void setName(String Newname) {
		this.name = Newname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int Newage) {
		this.age = Newage;
	}

	// Example of Read-only
	// Generating only getter for SSN

	public int getSsn() {
		return ssn;
	}

}

class Week {

	private String days = "7 Days";

	public String getDays() {
		return days;
	}

}

class Professor {
	private String collage;

	public void setCollage(String collageName) {
		this.collage = collageName;
	}

}
