package by.metelsky.classes.simpleclasses.task9;

import java.util.ArrayList;
import java.util.List;

public class LibraryLogic {

	public static List<Book> findByAuthor(Library library, String author) {
		List<Book> books = new ArrayList<>();
		for (Book book : library.getBooks()) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				books.add(book);
			}
		}

		return books;
	}

	public static List<Book> findByPublisher(Library library, String publisher) {
		List<Book> books = new ArrayList<>();
		for (Book book : library.getBooks()) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				books.add(book);
			}
		}

		return books;
	}

	public static List<Book> findBooksPublishedAfterYear(Library library, int year) {
		List<Book> books = new ArrayList<>();
		for (Book book : library.getBooks()) {
			if (book.getYearPublish() > year) {
				books.add(book);
			}
		}

		return books;
	}

}
