package by.metelsky.classes.simpleclasses.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerBaseLogic{
	private static final CustomerBaseLogic instance = new CustomerBaseLogic();
	
	private CustomerBaseLogic() {
	
	}
	public static CustomerBaseLogic getInstance() {
		return instance;
	}
	
	public void sortCustomersByFullName(CustomerBase customerBase){
		Collections.sort(customerBase.getCustomerBase());	
	}
	
	public List<Customer> getCustomerByCreditCardNumberBounds(CustomerBase customerBase,long creditCardFrom , long creditCardTo){
		List<Customer> customers = new ArrayList<>();
		for(Customer customer: customerBase.getCustomerBase()) {
			if(customer.getCreditCardNumber()<=creditCardTo && customer.getCreditCardNumber()>=creditCardFrom) {
				customers.add(customer);
			}
		}
		return customers;
	}
	public List<String> getCustomersFullNames(CustomerBase customerBase){
		List<String> fullNames = new ArrayList<>();
		for(Customer customer : customerBase.getCustomerBase()) {
			fullNames.add(customer.getSurName()+" " +customer.getName()+" "+customer.getPatronymic());
		}
		return fullNames;
	}

}
