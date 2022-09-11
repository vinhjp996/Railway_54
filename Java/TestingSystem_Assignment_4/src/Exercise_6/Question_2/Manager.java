package Exercise_6.Question_2;

public class Manager extends User {

	@Override
	public double calculatePay() {
		return nhapSalaryRatio() * 520;
	}

}
