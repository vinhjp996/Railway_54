package Assignment_2;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {

//		question1();

//		bài 2

//		question3();

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap So Phan Tu Cua Mang:");
//		int n = scanner.nextInt();
//		int a[] = new int[n];
//
//		// để nhập vào cac gtri a[i] cua mang
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");
//			a[i] = scanner.nextInt();
//		}
//		question3_a(a);
//		question4();
//		question5();
		question6();
	}

	// viet 1 phuong thuc truyen vao 1 so tinh in và foot cua no
	// viet 1 phuong thuc cho nhap vao 1 so tinh in và foot cua no
	/*
	 * Question 1: Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là
	 * centimet (cm). Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ
	 * thập phân) và inch (số thực, có 2 số lẻ thập phân). Với 1 inch = 2.54 cm và 1
	 * foot = 12 inches.
	 */
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi Ban Nhap So Thuc:");
		float a = scanner.nextFloat();
		System.out.printf("So inch La: %5.2f%n", a / 2.54); // 24inch
		System.out.printf("So fool La: %5.2f%n", (a / 2.54) / 12);
	}

	public void question1a(float a) {

		System.out.printf("So inch La: %5.2f%n", a / 2.54); // 24inch
		System.out.printf("So fool La: %5.2f%n", (a / 2.54) / 12);
	}

	/*
	 * Question 2: Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây
	 * này thành dạng [giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
	 * Ví dụ: 02:11:05
	 */

	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi Ban Nhap So Nguyen:");
		long a = scanner.nextInt();
		long x = a % 60;// so giay
		long y = (a / 60) % 60;
		long z = ((a / 60) / 60) % 24;
		long n = (((a / 60) / 60) / 24) % 30;
		long t = (((a / 60) / 60) / 24) / 30;

		System.out.println("So Giay " + x);
		System.out.println("So Phut " + y);
		System.out.println("So Gio " + z);
		System.out.println("So Ngay " + n);
		System.out.println("So Thang " + t);
		System.out.println(t + ":" + n + ":" + z + ":" + y + ":" + x);

	}

	/*
	 * Question 3: Viết chương trình nhập vào 4 số nguyên. Hiển thị ra số lớn nhất
	 * và nhỏ nhất Ví dụ: nhập vào 4 số 1,2,3,4 thì kết quả là: Số lớn nhất là: 4 Số
	 * nhỏ nhất là: 1
	 */

	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi Ban Nhap So Phan Tu Cua Mang:");
		int n = scanner.nextInt();
		int a[] = new int[n];

		// để nhập vào cac gtri a[i] cua mang
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();

		}
		int max = a[0];
		int min = a[0];

		System.out.println();
		System.out.print("Cac So Trong Mang La: ");
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (max < a[i]) {
				max = a[i];

			}
			if (min > a[i]) {
				min = a[i];

			}

		}
		System.out.println();
		System.out.println("So Max La: " + max);
		System.out.println("So Min La: " + min);
	}

	public static void question3_a(int a[]) {

		int max = a[0];
		int min = a[0];

		System.out.println();
		System.out.print("Cac So Trong Mang La: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (max < a[i]) {
				max = a[i];

			}
			if (min > a[i]) {
				min = a[i];

			}

		}
		System.out.println();
		System.out.println("So Max La: " + max);
		System.out.println("So Min La: " + min);
	}

	/*
	 * Question 4: Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó. Nếu
	 * hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai]. Nếu
	 * hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].
	 */

	public static void question4() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi Ban Nhap So a= ");
		int a = scanner.nextInt();
		System.out.print("Moi Ban Nhap So b= ");
		int b = scanner.nextInt();
		int hieu = a - b;
		if (hieu > 0) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai ");

		} else {
			System.out.println("Số thứ nhất nho hơn số thứ hai ");

		}

	}

	/*
	 * Question 5: Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b
	 * không
	 */

	public static void question5() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi Ban Nhap So a= ");
		int a = scanner.nextInt();
		System.out.print("Moi Ban Nhap So b= ");
		int b = scanner.nextInt();
		if (a % b == 0) {
			System.out.println("a Chia Het Cho b ");

		} else {
			System.out.println("a Khong Chia Het Cho b ");

		}

	}

	/*
	 * Question 6: Xếp loại sinh viên theo các qui luật dưới đây: Nếu điểm >= 9.0 -
	 * Loại xuất sắc Nếu 8.0<= điểm < 9.0 - Loại giỏi Nếu 7.0<= điểm < 8.0 - Loại
	 * khá
	 * 
	 * 2
	 * 
	 * Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá Nếu 5.0 <= điểm < 6.0 - Loại
	 * trung bình Nếu điểm < 5.0 - Loại kém Với điểm = ( (điểm toán)*2 + điểm lý +
	 * điểm hóa )/4 Viết Chương trình: a. Nhập vào điểm 3 môn học b. Tính điểm trung
	 * bình c. Xác định học lực của học sinh dựa trên điểm trung bình d. Hiển thị
	 * học lực của học sinh
	 */

	public static void question6() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi Ban Nhap Diem Toan ");
		float toan = scanner.nextFloat();
		System.out.print("Moi Ban Nhap Diem Ly ");
		float ly = scanner.nextFloat();
		System.out.print("Moi Ban Nhap Diem Hoa ");
		float hoa = scanner.nextFloat();
		float dtb = ((toan * 2) + ly + hoa) / 4;

		if (dtb >= 9) {
			System.out.println("Loai Xuat Xac");

		} else if (dtb >= 8) {
			System.out.println("Loai Gioi");

		} else if (dtb >= 7) {
			System.out.println("Loai Kha");

		} else if (dtb >= 6) {
			System.out.println("Loai Trung Binh Kha");

		} else if (dtb >= 5) {
			System.out.println("Loai Trung Binh");

		} else
			System.out.println("Loai Kem");
		System.out.println("Diem Trung Binh La: " + dtb);

	}

}
