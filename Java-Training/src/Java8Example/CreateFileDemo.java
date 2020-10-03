package Java8Example;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\meena\\workspace\\Techouts_Core\\src\\StreamAPI\\myNewFile2.txt"); // initialize
																											// File
																											// object
																											// and
																											// passing
																											// path as
																											// argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created and the canolic path is " + file.getCanonicalPath()); // returns the
																										// path string
				System.out.println("file created and the absolute path is " + file.getAbsolutePath());
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (Exception e) {
			e.printStackTrace(); // prints exception if any
		}
	}
}