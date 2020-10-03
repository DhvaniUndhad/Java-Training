package PracticePrograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		DateDemo dateDemo = new DateDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any date: ");
		String date = scan.next();
		// Converts String to Date.
		Date userDate = dateDemo.formatDate(date);
		System.out.println("User Date is: " + userDate);
		dateDemo.isAfter(userDate);
		dateDemo.isBefore(userDate);
		System.out.println("Current date: "  + new Date());

	}

	public Date formatDate(String date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		Date userDate = formatter.parse(date);
		return userDate;
	}

	public void isBefore(Date userDate) {
		Date systemDate = new Date();
		if (userDate.compareTo(systemDate) < 0) {
			System.out.println("Input date is before current date.");
		}

	}

	public void isAfter(Date userDate) {
		Date systemDate = new Date();
		if (userDate.compareTo(systemDate) > 0) {
			System.out.println("Input Date is after currrnt date.");
		}

	}

}
