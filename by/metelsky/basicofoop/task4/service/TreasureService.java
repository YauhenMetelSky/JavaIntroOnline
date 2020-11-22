package by.metelsky.basicofoop.task4.service;

import java.util.Comparator;
import java.util.List;

import by.metelsky.basicofoop.task4.bean.Treasure;
import by.metelsky.basicofoop.task4.dao.DAOException;

public interface TreasureService {
	
	List<Treasure> getAllTreasures() throws ServiceException;
	Treasure getMostExpenciveTreasure() throws ServiceException;
	List<Treasure> getTreasureByMoneyAmount(int money) throws ServiceException;
	

}
