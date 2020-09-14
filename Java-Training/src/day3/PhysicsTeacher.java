package day3;
// Example of inheritance

class Teacher {
	String designation = "Teacher";
	String collegeName = "Oxford University";

	void workAs() {
		System.out.println("Teaching at Oxford University");
	}
}

public class PhysicsTeacher extends Teacher {
	String Subject = "Physics";

	public static void main(String args[]) {
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.Subject);
		obj.workAs();
	}
}