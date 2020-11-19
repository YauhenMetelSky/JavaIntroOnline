package by.metelsky.classes.simpleclasses.task9;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<>();

	public Library() {

	}

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public boolean addBookTolibrary(Book book) {
		return books.add(book);
	}

	public boolean removeBookFromLibrary(Book book) {
		return books.remove(book);
	}

	public boolean addListOfBookToLibrary(List<Book> books) {
		return books.addAll(books);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

}
