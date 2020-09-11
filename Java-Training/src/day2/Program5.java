package day2;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number:  ");
		int number = sc.nextInt();
		int reversed = 0;

		while (number != 0) {
			int reminder = number % 10;
			reversed = reversed * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed number:" + reversed);

	}

}
