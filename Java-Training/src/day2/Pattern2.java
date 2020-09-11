package day2;

public class Pattern2 {

	public static void main(String[] args) {

		int row = 5;
		for (int i = 0; i < row-1; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < row+1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
