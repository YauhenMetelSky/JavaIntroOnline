package by.metelsky.classes.simpleclasses.task8;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {
	List<Customer> customerBase = new ArrayList<Customer>();
	
	
	public CustomerBase() {
		
	}
	public CustomerBase(List<Customer> customerBase) {
		this.customerBase = customerBase;
	}
	public boolean addCustomer(Customer customer) {
	
		return customerBase.add(customer);
		
	}
	public boolean removeCustomer(Customer customer) {
		
		return customerBase.remove(customer);
		
	}

}
