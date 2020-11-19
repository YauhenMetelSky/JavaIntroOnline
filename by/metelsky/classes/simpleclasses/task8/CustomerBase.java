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
	
	public List<Customer> getCustomerBase() {
		return customerBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerBase == null) ? 0 : customerBase.hashCode());
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
		CustomerBase other = (CustomerBase) obj;
		if (customerBase == null) {
			if (other.customerBase != null)
				return false;
		} else if (!customerBase.equals(other.customerBase))
			return false;
		return true;
	}
	

}
