package Exercise_4.question_2;

public class Datte {

	private int day;
	private int month;
	private int year;

	public Datte(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Datte [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public boolean isLeapYear() {
		return true;

	}
}
