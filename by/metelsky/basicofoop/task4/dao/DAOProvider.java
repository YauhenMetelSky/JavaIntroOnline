package by.metelsky.basicofoop.task4.dao;

import by.metelsky.basicofoop.task4.dao.impl.FileTreasureDao;

public class DAOProvider {
	private final static DAOProvider instance = new DAOProvider();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	private TreasureDAO treasureDAO = new FileTreasureDao();

	public TreasureDAO getTreasureDAO() {
		return treasureDAO;
	}

}
