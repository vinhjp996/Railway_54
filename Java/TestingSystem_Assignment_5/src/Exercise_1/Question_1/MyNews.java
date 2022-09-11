package Exercise_1.Question_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
	New new1 = new New();
	Scanner scanner = new Scanner(System.in);
	ArrayList<New> news = new ArrayList<>();

	public void menu() {
		boolean checkContinue = true;
		while (checkContinue) {
			System.out.println("1-Insert news");
			System.out.println("2-View list news");
			System.out.println("3-Average rate");
			System.out.println("4-Exit ");
			System.out.println("Moi Ban Chon.");
			int choose = scanner.nextInt();
			scanner.nextLine();
			switch (choose) {
			case 1:
				insertNews();
				break;
			case 2:
				new1.Display();
				break;
			case 3:
				new1.Calculate(new1.getRates());
				new1.Display();
				break;
			case 4:
				System.out.println("Exit");
				return;

			default:
				System.out.println("Ban Da Nhap Sai, Moi Ban Nhap Lai");
				break;
			}
		}
	}

	public void insertNews() {
		System.out.println("Moi Ban Nhap Thong Tin Vao Title");
		String title = scanner.nextLine();
		new1.setTitle(title);

		System.out.println("Moi Ban Nhap Thong Tin Vao PublishDate ");
		String publishDate = scanner.nextLine();
		new1.setPublishDate(publishDate);

		System.out.println("Moi Ban Nhap Thong Tin Vao Author ");
		String author = scanner.nextLine();
		new1.setAuthor(author);

		System.out.println("Moi Ban Nhap Thong Tin Vao Content ");
		String content = scanner.nextLine();
		new1.setContent(content);

		System.out.println("Nhap Vao Danh Gia Thu 1: ");
		int danhGia1 = scanner.nextInt();

		System.out.println("Nhap Vao Danh Gia Thu 2: ");
		int danhGia2 = scanner.nextInt();

		System.out.println("Nhap Vao Danh Gia Thu 3: ");
		int danhGia3 = scanner.nextInt();

		int[] danhGias = { danhGia1, danhGia2, danhGia3 };
		new1.setRates(danhGias);
	}

}
