package by.metelsky.basicofoop.task4.service.util;

public class Validator {
	public static boolean isCredentialValid(int money) {
		if(money >0) {
			return true;
		}
		return false;
	}

}
