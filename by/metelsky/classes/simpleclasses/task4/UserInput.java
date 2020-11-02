package by.metelsky.classes.simpleclasses.task4;

import java.util.Scanner;

public class UserInput {
	private int userInput;
	
	private void userInput() {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			sc.next();
		}
		userInput = sc.nextInt();
	}
	public int getUserInput() {
		userInput();
		return userInput;
	}
	

}
