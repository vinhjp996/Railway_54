package Exercise_5.Question_1.backend;

import java.util.ArrayList;
import java.util.Scanner;

import Exercise_5.Question_1.entity.CanBo;
import Exercise_5.Question_1.entity.CongNhan;
import Exercise_5.Question_1.entity.Gender;
import Exercise_5.Question_1.entity.KySu;
import Exercise_5.Question_1.entity.NhanVien;

public class QLCB {
	Scanner scanner = new Scanner(System.in);
	ArrayList<CanBo> canBos = new ArrayList<>();

	public void menu() {
		boolean checkContinue = true;
		while (checkContinue) {
			System.out.println("1-Them Moi");
			System.out.println("2-Tim Kiem");
			System.out.println("3-Hien Thi Thong Tin");
			System.out.println("4-Nhap Ten Can Bo Va Xoa Can Bo ");
			System.out.println("5-Thoat Chuong Trinh");

			System.out.println("Moi Ban Chon.");
			int choose = scanner.nextInt();
			scanner.nextLine();
			switch (choose) {
			case 1:
				themMoi();
				break;
			case 2:
				System.out.println("Nhap Ten Ban Can Tim:");
				String name = scanner.nextLine();
				timKiem(name);

				break;
			case 3:
				hienThiThongTin();
				break;
			case 4:
				System.out.println("Nhap Ten Ban Can Tim:");
				String nameDelete = scanner.nextLine();
				nhapVaXoaCanBo(nameDelete);
				break;
			case 5:
				System.out.println("Thoat Chuong Trinh");
				return;

			default:
				System.out.println("Ban Da Nhap Sai, Moi Ban Nhap Lai");
				break;
			}
			System.out.println("Ban Co Muon Tiep Tuc Chuong Trinh Khong( Y_Yes, N_NO) ? ");
			String continuee = scanner.nextLine();
			if (continuee.equalsIgnoreCase("Y")) {
				checkContinue = true;

			} else if (continuee.equalsIgnoreCase("N")) {
				checkContinue = false;
				System.out.println("Chuong Trinh Da Ket Thuc");
			} else {
				System.out.println("Ban Da Nhap Sai Gia Tri, Chuong Trinh Tu Dong Ket Thuc");
				return;
			}

		}

	}

	public void themMoi() {
		System.out.println("1-Cong Nhan");
		System.out.println("2-Ky Su");
		System.out.println("3-Nhan Vien");
		System.out.println("Moi Ban Chon.");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			System.out.println("Nhap Vao Ten Cong Nhan");
			String tenCongNhan = scanner.nextLine();

			System.out.println("Nhap Vao Tuoi Cong Nhan");
			int tuoiCongNhan = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Dia Chi Cong Nhan");
			String diaChiCongNhan = scanner.nextLine();

			System.out.println("Nhap Vao Cap Bac Cong Nhan");
			int levelCongNhan = scanner.nextInt();
			scanner.nextLine();

			CanBo congnhan = new CongNhan(tenCongNhan, tuoiCongNhan, diaChiCongNhan, levelCongNhan);

			System.out.println("Nhap Vao Gioi Tinh Cong Nhan");
			String genderCongNhan = scanner.nextLine();
			if (genderCongNhan.equalsIgnoreCase(Gender.MALE.toString())) {

				congnhan.setGender(Gender.MALE);

			} else if (genderCongNhan.equalsIgnoreCase(Gender.FEMALE.toString())) {

				congnhan.setGender(Gender.FEMALE);

			} else {
				congnhan.setGender(Gender.OTHER);
			}

			canBos.add(congnhan);

			break;
		case 2:

			System.out.println("Nhap Vao Ten Ky Su");
			String tenKySu = scanner.nextLine();

			System.out.println("Nhap Vao Tuoi Ky Su");
			int tuoiKySu = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Dia Chi Ky Su");
			String diaChiKySu = scanner.nextLine();

			System.out.println("Nhap Vao Nghanh Dao Tao");
			String trainingIndustry = scanner.nextLine();

			CanBo kySu = new KySu(tenKySu, tuoiKySu, diaChiKySu, trainingIndustry);

			System.out.println("Nhap Vao Gioi Tinh Ky Su");
			String genderKySu = scanner.nextLine();
			if (genderKySu.equalsIgnoreCase(Gender.MALE.toString())) {

				kySu.setGender(Gender.MALE);

			} else if (genderKySu.equalsIgnoreCase(Gender.FEMALE.toString())) {

				kySu.setGender(Gender.FEMALE);

			} else {
				kySu.setGender(Gender.OTHER);
			}

			canBos.add(kySu);

			break;
		case 3:
			System.out.println("Nhap Vao Ten Nhan Vien");
			String tenNhanVien = scanner.nextLine();

			System.out.println("Nhap Vao Tuoi Nhan Vien");
			int tuoiNhanVien = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Dia Chi Nhan Vien");
			String diaChiNhanVien = scanner.nextLine();

			System.out.println("Nhap Vao Nhiem Vu");
			String task = scanner.nextLine();

			CanBo nhanVien = new NhanVien(tenNhanVien, tuoiNhanVien, diaChiNhanVien, task);

			System.out.println("Nhap Vao Gioi Tinh Ky Su");
			String genderNhanVien = scanner.nextLine();
			if (genderNhanVien.equalsIgnoreCase(Gender.MALE.toString())) {

				nhanVien.setGender(Gender.MALE);

			} else if (genderNhanVien.equalsIgnoreCase(Gender.FEMALE.toString())) {

				nhanVien.setGender(Gender.FEMALE);

			} else {
				nhanVien.setGender(Gender.OTHER);
			}

			canBos.add(nhanVien);
			break;

		default:
			break;
		}

	}

	public void timKiem(String hoTen) {
		boolean checkName = false;
		for (CanBo canBo : canBos) {
			if (canBo.getName().equalsIgnoreCase(hoTen)) {
				System.out.println(canBo.toString());
				checkName = true;

			}

		}
		if (checkName == false) {
			System.out.println("Khong Co Ten Trong Danh Sach");

		}

	}

	public void hienThiThongTin() {

		for (CanBo canBo : canBos) {
			System.out.println(canBo.toString());

		}
	}

	public void nhapVaXoaCanBo(String hoTen) {
		// lấy độ dài của list trước khi xóa
		int lengthBefore = canBos.size();

		ArrayList<CanBo> canBosdeletes = new ArrayList<CanBo>();
		for (CanBo canBo : canBos) {
			if (canBo.getName().equalsIgnoreCase(hoTen)) {
				canBosdeletes.add(canBo);

			}

		}
//		System.out.println("Lisst moiws");
//		System.out.println(canBosdeletes);
//
//		System.out.println("List cu");
//		System.out.println(canBos);
		canBos.removeAll(canBosdeletes);

		// lấy độ dài của list sau khi xóa
		int lengthAfter = canBos.size();

		if (lengthAfter != lengthBefore) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Ten Nguoi Dung Khong Co Ten Trong Sanh Sach");
		}

	}

}
