package oopsPresentationExample;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		System.out.println(child.designation);
		System.out.println(child.collegeName);
		child.does();
		//Can not access private data member of parent class
		/*
		 * System.out.println(child.name);
		 */
		
		//protected data member
		child.setName("Dhvani");
		System.out.println(child.getName());
		
		//read-only
		System.out.println(child.getSubject());
		
		//write-only
		  child.setMarks(90);

	}

}
