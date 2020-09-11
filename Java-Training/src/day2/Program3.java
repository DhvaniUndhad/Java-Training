package day2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter marks: ");
		int mark = sc.nextInt();

		if (mark > 50) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

	}

}
