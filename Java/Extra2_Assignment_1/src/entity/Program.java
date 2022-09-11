package entity;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		He he1 = new He();
		he1.bacHoc = "Dai Hoc";
		he1.id = 1;
		he1.soTinhChi = 210;
		he1.thoiGianHoc = 4;

		He he2 = new He();
		he2.bacHoc = "Cao Dang";
		he2.id = 2;
		he2.soTinhChi = 150;
		he2.thoiGianHoc = 3;

		SinhVien sinhVien1 = new SinhVien();
		sinhVien1.id = 1;
		sinhVien1.maSV = "SV1";
		sinhVien1.name = "Nguyen Van Anh";
		sinhVien1.queQuan = "Ha Noi";
		sinhVien1.tuoi = 20;
		sinhVien1.he = he1;

		SinhVien sinhVien2 = new SinhVien();
		sinhVien2.id = 2;
		sinhVien2.maSV = "SV2";
		sinhVien2.name = "Nguyen Van Em";
		sinhVien2.queQuan = "Ha Noi";
		sinhVien2.tuoi = 21;
		sinhVien2.he = he2;

		sinhVien2.lamBaiTapVeNha();
		sinhVien2.tuoiCuaSinhVien();// =20
		System.out.println("Tuổi cua sinh vien la:" + sinhVien2.tuoiCuaSinhVien());

		ThayCo thayCo1 = new ThayCo();
		thayCo1.id = 1;
		thayCo1.luong = 10000;
		thayCo1.queQuan = "Ha Noi";
		thayCo1.tuoi = 40;

		ThayCo thayCo2 = new ThayCo();
		thayCo2.id = 2;
		thayCo2.luong = 20000;
		thayCo2.queQuan = "Ha Nam";
		thayCo2.tuoi = 45;

		// tính tổng tiền lương của các thầy cô
//		int a = thayCo1.traVeTienLuong();// int
//		int b = thayCo2.traVeTienLuong();// int
//		int x = a + b;// x là biến
//		System.out.println("Tong Tien Luong Cua Giao Vien La: " + x);
//
//		// in ra lan luot tien luong cua cac thay co
//		System.out.println("tiền lươg cua thay co la:" + thayCo1.traVeTienLuong());
//		thayCo1.inRaTienLuong();
//
//		// in ra he cua sinh vien
//		sinhVien1.heCuaSinhVien();

		for (int i = 0; i < 20; i++) {// vòng lặp theo index
			if (i == 10) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Đây là bài 2");
		// break :thoat khoi vong lap
		// continue: bỏ qua luot lap trung vs dieu kien
		// return: dung luon chuong trinh

//		Integer list[] = { 1, 2, 4, 5, 6 };
//
//		for (Integer i : list) {// foreach vòng lặp theo dối tượng. dùng khi có 1 danh sách chua các đối tuong
//			System.out.println(i);
//		}

//		int i=0;
//		
//		while (i<4) {
//			System.out.println(i);
//			i++;
//		}
//		
//		do {
//			System.out.println(i);
//			i++;
//		} while (i<4);
		Date i = new Date();
		System.out.println("Date  " + i);

	}
}
