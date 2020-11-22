package by.metelsky.basicofoop.task4.service;

import by.metelsky.basicofoop.task4.service.impl.TreasureServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {
		
	}
	public static ServiceProvider getInstance() {
		return instance;
	}
	private TreasureService treasureService = new TreasureServiceImpl();

	public TreasureService getTreasureService() {
		return treasureService;
	}
	

}
