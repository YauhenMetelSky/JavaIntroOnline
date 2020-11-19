package by.metelsky.classes.agregationcomposition.task4;

import java.util.Comparator;

public class AccountByBalanceComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getBalance()<o2.getBalance()) {
			return -1;
		} else if(o1.getBalance()==o2.getBalance()) {
			return 0;
		} else return 1;
	
	}
	

}
