package collections;

import java.util.Comparator;

public class QuantityComparatorExample implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		if (b1.getQuantity() < b2.getQuantity()) {
			return 1;
		} else {
			return -1;
		}
	}

}


