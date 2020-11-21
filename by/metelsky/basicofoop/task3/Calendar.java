package by.metelsky.basicofoop.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private List<Day> month;

	public Calendar() {
		month = new ArrayList<>();
	}

	public Calendar(List<Day> month) {
		this.month = month;
	}

	public boolean addDay(Day day) {
		return month.add(day);
	}

	public boolean removeDay(Day day) {
		return month.remove(day);
	}

	public List<Day> getMonth() {
		return month;
	}

	public void setMonth(List<Day> month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
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
		Calendar other = (Calendar) obj;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		return true;
	}

	public static class Day implements Serializable {
		private int dayNumber;
		private WeekDays day;
		private boolean isWeekend = false;

		
		public Day() {

		}

		public Day(int dayNumber, WeekDays day) {
			this.dayNumber = dayNumber;
			this.day = day;
			if(day.equals(WeekDays.SATURDAY) ||day.equals(WeekDays.SUNDAY)) {
				isWeekend = true;
			}
		}

		public int getDayNumber() {
			return dayNumber;
		}

		public void setDayNumber(int dayNumber) {
			this.dayNumber = dayNumber;
		}

		public WeekDays getDay() {
			return day;
		}

		public void setDay(WeekDays day) {
			this.day = day;
		}

		public boolean isWeekend() {
			return isWeekend;
		}

		public void setWeekend(boolean weekend) {
			isWeekend = weekend;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (isWeekend ? 1231 : 1237);
			result = prime * result + ((day == null) ? 0 : day.hashCode());
			result = prime * result + dayNumber;
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
			Day other = (Day) obj;
			if (isWeekend != other.isWeekend)
				return false;
			if (day != other.day)
				return false;
			if (dayNumber != other.dayNumber)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Day [dayNumber=" + dayNumber + ", day=" + day + ", Weekend=" + isWeekend + "]";
		}

	}

}
