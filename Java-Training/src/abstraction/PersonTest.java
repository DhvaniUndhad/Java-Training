package abstraction;

public class PersonTest {

	public static void main(String[] args) {
		//Can not create an object of abstract class
		
		/*
		 * Person p = new Person();
		 */
		
		Person prof = new Professor("Mr.bajaj", "Mathematics");
		prof.teach();
		prof.cook();
		prof.ride();
		
		//Final variables gives compilation error.
		/*
		 * prof.university = "Portland University";
		 */
		
		Person prof2 = new Professor("Mrs. Mehta", "Science");
		prof2.teach();
		prof2.work();
		
		Person prof1 = new Professor();
		prof1.teach();
		prof1.work();
		
		Student student = new Student();
		System.out.println(student.study());
		student.cook();
		student.ride();
		
		
		
	}

}
