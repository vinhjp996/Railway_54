public class Program {

	/*
	 * Bài tập 1: Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép
	 * ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương” Nếu số vừa
	 * nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên
	 * âm”.
	 */
// Day La Phuong Thuc Kiem Tra Xem Mot so co phai la mot so nguyen to hay k
	public static boolean kiemTraSoNguyenTo(int a) {
		boolean kt = true;
		// viết code để ktra số đầu vào là số nguyên to(kt =true) hay ko phải(kt=false)

		if (a < 2) // /*Số nhỏ hơn 2 không phải số nguyên tố
			return false;
		/* Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không */
		// == là dùng để so sanh xem 2 so có bang nhau ko
		// = là để gán gtri cho 1 bien nào do

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				kt = false;
				break;
			}
		}
		return kt;
	}

	public static void main(String[] args) {
		/*
		 * Bài tập 8: Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
		 * In ra tất cả số nguyên tố trong khoảng từ 0 - n.
		 */
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So: ");
//		int n = scanner.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (kiemTraSoNguyenTo(i) == true) {
//				System.out.println(i);
//			}
//		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So: ");
//		int x = scanner.nextInt();
//		if (x >= 0) {
//			System.out.println(" Day La So Nguyen Duong ");
//
//		} else {
//			System.out.println(" Day La So Nguyen Am ");
//
//		}

		/*
		 * Bài tập 2: Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi
		 * chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
		 */

//		System.out.print("Moi Ban Nhap Vao So: ");
//		int x = scanner.nextInt();
//
//		switch (x) {
//		case 1:
//			System.out.println("Mot");
//			break;
//		case 2:
//			System.out.println("Hai");
//			break;
//		case 3:
//			System.out.println("Ba");
//			break;
//		case 4:
//			System.out.println("Bon");
//			break;
//		case 5:
//			System.out.println("Nam");
//			break;
//		default:
//			System.out.println("Gia Tri Khac");
//			break;
//		}
//
//	}

		/*
		 * Bài tập 3: Viết chương trình cho phép nhập vào 3 số thực Chương trình này sẽ
		 * kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Thu Nhat: ");
//		int a = scanner.nextInt();
//
//		System.out.print("Moi Ban Nhap Vao So Thu Hai: ");
//		int b = scanner.nextInt();
//
//		System.out.print("Moi Ban Nhap Vao So Thu Ba: ");
//		int c = scanner.nextInt();
//
//		if (a + b > c && b + c > a && a + c > b) {
//			System.out.println("Day La Mot Tam Giac");
//
//		} else {
//			System.out.println("Day Khong Phai La Mot Tam Giac");
//		}
//
//	}
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Moi Ban Nhap Vao So Thu Nhat: "); int a =
		 * scanner.nextInt(); System.out.print("Moi Ban Nhap Vao So Thu Hai: "); int b =
		 * scanner.nextInt();
		 * 
		 * System.out.print("Moi Ban Nhap Vao So Thu Ba: "); int c = scanner.nextInt();
		 * 
		 * if (a + b > c && b + c > a && a + c > b) { if (a * a == b * b + c * c || b *
		 * b == a * a + c * c || c * c == a * a + b * b) {
		 * System.out.println("Day La Mot Tam Giac Vuong");
		 * 
		 * } else System.out.println("Day La Mot Tam Giac Khong Vuong"); } else
		 * System.out.println("Day Khong Phai La Mot Tam Giac Vuong");
		 */

		/*
		 * Bài tập 5*: Viết chương trình cho phép người dùng nhập vào mã số sinh viên
		 * Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không. Định
		 * dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu
		 * thức chính quy để ràng buộc định dạng)
		 */

		// Bxxxxxxx B1234567

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao Ma So Sinh Vien: ");
//		String aString = scanner.nextLine();
//		if (aString.matches("B\\d{7}")) {
//			System.out.println("Dung");
//		} else {
//			System.out.println("Sai");
//		}
//		

		/*
		 * Bài tập 6: Viết chương trình cho phép nhập vào một số nguyên dương n, tính
		 * tổng tất cả số chẵn trong khoảng từ 0 - n.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Nguyen Duong: ");
//		int a = scanner.nextInt();
//		int tong = 0;

//		Cach 1: Trong vong for thi minh se xet dieu kien i%2==0 thi chia het cho 2 va minh cong lai voi tong.
//		Cach 2: Minh bat dau tu i = 0. Sao moi vong lap, minh se tang i len 2 don vi. 

//		for (int i = 0; i <= a; i++) {
//			if (i % 2 == 0) {
//				tong = tong + i;
//			}
//
//		}
//		System.out.println("Tong = " + tong);

//		for (int i = 0; i <= a; i += 2) {
//			tong = tong + i;
//
//		}
//		System.out.println("Tong = " + tong);

		/*
		 * Bài tập 7: Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép
		 * nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Nguyen Duong: ");
//		int a = scanner.nextInt();
//		int nhan = 1;
//
//		for (int i = 1; i < a; i++) {
//			nhan = nhan * i;
//			System.out.println("Luc i = " + i + "thi tich =" + nhan);
//		}
//
//		System.out.println("Ket Qua Phep Nhan La: " + nhan);

		/*
		 * Bài tập 8: Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
		 * In ra tất cả số nguyên tố trong khoảng từ 0 - n.
		 */

		// nhạp vao 1 so tu ban phim. kỉm tra xem so day có phải la so nguyen to ko

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So : ");
//		int n = scanner.nextInt();

//		if (n < 2) // /*Số nhỏ hơn 2 không phải số nguyên tố
//			System.out.println("Đây ko phải la so  nguyen to.");
//
//		/* Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không */
//		// == là dùng để so sanh xem 2 so có bang nhau ko
//		// = là để gán gtri cho 1 bien nào do
//		int kt = 0;
//
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				System.out.println("Đây ko phải la so  nguyen to.");
//				kt++;
//				break;
//			}
//
//		}
//		if (kt == 0) {
//			System.out.println("Đây là so nguyen tó");
//		}

// Viêt 1 hàm tham số đầu vào là 1 số nguyên.   trả về true nếu là số nguyên tố , false nếu ko phải so nguyen to

//		while (i < n) {
//			if (n % i == 0) {
//				System.out.println("Đây ko phải la so  nguyen to.");
//				kt++;
//				break; /* Chỉ cần tìm thấy 1 ước số là đủ và thoát vòng lặp */
//			}
//
//		}
//
//		if (kt == 0) {
//			System.out.println("Đây là so nguyen tó");
//		}

//		System.out.println(kiemTraSoNguyenTo(1));

		/*
		 * Bài tập 9: Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra
		 * số Fibonacci ứng với nó. Số Fibonacci là số mà nó bằng tổng của 2 số
		 * Fibonacci trước nó. Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
		 * 
		 * Ta có ví dụ: Fi(2) = Fi(0) + Fi(1) = 1+1 = 2, Fi(3) =Fi(2) + Fi(1) = 2+1 = 3,
		 * Fi(4) = Fi(3) + Fi(2) = 3+2 = 5, … Giả sử n = 4, đầu ra sẽ là 5.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So: ");
//		int n = scanner.nextInt();// để tính Fi(n)
//
//		int fi[] = new int[n + 1];
//
//		fi[0] = 1;
//		fi[1] = 1;
//
//		for (int i = 2; i <= n; i++) {
//			fi[i] = fi[i - 1] + fi[i - 2];
//		}
//		System.out.println("Fi(" + n + ") = " + fi[n]);
//		

		/*
		 * Bài tập 10: Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên
		 * Sau đó kiểm tra xem co bao nhieu ma so dung dinh dang. Định dạng mã số sinh
		 * viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để
		 * ràng buộc định dạng)
		 */

//		Scanner scanner = new Scanner(System.in);
//		String msv[] = new String[5];
//		int kt = 0;// dùng de dem so msv dung dinh dạng
//		int kts = 0;// dung de dem TH sai
//		for (int i = 0; i < msv.length; i++) {
//			System.out.print("Moi Ban Nhap Vao So: ");
//			msv[i] = scanner.nextLine();
//			if (msv[i].matches("B\\d{7}")) {
//				// msv[i] == "B\\d{7}" true
//				// kt = kt + 1;
//				kt++;
//				// kt+=1;
//			} else {
//				kts++;
//			}
//		}
//		System.out.println("So msv dung la; " + kt);
//		System.out.println("So msv sai la; " + kts);

		/*
		 * Bài tập 11: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử
		 * số nguyên. Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng
		 * này.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Phan Tu Cua Mang: ");
//		int n = scanner.nextInt();
//		int msv[] = new int[n];
//		int tong = 0;
//		for (int i = 0; i < msv.length; i++) {
//			System.out.print("Moi Ban Nhap Vao So: ");
//			msv[i] = scanner.nextInt();
//			tong = tong + msv[i];
//		}
//		System.out.println("Trung Binh Cong La: " + (float) tong / n);

		/*
		 * Bài tập 12: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử
		 * số nguyên dương. Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn
		 * nhất.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Phan Tu Cua Mang: ");
//		int n = scanner.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("Moi Ban Nhap Vao So: ");
//			a[i] = scanner.nextInt();
//		}
//
//		int max = a[0];
//		for (int i = 1; i < a.length; i++) {
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
//		System.out.println("Max = " + max);

		/*
		 * Bài tập 14:
		 * 
		 * 
		 * Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
		 * Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
		 * 
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Phan Tu Cua Mang: ");
//		int n = scanner.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("Moi Ban Nhap Vao So: ");
//			a[i] = scanner.nextInt();
//		}
//		System.out.println("day trc khi doi cho la:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "  ");
//
//		}
//
//		for (int i = 0; i < a.length / 2; i++) {
//			int tg = a[i];
//			a[i] = a[n - 1 - i];
//			a[n - 1 - i] = tg;
//
//		}
//		System.out.println("day sau khi doi cho la:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "  ");
//
//		}

		/*
		 * Bài tập 15(*):
		 * 
		 * 
		 * Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào
		 * một mảng. Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai
		 * định dạng hay không (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x
		 * là số nguyên từ 0-9). Nếu có bất kỳ mã số nào sai định dạng thì chương trình
		 * in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”.
		 * (Sử dụng biểu thức chính quy để ràng buộc định dạng)
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao So Phan Tu Cua Mang: ");
//		int n = scanner.nextInt();
//		scanner.nextLine();
//		String msv[] = new String[n];// gán so ptu cho mang luon
//		// chưa biet co bao nhieu ptu;
//		int kt = 0;// dùng de dem so msv dung dinh dạng
//		int kts = 0;// dung de dem TH sai
//		for (int i = 0; i < msv.length; i++) {
//			System.out.print("Moi Ban Nhap Vao So thứ " + (i + 1) + " là: ");
//			msv[i] = scanner.nextLine();
//			if (msv[i].matches("00[2-5]L\\d{4}")) {
//				// msv[i] == "B\\d{7}" true
//				// kt = kt + 1;
//				kt++;
//				// kt+=1;
//			} else {
//				kts++;
//			}
//		}
//		System.out.println("So msv dung la: " + kt);
//		System.out.println("So msv sai la: " + kts);

		/*
		 * Bài tập 16:
		 * 
		 * 
		 * Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một
		 * ký tự. Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra
		 * “Có”, ngược lại in ra “Không”.
		 */
		// abc123xyz 1 chuỗi string
		// {abc123xyz, abc123xyz, abc123xyz}
		// abc123xyza a d
		// chữ a có xuat hien trong chuoi ko: có
		// chữ d có xuat hien trong chuoi ko: khong
		// abc123xyza a {a b c 1 2 3 x y z a} sub_string(@)

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao Mot Chuoi Ki Tu: ");
//		String n = scanner.nextLine();
//		System.out.print("Moi Ban Nhap Vao Mot Ki Tu: ");
//		String x = scanner.nextLine();
//		String a[] = n.split("");
//		int kt = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].equals(x)) {
//				System.out.print("Co.");
//				kt++;
//				break;
//			}
//
//		}
//		if (kt == 0) {
//			System.out.print("Khong.");
//
//		}

		/*
		 * Bài tập 17: Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó
		 * nhập vào một ký tự. Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong
		 * chuỗi(nếu có, số đếm bắt đầu từ 0). Nếu nó có xuất hiện trong chuỗi thì in ra
		 * vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao Mot Chuoi Ki Tu: ");
//		String n = scanner.nextLine();
//		System.out.print("Moi Ban Nhap Vao Mot Ki Tu: ");
//		String x = scanner.nextLine();
//		String a[] = n.split("");
//		int kt = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].equals(x)) {
//				System.out.println("Vi Tri Cua Ki Tu Co Gia Tri :" + x + " La " + (i + 1));
//				kt++;
//			}
//		}
//		if (kt == 0) {
//			System.out.print("Khong Ton Tai Trong Chuoi");
////			return;
//		} else {
//			System.out.println("So Lan Xuat Hien Cua Ki Tu " + x + " La :" + kt);
//		}

		// Nhap vào 1 so , in ra cac so từ 0 den so do

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhâp vao 1 so ");
//		int n = sc.nextInt();
//		int dem = 0;
//		for (int i = 0; i <= n; i++) {
//			System.out.print(i + "  ");
//
//			dem++;
//		}
//		System.out.println();
//		System.out.println("So phan tu tu 0 den " + n + " là " + dem);

		/*
		 * Bài tập 18: Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi
		 * này có xuất hiện số hay không. Nếu có tin ra “Có”, ngược lại, in ra “Không”.
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao Mot Chuoi Ki Tu: ");
//		String n = scanner.nextLine();
//		String a[] = n.split("");
//		int kt = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].matches("\\d")) {
//				System.out.println("Co");
//				kt++;
//				break;
//			}
//		}
//		if (kt == 0) {
//			System.out.println("Khong");
//
//		}

		/*
		 * Bài tập 20*:
		 * 
		 * Viết chương trình cho phép người dùng nhập vào 1 chuỗi, kiểm tra chuỗi này có
		 * phù hợp với yêu cầu hay không. Nếu có thì in ra “Duyệt!”, ngược lại in ra
		 * “Không duyệt”. Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự, không được
		 * chứa ký tự khoảng trắng, bắt đầu bằng một ký tự chữ viết hoa (A - Z), kết
		 * thúc bằng một số (0 - 9). (Sử dụng biểu thức chính quy để ràng buộc định
		 * dạng)
		 */

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao Mot Chuoi Ki Tu: ");
//		String n = scanner.nextLine();
//		String a[] = n.split("");
//		int kt = 0;
//		for (int i = 1; i < a.length - 1; i++) {
//			if (a[i].equals(" ")) {
//				kt++;
//				break;
//			}
//		}
//
//		if (a.length <= 20 && a[0].matches("[A-Z]") && a[a.length - 1].matches("[0-9]") && kt == 0) {
//			System.out.println("Hop le");
//		} else {
//			System.out.println("khong hợp le");
//		}

		// ma tran

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao so hang cua ma tran: ");
//		int m = scanner.nextInt();
//		System.out.print("Moi Ban Nhap Vao so cot cua ma tran: ");
//		int n = scanner.nextInt();
//		int a[][] = new int[m][n];// so ptu la m*n  == mảng 1 chiều có m*n ptu
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print("a[" + i + "][" + j + "] = ");
//				a[i][j] = scanner.nextInt();
//			}
//		}
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}

		// nhap vao so ptu cua mang tu ban phim, sau do nhap lan luot cac ptu cua mang
		// săp xep mảng tăng dần.

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao so : ");
//		int n = scanner.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");// a[3] = ....
//			a[i] = scanner.nextInt();
//		}
//		// in ra mảng
//		System.out.println("Mảng trc khi sap xep la:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "  ");
//		}
//
//		// sap xep
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					int tg = a[i];
//					a[i] = a[j];
//					a[j] = tg;
//				}
//			}
//		}
//
//		// in ra
//		System.out.println();
//		System.out.println("Mảng sau khi sap xep la:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "  ");
//		}

		// Nhap vao 1 so tinh giai thua cua so do

