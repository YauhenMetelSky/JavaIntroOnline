package by.metelsky.classes.simpleclasses.task8;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Ivanov","Ivan","Ivanovich","City, Street 2, house 1",1236598711110916L,"BY03BPSB30120000121200009300");
		Customer customer2 = new Customer(2,"Petrov","Ivan","Nikolaevich","City, Street 1, house 16",1592298152987313L,"BY03BPSB30120000121300009400");
		Customer customer3 = new Customer(3,"Sidorov","Yauhen","Anatolievch","City, Street 5, house 12",2853516619300349L,"BY03BPSB30120000121400009500");
		Customer customer4 = new Customer(4,"Ivanov","Petr","Petrovich","City, Street 3, house 87",2863849692183580L,"BY03BPSB30120000121500009600");
		Customer customer5 = new Customer(5,"Topolev","Sigizmund","Ivanovich","City, Street 1, house 13",7305503356675926L,"BY03BPSB30120000121600009700");
		Customer customer6 = new Customer(6,"Lebedeva","Olga","Ivanovna","City, Street 2, house 22",9860431590367486L,"BY03BPSB30120000121700009800");
		Customer customer7 = new Customer(7,"Prokopovich","Irina","Petrovna","City, Street 8, house 4",4062233780899334L,"BY03BPSB30120000121800009900");
		Customer customer8 = new Customer(8,"Galushkina","Keterina","Matveevna","City, Street 5, house 3",2967635659939114L,"BY03BPSB30120000121800010000");
		Customer customer9 = new Customer(9,"Shalamov","Varlam","Tihonovich","City, Street 5, house 12",3188001122453777L,"BY03BPSB301200001219000011000");
		CustomerBase firstCategoryClients = new CustomerBase();
		firstCategoryClients.addCustomer(customer1);
		firstCategoryClients.addCustomer(customer2);
		firstCategoryClients.addCustomer(customer3);
		firstCategoryClients.addCustomer(customer4);
		firstCategoryClients.addCustomer(customer5);
		firstCategoryClients.addCustomer(customer6);
		firstCategoryClients.addCustomer(customer7);
		firstCategoryClients.addCustomer(customer8);
		firstCategoryClients.addCustomer(customer9);
		CustomerBaseLogic baseLogic = CustomerBaseLogic.getInstance();
		baseLogic.sortCustomersByFullName(firstCategoryClients);
		List<Customer> list = baseLogic.getCustomerByCreditCardNumberBounds(firstCategoryClients, 1236598711110916L, 7305503356675926L);
		View view = new View();
		view.printCustomerList(firstCategoryClients.getCustomerBase());
		System.out.println("");
		view.printCustomerList(list);
		
	}

}
