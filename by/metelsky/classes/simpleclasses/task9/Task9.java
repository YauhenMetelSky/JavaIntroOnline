package by.metelsky.classes.simpleclasses.task9;

import java.util.ArrayList;
import java.util.List;
/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Task9 {

	public static void main(String[] args) {
		String author = "Joanne Rowling";
		String publisher = "AST";
		int yearPublished = 2007;
		Book book1 = new Book(1, "Harry Potter and the chamber of secrets", "Joanne Rowling", "AST", 2008, 800, 100,
				"hard");
		Book book2 = new Book(2, "Java", "Bruce Ekkel", "AST", 2014, 850, 99, "hard");
		Book book3 = new Book(3, "Harry Potter and the philosopher's stone", "Joanne Rowling", "AST", 2012, 800, 120,
				"soft");
		Book book4 = new Book(4, "Book4", "Author", "ACT", 2003, 100, 1000, "hard");
		Book book5 = new Book(5, "Book5", "Another author", "ACT", 2005, 200, 50, "hard");
		Library library = new Library();
		library.addBookTolibrary(book1);
		library.addBookTolibrary(book2);
		library.addBookTolibrary(book3);
		library.addBookTolibrary(book4);
		library.addBookTolibrary(book5);

		List<Book> rowlingBooks = new ArrayList<>();
		List<Book> astPublishedBooks = new ArrayList<>();
		List<Book> publishedAfterYearBooks = new ArrayList<>();

		rowlingBooks = LibraryLogic.findByAuthor(library, author);
		astPublishedBooks = LibraryLogic.findByPublisher(library, publisher);
		publishedAfterYearBooks = LibraryLogic.findBooksPublishedAfterYear(library, yearPublished);
		View view = new View();
		System.out.println("Athor : " + author);
		view.printListOfBook(rowlingBooks);
		System.out.println("Publisher : " + publisher);
		view.printListOfBook(astPublishedBooks);
		System.out.println("yearPublished : " + yearPublished);
		view.printListOfBook(publishedAfterYearBooks);

	}

}
