package by.metelsky.basicofoop.task4.service.impl;

import java.util.Comparator;
import java.util.List;

import by.metelsky.basicofoop.task4.bean.Treasure;
import by.metelsky.basicofoop.task4.dao.DAOException;
import by.metelsky.basicofoop.task4.dao.DAOProvider;
import by.metelsky.basicofoop.task4.dao.TreasureDAO;
import by.metelsky.basicofoop.task4.service.ServiceException;
import by.metelsky.basicofoop.task4.service.TreasureService;
import by.metelsky.basicofoop.task4.service.util.Validator;

public class TreasureServiceImpl implements TreasureService {
	DAOProvider provider = DAOProvider.getInstance();
	TreasureDAO treasureDAO = provider.getTreasureDAO();

	@Override
	public List<Treasure> getAllTreasures() throws ServiceException {
		List<Treasure> treasures;
		try {
			treasures = treasureDAO.getAllTreasures();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return treasures;
	}

	@Override
	public Treasure getMostExpenciveTreasure() throws ServiceException {
		Treasure treasure;
		try {
			treasure = treasureDAO.getMostExpenciveTreasure();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return treasure;
	}

	@Override
	public List<Treasure> getTreasureByMoneyAmount(int money) throws ServiceException {
		List<Treasure> treasures;
		if (!Validator.isCredentialValid(money)) {
			throw new ServiceException("money value < 0 or money value =0");
		} else {
			try {
				treasures = treasureDAO.getTreasureByMoneyAmount(money);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
		}
		return treasures;
	}

}
