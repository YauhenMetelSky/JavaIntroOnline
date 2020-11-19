package by.metelsky.classes.agregationcomposition.task4;

import java.util.Comparator;

public class AccountByIdComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
	
		return o1.getId()-o2.getId();
	}
	

}
