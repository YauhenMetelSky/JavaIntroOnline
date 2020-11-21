package by.metelsky.basicofoop.task2;

import by.metelsky.basicofoop.task2.Payment.Product;

/*Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов 
которого можно сформировать покупку из нескольких товаров.*/
public class Task2 {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.addProduct(new Product(25, "item1"));
		payment.addProduct(new Product(10, "item2"));
		payment.addProduct(new Product(30, "item3"));
		payment.addProduct(new Product(27, "item4"));
		payment.addProduct(new Product(25, "item5"));
		View view = new View();
		view.printProductsAndPayment(payment);

	}

}
