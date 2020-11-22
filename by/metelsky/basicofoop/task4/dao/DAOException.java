package by.metelsky.basicofoop.task4.dao;

public class DAOException extends Exception{
	public DAOException() {
		super();
		//4 constructors
	}
	public DAOException(Exception e) {
		super(e);
		//4 constructors
	}
	
	public DAOException(String message) {
		super(message);
	}
	public DAOException(String message, Exception e) {
		super(message,e);
	}

}
