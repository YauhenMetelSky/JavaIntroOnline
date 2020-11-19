package by.metelsky.classes.agregationcomposition.task4;
/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
 * имеющим положительный и отрицательный балансы отдельно.*/
public class Task4 {

	public static void main(String[] args) {
		Account account1 =new Account(1,12369);
		Account account2 =new Account(2,1000);
		Account account3 =new Account(3,-600);
		Account account4 =new Account(4,-2500);
		Account account5 =new Account(5,-19);
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Ivan");
		customer.setSurname("Ivanov");
		customer.addAccount(account1);
		customer.addAccount(account2);
		customer.addAccount(account3);
		customer.addAccount(account4);
		customer.addAccount(account5);
		View view = new View();
		view.printAccounts(customer.getAccounts());
		CustomerLogic.sortAccountsByBalance(customer);
		view.printAccounts(customer.getAccounts());
		view.printBalance(CustomerLogic.getCustomerBalance(customer));
		view.printNegativeBalance(CustomerLogic.getCustomerNegativeBalance(customer));
		view.printPositiveBalance(CustomerLogic.getCustomerPositiveBalance(customer));
		
	}

}
