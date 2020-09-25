package day10;

import java.util.Scanner;

public class StringAppend {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scn = new Scanner(System.in);
		int n = 10;
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter " + i + " string: ");
			sb.append(scn.nextLine() + " ");
		}
		System.out.println(sb);
	}

}
