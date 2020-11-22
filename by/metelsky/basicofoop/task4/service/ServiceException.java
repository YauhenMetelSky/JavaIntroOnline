package by.metelsky.basicofoop.task4.service;

public class ServiceException extends Exception {
	public ServiceException() {
		super();
	}
	public ServiceException(Exception e) {
		super(e);
	}
	public ServiceException(String message) {
		super(message);
	}
	public ServiceException(String message, Exception e) {
		super(message,e);
	}

}
