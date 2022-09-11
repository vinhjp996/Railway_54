package Exercise_6.Question_2;

import java.util.Scanner;

public abstract class User {

	private String name;
	private double salary_ratio;

	Scanner scanner = new Scanner(System.in);

	public String nhapName() {
		System.out.println("Moi Ban Nhap Name: ");
		String nhapNamee = scanner.nextLine();
		this.name = nhapNamee;
		return name;

	}

	public double nhapSalaryRatio() {
		System.out.println("Moi Ban Nhap Salary: ");
		double nhapSalary = scanner.nextDouble();
		this.salary_ratio = nhapSalary;
		return salary_ratio;

	}

	public abstract double calculatePay();

	public void displayInfor() {

	}

}
