package by.metelsky.basicofoop.task2;

import by.metelsky.basicofoop.task2.Payment.Product;

public class View {

	public void printPayment(Payment payment) {
		System.out.println(payment.getAllAmount());
	}

	public void printProductsAndPayment(Payment payment) {
		for (Product product : payment.getProductsList()) {
			System.out.println(product);
		}
		printPayment(payment);
	}

}
