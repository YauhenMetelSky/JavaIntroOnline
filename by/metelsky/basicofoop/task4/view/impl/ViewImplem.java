package by.metelsky.basicofoop.task4.view.impl;

import java.util.Scanner;

import by.metelsky.basicofoop.task4.view.View;

public class ViewImplem implements View {

	@Override
	public String userChoice() {
		Scanner sc = new Scanner(System.in);		
		return sc.nextLine();
	}

	@Override
	public void show(String string) {
		System.out.println(string);
		
	}

	
	@Override
	public void showMenu() {
		System.out.println("Make your chois");
		System.out.println("1-I show you all my treasures");
		System.out.println("2-I show you the most expensive treasure");
		System.out.println("3-I show you treasures for you money, show me your money");
		
	}
	

}
