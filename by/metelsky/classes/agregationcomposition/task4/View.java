package by.metelsky.classes.agregationcomposition.task4;

import java.util.List;

public class View {
	
	public void printPositiveBalance(int balance) {
		System.out.println("Positive balance is : " + balance);
		
	}
    public void printNegativeBalance(int balance) {
    	System.out.println("Negative balance is : " + balance);
		
	}
    public void printBalance(int balance) {
    	System.out.println("Balance is : " + balance);
	
    }

	public void printAccount(Account account) {
		System.out.println("Id: " + account.getId() + ", " + "balance : " + account.getBalance() + ", " + "isActive "
				+ account.isActive());
	}
	
	public void printAccounts(List<Account> accounts) {
		for(Account account : accounts) {
			printAccount(account);
		}
	}

}
