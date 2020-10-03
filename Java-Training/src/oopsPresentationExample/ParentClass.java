package oopsPresentationExample;

public class ParentClass {
	private String name;
	private String subject = "Mathemetics";
	private int marks;
	String designation = "Teacher";
	String collegeName = "Oxford University";

	void does() {
		System.out.println("Teaching");
	}
	public String getSubject() {
		return subject;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDesignation() {
		return designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

}
