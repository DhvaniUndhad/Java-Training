package PracticePrograms;

import java.util.Scanner;

public class InvalidUserName extends Exception {

	public InvalidUserName(String msg) {
		super(msg);

	}

	public static void main(String[] args) throws InvalidUserName {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String name = scan.nextLine();
		try {
		if (name.length() < 10 || name.contains("&")) {
			throw new InvalidUserName("Username must be grater than 10 charcaters. ");
		}
		}catch(InvalidUserName e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Executing further...");

	}

}
