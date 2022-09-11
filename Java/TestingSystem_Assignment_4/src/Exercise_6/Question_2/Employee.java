package Exercise_6.Question_2;

public class Employee extends User {

	@Override
	public double calculatePay() {
		return nhapSalaryRatio() * 420;
	}

}
