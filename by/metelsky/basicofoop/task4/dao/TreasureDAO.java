package by.metelsky.basicofoop.task4.dao;
import by.metelsky.basicofoop.task4.dao.DAOException;
import java.util.List;

import by.metelsky.basicofoop.task4.bean.Treasure;

public interface TreasureDAO {
	
	List<Treasure> getAllTreasures() throws DAOException;
	Treasure getMostExpenciveTreasure() throws DAOException;
	List<Treasure> getTreasureByMoneyAmount(int money) throws DAOException;
	
}
