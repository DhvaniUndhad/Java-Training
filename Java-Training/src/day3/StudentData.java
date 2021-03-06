package day3;

import java.util.Scanner;

class StudentData {
	private int stuID;
	private String stuName;
	private int stuAge;

	StudentData() {
		// Default constructor
		stuID = 100;
		stuName = "New Student";
		stuAge = 18;
	}

	StudentData(int num1, String str, int num2) {
		// Parameterized constructor
		stuID = num1;
		stuName = str;
		stuAge = num2;
	}

	// Getter and setter methods
	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public static void main(String args[]) {
		
		 // This object creation would call the parameterized constructor
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter your ID: ");
		 int id = scn.nextInt();
		 System.out.println("Enter your name: ");
		 String name = scn.next();
		 System.out.println("Enter your age: ");
		 int age = scn.nextInt();
		 
		StudentData myobj2 = new StudentData(id, name, age);
		
		System.out.println("Student Name is: " + myobj2.getStuName());
		System.out.println("Student Age is: " + myobj2.getStuAge());
		System.out.println("Student ID is: " + myobj2.getStuID());
		
		
		// This object creation would call the default constructor
		StudentData myobj = new StudentData();
		System.out.println();
		System.out.println("Default values:");
		System.out.println("Student Name is: " + myobj.getStuName());
		System.out.println("Student Age is: " + myobj.getStuAge());
		System.out.println("Student ID is: " + myobj.getStuID());

		
	
	}
}
