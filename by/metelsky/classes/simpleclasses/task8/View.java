package by.metelsky.classes.simpleclasses.task8;

import java.util.List;

public class View {
	
	public void printCustomer(Customer customer) {
		System.out.println(customer);
	}
	
	public void printCustomerList(List<Customer> customers) {
		for(Customer customer: customers) {
			printCustomer(customer);
		}
	}

}
