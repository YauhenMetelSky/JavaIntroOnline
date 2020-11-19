package by.metelsky.classes.agregationcomposition.task4;

import java.util.Collections;

public class CustomerLogic {
	public static void blockAccount(Account account) {
		account.setActive(true);
	}
	public static void unBlockAccount(Account account) {
		account.setActive(false);
	}
	public static void sortAccountsById(Customer customer) {
		Collections.sort(customer.getAccounts(), new AccountByIdComparator());
		
	}
   public static void sortAccountsByBalance(Customer customer) {
	   Collections.sort(customer.getAccounts(), new AccountByBalanceComparator());
		
	}
   
   public static int getCustomerBalance(Customer customer) {
	   int balance =0;
	   for(Account account : customer.getAccounts()) {
		   balance = balance+ account.getBalance();
	   }
	   return balance;
   }
   public static int getCustomerNegativeBalance(Customer customer) {
	   int balance=0;
	   for(Account account : customer.getAccounts()) {
		   if(account.getBalance()<0) {
		   balance = balance+ account.getBalance();
		   }
	   }
	   return balance;
   }
   public static int getCustomerPositiveBalance(Customer customer) {
	   int balance=0;
	   for(Account account : customer.getAccounts()) {
		   if(account.getBalance()>0) {
		   balance = balance+ account.getBalance();
		   }
	   }
	   return balance;
   }
   

}
