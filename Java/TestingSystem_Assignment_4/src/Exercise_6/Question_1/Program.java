package Exercise_6.Question_1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		VietnamesePhone vietnamesePhone = new VietnamesePhone();
//		vietnamesePhone.insertContact("iphone", "iphone13");
//		vietnamesePhone.removeContact("iphone11");
//		vietnamesePhone.updateContact("iphone", "iphone12");
//		vietnamesePhone.searchContact("iphone");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi Ban Nhap Vao Ten");
		String name = scanner.nextLine();
		System.out.println("Moi Ban Nhap Vao Ten");
		String phone = scanner.nextLine();
		vietnamesePhone.insertContact(name, phone);

	}
}