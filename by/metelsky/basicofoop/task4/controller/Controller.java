package by.metelsky.basicofoop.task4.controller;

import java.util.ArrayList;
import java.util.List;

import by.metelsky.basicofoop.task4.bean.Treasure;
import by.metelsky.basicofoop.task4.service.ServiceException;
import by.metelsky.basicofoop.task4.service.ServiceProvider;
import by.metelsky.basicofoop.task4.service.TreasureService;
import by.metelsky.basicofoop.task4.service.impl.TreasureServiceImpl;

public class Controller {

	public String doAction(String request) {

		String[] commands = request.split(" ");
		String response;
		switch (commands[0]) {
		case "1":
			response = doGetAllTreasures();
			break;
		case "2":
			response = doGetMostExpenciveTreasure();
			break;
		case "3":
			response = dogetTreasureByMoneyAmount(commands[1]);
			break;
		default:
			response = "No such command, sorry";
		}
		return response;
	}

	public String doGetAllTreasures() {
		List<Treasure> treasures = new ArrayList<>();
		ServiceProvider provider = ServiceProvider.getInstance();
		TreasureService treasureService = provider.getTreasureService();
		try {
			treasures = treasureService.getAllTreasures();
		} catch (ServiceException e) {
			System.err.println(e);
		}
		StringBuilder string = new StringBuilder();
		for (Treasure treasure : treasures) {
			string.append(treasure.toString());
			string.append(";");	
		}	
		return string.toString();

	}

	public String doGetMostExpenciveTreasure() {
		Treasure treasure = null;
		String string;
		ServiceProvider provider = ServiceProvider.getInstance();
		TreasureService treasureService = provider.getTreasureService();
		try {
			treasure = treasureService.getMostExpenciveTreasure();
		} catch (ServiceException e) {
			System.err.println(e);
		}
		return treasure.toString();

	}

	public String dogetTreasureByMoneyAmount(String request) {
		List<Treasure> treasures = new ArrayList<>();
		int money = Integer.parseInt(request);
		ServiceProvider provider = ServiceProvider.getInstance();
		TreasureService treasureService = provider.getTreasureService();
		try {
			treasures = treasureService.getTreasureByMoneyAmount(money);
		} catch (ServiceException e) {
			System.err.println(e);
		}
		StringBuilder string = new StringBuilder();
		for (Treasure treasure : treasures) {
			string.append(treasure.toString());
			string.append(";");
		}
		return string.toString();
	}

}
