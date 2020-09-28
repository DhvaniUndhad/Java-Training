package bookManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookManagement {
	public static Map<Integer, Book> bookMap = new HashMap<>();
	public static Map<Integer, User> userMap = new HashMap<>();
	public static Map<Integer, List<Integer>> userBookMap = new HashMap<>();
	public static Scanner scn = new Scanner(System.in);
	public static BookManagement bookManagement = new BookManagement();
	public static Integer availableBooks = 10;

	public static void main(String[] args) {
		bookManagement.loadData();
		TreeMap<Integer, Book> sortedBookMap = new TreeMap<>(bookMap);
		bookManagement.init();
	}

	public void init() {
		while (true) {
			System.out.println("Please enter your Id: ");
			int userId = scn.nextInt();
			System.out.println("Welcome " + userMap.get(userId).getUserName());
			if (userMap.containsKey(userId)) {
				User user = userMap.get(userId);
				if (user.isAdmin()) {
					System.out.println("Welcome Admin, Please select any option below:" + "\n" + "1.Manage Books" + "\n"
							+ "2.Manage user");
					int adminOption = scn.nextInt();
					if (adminOption == 1) {
						bookManagement.manageBooks();
					} else if (adminOption == 2) {
						bookManagement.manageUser();
					}
				}
				List<Integer> userBookIds = userBookMap.get(userId);
				System.out.println("You have below list of books:");
				if (userBookIds != null) {
					userBookIds.forEach(b -> {
						System.out.println(bookMap.get(b).getBookName());
					});
				}
			} else {
				System.out.println("Invalid user Id. Please enter your Id again: ");
				continue;
			}
			System.out.println("Please select View, Buy or Return: ");
			String option = scn.next();
			switch (option.toLowerCase()) {
			case "view":
				bookManagement.viewBooks();
				break;
			case "buy":
				bookManagement.buyBooks(userId);
				break;
			case "return":
				bookManagement.returnBook(userId);
				break;
			default:
				continue;
			}
		}
	}

	public void manageBooks() {
		System.out.println(bookMap.values());
		System.out.println("Select Add or Delete:");
		String bookOption = scn.next();
		if (bookOption.equalsIgnoreCase("Add")) {
			System.out.println("Enter book id:");
			int bookId = scn.nextInt();
			System.out.println("Enter book price:");
			int bookPrice = scn.nextInt();
			System.out.println("Enter book book Rating:");
			int bookRating = scn.nextInt();
			System.out.println("Enter book book name:");
			String bookName = scn.next();
			Book addBook = new Book(bookId, bookPrice, bookRating, bookName, "This new added book");
			bookMap.put(addBook.getBookId(), addBook);
		} else if (bookOption.equalsIgnoreCase("Delete")) {
			System.out.println("Enter book Id to Delete:");
			int deleteBookId = scn.nextInt();
			bookMap.remove(deleteBookId);
		}
		bookManagement.viewBooks();
		bookManagement.init();
	}

	public void manageUser() {
		System.out.println(userMap.values());
		System.out.println("Select Add or Delete : ");
		String userOption = scn.next();
		if (userOption.equalsIgnoreCase("Add")) {
			System.out.println("Enter user id:");
			int userId = scn.nextInt();
			System.out.println("Enter user name:");
			String userName = scn.next();
			System.out.println("Is user Staff? ");
			boolean isStaff = scn.nextBoolean();
			User user = new User(userId, userName, isStaff, false);
			userMap.put(userId, user);
		} else if (userOption.equalsIgnoreCase("Delete")) {
			System.out.println("Enter user ID to delete:");
			int deleteUserId = scn.nextInt();
			userMap.remove(deleteUserId);
		}
		bookManagement.viewUser();
		bookManagement.init();
	}

	public void viewUser() {
		System.out.println("List of users: ");
		System.out.println(userMap.values());
	}

	public void viewBooks() {
		System.out.println("List of books available: ");
		System.out.println(bookMap.values());
	}

	public void buyBooks(int userId) {
		bookManagement.viewBooks();
		System.out.println("Please select book Id to buy: ");
		int bookId = scn.nextInt();
		System.out.println(
				"Price of the book " + bookMap.get(bookId).getBookName() + "is: " + bookMap.get(bookId).getBookPrice());
		System.out.println("Confirm to purchase: Yes or No: ");
		String confirm = scn.next();
		if (confirm.equalsIgnoreCase("Yes")) {
			if (userBookMap.get(userId) == null) {
				userBookMap.put(userId, new ArrayList<>());
			}
			userBookMap.get(userId).add(bookId);
			availableBooks--;
			System.out.println("Succesfully Purchased book: " + bookMap.get(bookId));
		} else if (confirm.equalsIgnoreCase("No")) {
			bookManagement.init();
		}
		System.out.println("No of purchaased book: " + userBookMap.get(userId).size());
	}

	public void returnBook(int userId) {
		System.out.println("Purchased Books: ");
		userBookMap.get(userId).forEach(book -> {
			System.out.println(bookMap.get(book));
		});
		System.out.println("Select Book id to return: ");
		int returnBookId = scn.nextInt();
		userBookMap.get(userId).remove(Integer.valueOf(returnBookId));
		availableBooks++;
		System.out.println("Sucessfully returned Book");
		System.out.println("No of purchaased book: " + userBookMap.get(userId).size());
	}

	public void loadData() {
		Book book1 = new Book(100, 250, 5, "\"Think and Grow Rich\"",
				"Think and Grow Rich was written by Napoleon Hill in 1937 and promoted as a personal development and self-improvement book.");
		Book book2 = new Book(101, 190, 8, "\"The Power of Positive Thinking\"",
				"The Power of Positive Thinking: A Practical Guide to Mastering the Problems of Everyday Living is a 1952 self-help book by Norman Vincent Peale");
		Book book3 = new Book(102, 90, 10, "\"The Secret\"",
				"The Secret is a 2006 self-help book by Rhonda Byrne, based on the earlier film of the same name. It is based on the belief of the law of attraction, which claims that thoughts can change a person's life directly. ");
		Book book4 = new Book(103, 47, 7, "\"The Power of Habit\"",
				"The Power of Habit: Why We Do What We Do in Life and Business is a book by Charles Duhigg, a New York Times reporter, published in February 2012 by Random House. It explores the science behind habit creation and reformation.");
		Book book5 = new Book(104, 134, 9, "\"The Handmaid's Tale\"",
				"The Handmaid's Tale is a dystopian novel by Canadian author Margaret Atwood, published in 1985. It is set in a near-future New England, in a totalitarian state, known as Gilead, that has overthrown the United States government. ");
		Book book6 = new Book(105, 500, 4, "\"Little Fires Everywhere\"",
				"Little Fires Everywhere is a 2017 novel by American author Celeste Ng. It is her second novel and takes place in Shaker Heights, Ohio, where Ng grew up. The novel is about two families living in 1990s Shaker Heights who are brought together through their children.");
		Book book7 = new Book(106, 450, 2, "\"The 5 Second Rule\"",
				"Throughout your life, you've had parents, coaches, teachers, friends, and mentors who have pushed you to be better than your excuses and bigger than your fears.");
		Book book8 = new Book(107, 690, 1, "\"Silent Spring\"",
				"Silent Spring is an environmental science book by Rachel Carson. The book was published on September 27, 1962, documenting the adverse environmental effects caused by the indiscriminate use of pesticides.");
		Book book9 = new Book(108, 80, 3, "\"The Invention of Nature\"",
				"The Invention of Nature: Alexander von Humboldt's New World is a nonfiction book released in 2015, by the historian Andrea Wulf about the Prussian naturalist, explorer and geographer Alexander von Humboldt. ");
		Book book10 = new Book(109, 289, 7, "\"Feral\"",
				"Feral is a book about rewilding by the British environmentalist George Monbiot. Searching for Enchantment on the Frontiers of Rewilding. The book has also been published as Feral: rewilding the land, sea and human life.");

		bookMap.put(book1.getBookId(), book1);
		bookMap.put(book2.getBookId(), book2);
		bookMap.put(book3.getBookId(), book3);
		bookMap.put(book4.getBookId(), book4);
		bookMap.put(book5.getBookId(), book5);
		bookMap.put(book6.getBookId(), book6);
		bookMap.put(book7.getBookId(), book7);
		bookMap.put(book8.getBookId(), book8);
		bookMap.put(book9.getBookId(), book9);
		bookMap.put(book10.getBookId(), book10);

		User user1 = new User(1010, "Dhvani", false, false);
		User user2 = new User(1020, "Vivek", true, true);
		User user3 = new User(1030, "Neha", false, false);
		User user4 = new User(1040, "Rishi", false, false);
		User user5 = new User(1050, "Meena", true, false);

		userMap.put(user1.getUserId(), user1);
		userMap.put(user2.getUserId(), user2);
		userMap.put(user3.getUserId(), user3);
		userMap.put(user4.getUserId(), user4);
		userMap.put(user5.getUserId(), user5);

	}
}
