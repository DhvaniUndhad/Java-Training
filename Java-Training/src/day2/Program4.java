package day2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the base number ");
		int base = sc.nextInt();

		System.out.print("Enter the power ");
		int power = sc.nextInt();
		
		int result = 1;
		
		for(int i = 0 ; i<power ; i++) {
			result *= base;
			
		}
		System.out.println("The result is: " + result);

	}

}
