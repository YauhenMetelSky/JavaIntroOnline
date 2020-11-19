package by.metelsky.classes.simpleclasses.task9;

import java.util.List;

public class View {
	public void printBook(Book book) {
		System.out.println(book);
	}

	public void printListOfBook(List<Book> books) {
		if (books.size() == 0) {
			System.out.println("Nothing to display");
		}
		books.forEach(System.out::println);
	}

}
