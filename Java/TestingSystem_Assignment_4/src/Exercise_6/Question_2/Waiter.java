package Exercise_6.Question_2;

public class Waiter extends User {

	@Override
	public double calculatePay() {
		return nhapSalaryRatio() * 220;
	}

}
