package Assignment_2;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {

//		question_1();
//		question_2();
//		question_3();
//		question_4();
//		question_5();
//		question_6();
		question_7();
	}

	/*
	 * Question 1: Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 . Hãy liệt kê các
	 * phần tử xuất hiện trong dãy đúng một lần
	 */

	public static void question_1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("So Phan Tu Cua Mang La: ");
		int n = scanner.nextInt();
		int a[] = new int[n];// a[0]->a[n-1]
		int b[] = new int[1000000000];

		// nhap vao
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();

		}
		// in ra
		System.out.println("Mang la:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}

		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		System.out.println();
		System.out.println("Cac ptu chi xuat hien 1 lan la:");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 1) {
				System.out.println("so " + i + " xuat hien " + b[i] + " làn");
			}
		}

	}

	/*
	 * Question 2: Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1. Hãy liệt kê các
	 * phần tử xuất hiện trong dãy đúng 2 lần.
	 */

	public static void question_2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("So Phan Tu Cua Mang La: ");
		int n = scanner.nextInt();
		int a[] = new int[n];// a[0]->a[n-1]
		int b[] = new int[1000];

		// nhap vao
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();

		}
		// in ra
		System.out.println("Mang la:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}

		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		System.out.println();
		System.out.println("Cac ptu chi xuat hien 2 lan la:");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				System.out.println("so " + i + " xuat hien " + b[i] + " làn");
			}
		}

	}

	/*
	 * Question 3: Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 . In ra màn hình
	 * số lần xuất hiện của các phần tử.
	 */

	public static void question_3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("So Phan Tu Cua Mang La: ");
		int n = scanner.nextInt();
		int a[] = new int[n];// a[0]->a[n-1]
		int b[] = new int[1000];

		// nhap vao
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();

		}
		// in ra
		System.out.println("Mang la:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}

		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		System.out.println();
		System.out.println("So Lan Xuat Hien Cua cac ptu la:");
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.println("so " + i + "xuat hien " + b[i] + " làn");
			}
		}

	}

	/*
	 * Question 4: Hãy viết chương trình tính tổng các chữ số của một số nguyên bất
	 * kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
	 */

	public static void question_4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("So Phan Tu Cua Mang La: ");
		int n = scanner.nextInt();// 12345
		// chuyển từ sô sang chữ.
		String m = String.valueOf(n);// chuyen tu so sang chữ
		String a[] = m.split("");// {"1","2","3","4","5"} mình mong muốn {1,2,3,4,5}
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			int x = Integer.parseInt(a[i]);// chuyen tu chũ thanh so
			tong = tong + x;
		}
		System.out.println("Tong Cua Cac Chu So La: " + tong);
	}

	/*
	 * Question 5: Viết chương trình phân tích một số nguyên thành các thừa số
	 * nguyên tố Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
	 */

	public static void question_5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so ngau nhien: ");
		int n = scanner.nextInt();
		int i = 2;
		while (n > 1) {// neu n van lon hon 1 thi while van chay, chi dung khi n<=1

			if (n % i == 0) {
				n = n / i;// 1
				System.out.print(i + "  ");
			} else {
				i++;
			}
		}
	}

	/*
	 * Question 6: Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho
	 * trước.
	 */

	public static void question_6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so ngau nhien: ");
		int n = scanner.nextInt();
		int kt = 0;
		System.out.println("Cac So Nguyen To Be Hon " + n);
		for (int i = 2; i < n; i++) {
			kt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					kt++;
					break;
				}
			}
			if (kt == 0) {
				System.out.print(i + " ");

			}

		}

	}

	/*
	 * Question 7: Viết chương trình liệt kê n số nguyên tố đầu tiên.
	 */
	public static void question_7() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n So Nguyen To Dau Tien: ");
		int n = scanner.nextInt();
		int kt = 0;
		int dem = 0;// dem so so nguyen to dau tien
		System.out.println(n + " So Nguyen To dau tien la: ");// {1 4 2 34 6323 }
		for (int i = 2; i < 1000000; i++) {
			kt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					kt++;
					break;
				}
			}
			if (kt == 0) {
				System.out.print(i + " ");
				dem++;
			}
			if (dem == n) {
				break;
			}
		}
	}

}
