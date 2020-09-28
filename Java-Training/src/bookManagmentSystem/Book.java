package bookManagmentSystem;

public class Book implements Comparable<Book>{

	private int bookId, bookPrice, bookRating;
	private String bookName, bookDescription;

	public Book(int bookId, int bookPrice, int bookRating, String bookName, String bookDescription) {
		super();
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookRating = bookRating;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookRating() {
		return bookRating;
	}

	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	@Override
	public String toString() {
		return " bookId=" + bookId + ", bookPrice=" + bookPrice + ", bookRating=" + bookRating + ", bookName="
				+ bookName + ", bookDescription=" + bookDescription + "\n";
	}

	@Override
	public int compareTo(Book o) {
		return (int)(this.bookRating - o.getBookRating());
	}

}
