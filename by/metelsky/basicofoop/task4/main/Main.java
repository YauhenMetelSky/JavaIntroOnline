package by.metelsky.basicofoop.task4.main;

import by.metelsky.basicofoop.task4.controller.Controller;
import by.metelsky.basicofoop.task4.view.View;
import by.metelsky.basicofoop.task4.view.ViewProvider;

public class Main {

	public static void main(String[] args) {
		ViewProvider provider  = ViewProvider.getInstance();
		View view = provider.getView();
		view.showMenu();
		String request = view.userChoice();
		Controller controller =new Controller();
		view.show(controller.doAction(request));

	}

}
