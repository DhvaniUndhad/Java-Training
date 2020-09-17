package encapsulation;

import java.util.Scanner;

public class MobileTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Mobile mobile = new Mobile();
		System.out.println("Enter Height: ");
		mobile.setHeight(scn.nextDouble());
		System.out.println("Enter width: ");
		mobile.setWidth(scn.nextDouble());

		System.out.println("Mobile height and width are: " + mobile.getHeight() + " " + mobile.getWidth());

		System.out.println("Enter screen Size: ");
		int size = scn.nextInt();
		System.out.println(mobile.mobileType(size));
		System.out.println("Max Volume: "+mobile.decreaseVolume());
		/*
		 * Private variables are not vivsible in other class
		 * System.out.println(mobile.power);
		 */

	}

}
