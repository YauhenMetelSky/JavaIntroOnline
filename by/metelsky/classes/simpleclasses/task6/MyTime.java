package by.metelsky.classes.simpleclasses.task6;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени 
 * и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class MyTime {

	private static final int MIN_VALUE_HOUR = 0;
	private static final int MAX_VALUE_HOUR = 24;
	private static final int MIN_VALUE_MINUTE = 0;
	private static final int MAX_VALUE_MINUTE = 60;
	private static final int MIN_VALUE_SECOND = 0;
	private static final int MAX_VALUE_SECOND = 60;

	private int hour;
	private int minute;
	private int second;

	public void setHour(int hour) {
		if (MIN_VALUE_HOUR <= hour && hour < MAX_VALUE_HOUR) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public void setMinute(int minute) {
		if (MIN_VALUE_MINUTE <= minute && minute < MAX_VALUE_MINUTE) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public void setSecond(int second) {
		if (MIN_VALUE_SECOND <= second && second < MAX_VALUE_SECOND) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public void changeHour(int hour) {
		if (hour >= 0) {
			this.hour = this.hour + hour;
			if (this.hour >= MAX_VALUE_HOUR) {
				this.hour = this.hour % MAX_VALUE_HOUR;
			}
		}

	}

	public void changeMinute(int minute) {
		if (minute >= 0) {
			this.minute = this.minute + minute;
			if (this.minute >= MAX_VALUE_MINUTE) {
				changeHour(this.minute / MAX_VALUE_MINUTE);
				this.minute = this.minute % MAX_VALUE_MINUTE;
			}
		}

	}

	public void changeSecond(int second) {
		if (second >= 0) {
			this.second = this.second + second;
			if (this.second >= MAX_VALUE_SECOND) {
				changeMinute(this.second / MAX_VALUE_SECOND);
				this.second = this.second % MAX_VALUE_SECOND;
			}
		}

	}
		
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyTime other = (MyTime) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}
	
	

}
