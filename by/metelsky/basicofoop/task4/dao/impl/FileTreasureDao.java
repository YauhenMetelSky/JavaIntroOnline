package by.metelsky.basicofoop.task4.dao.impl;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.metelsky.basicofoop.task4.bean.Treasure;
import by.metelsky.basicofoop.task4.dao.DAOException;
import by.metelsky.basicofoop.task4.dao.TreasureDAO;

public class FileTreasureDao implements TreasureDAO {
	private static final String TREASURE_SOURCE = "src/resources/treasuresString.txt";

	@Override
	public List<Treasure> getAllTreasures() throws DAOException {
		List<Treasure> treasures = new ArrayList<>();
		File file = new File(TREASURE_SOURCE);
		BufferedReader reader = null;
		String[] treasureParam;
		try {
			reader = new BufferedReader(new FileReader(file));
			while (reader.ready()) {
				treasureParam = reader.readLine().split(";");
				String name = treasureParam[0].split("=")[1];
				int price = Integer.parseInt(treasureParam[2].split("=")[1]);
				String material = treasureParam[1].split("=")[1];
				treasures.add(new Treasure(price, name, material));
			}

		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

		return treasures;
	}

	@Override
	public Treasure getMostExpenciveTreasure() throws DAOException {
		Treasure treasure;
		File file = new File(TREASURE_SOURCE);
		BufferedReader reader = null;
		String[] treasureParam;
		try {
			reader = new BufferedReader(new FileReader(file));
			treasure = new Treasure();
			treasureParam = reader.readLine().split(";");
			treasure.setPrice(Integer.parseInt(treasureParam[2].split("=")[1]));			
			while (reader.ready()) {
				treasureParam = reader.readLine().split(";");
				int price = Integer.parseInt(treasureParam[2].split("=")[1]);
				if(treasure.getPrice()<price) {
				String name = treasureParam[0].split("=")[1];
				String material = treasureParam[1].split("=")[1];
				treasure = new Treasure(price, name, material);
				}
			}

		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

		return treasure;
	}

	@Override
	public List<Treasure> getTreasureByMoneyAmount(int money) throws DAOException{
		List<Treasure> treasures = new ArrayList<>();
		File file = new File(TREASURE_SOURCE);
		BufferedReader reader = null;
		String[] treasureParam;
		try {
			reader = new BufferedReader(new FileReader(file));
			while (reader.ready()) {
				treasureParam = reader.readLine().split(";");
				int price = Integer.parseInt(treasureParam[2].split("=")[1]);
				if(money>price) {
				String name = treasureParam[0].split("=")[1];
				String material = treasureParam[1].split("=")[1];
				treasures.add(new Treasure(price, name, material));
				money = money-price;
				}
			}

		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

		return treasures;
	}

}