//		int tich = 1;
//		for (int i = 1; i <= n; i++) {
//			tich = tich * i;
//
//		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao so : ");
//		int n = scanner.nextInt();
//		
//		System.out.println("Ket Qua Phep Nhan La:" + giaiThua(n));// tham so truyen vao có datatype la int

		// System.out.println("2^3 = " + Math.sqrt(4));

		// truyen vao 2 so x và n. tinh bài 2

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Moi Ban Nhap Vao so n= : ");
//		int n = scanner.nextInt();
//		System.out.print("Moi Ban Nhap Vao so x= : ");
//		int x = scanner.nextInt();
//		// tinh kết qua o cho nay
////		float tong = 0;
////		for (int i = 0; i < n; i++) {
////			tong = (float) (tong + (Math.pow(x, i)) / giaiThua(i));
////
////		}
//		float tong = tinhEMuX(n, x);
//		System.out.println("ket qua " + tong);

		Account account1 = new Account("acc1", 14);
		Account account2 = new Account("acc2", 15);
		Account account3 = new Account("acc3", 18);
		Account account4 = new Account("acc4", 17);
		Account account5 = new Account("acc5", 13);
		account5.setName("acc5s");
		account5.setAge(20);
		System.out.println(account5);
		System.out.println(account5.getAge());
		System.out.println(account5.getName());
		System.out.println(account5.toString());

		Account accounts[] = { account1, account2, account3, account4, account5 };
		System.out.println("tuoi củ acc là: " + account1.getAge());

		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = i + 1; j < accounts.length; j++) {
				if (accounts[i].getAge() > accounts[j].getAge()) {
					Account tg = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = tg;
				}
			}
		}

		System.out.println("Mang Sau Khi Sap Xep La:");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);

		}

//		System.out.println();
//		System.out.println("Mảng sau khi sap xep la:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "  ");
//		}
	}

	public static float tinhEMuX(int n, int x) {

		float tong = 0;
		for (int i = 0; i < n; i++) {
			tong = (float) (tong + (Math.pow(x, i)) / giaiThua(i));

		}

		return tong;
	}

	public static int giaiThua(int x) {// x tham so dau vao

		int tich = 1;
		for (int i = 1; i <= x; i++) {
			tich = tich * i;
		}
		// ket quả tra ve
		return tich;
	}

	public int giaiThua1(int x) {// x tham so dau vao

		int tich = 1;
		for (int i = 1; i <= x; i++) {
			tich = tich * i;

		}
		// ket quả tra ve
		return tich;
	}

}
