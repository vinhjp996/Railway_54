package Exercise_5.Question_4.backend;

import java.util.ArrayList;
import java.util.Scanner;

import Exercise_5.Question_4.entity.Book;
import Exercise_5.Question_4.entity.Document;
import Exercise_5.Question_4.entity.Magazine;
import Exercise_5.Question_4.entity.Paper;

public class QLTL {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Document> documents = new ArrayList<>();

	public void menu() {
		boolean checkContinue = true;
		while (checkContinue) {
			System.out.println("1-Them Moi");
			System.out.println("2-Xoa Tai Lieu Theo Ma");
			System.out.println("3-Hien Thi Thong Tin Tai Lieu");
			System.out.println("4-Tim Kiem Tai Lieu  ");
			System.out.println("5-Thoat Chuong Trinh");

			System.out.println("Moi Ban Chon.");
			int choose = scanner.nextInt();
			scanner.nextLine();
			switch (choose) {
			case 1:
				themMoi();
				break;
			case 2:
				System.out.println("Moi Ban Nhap Vao Ma Tai Lieu: ");
				int maTaiLieu = scanner.nextInt();
				xoaTheoMaTaiLieu(maTaiLieu);
				break;
			case 3:
				hienThiThongTin();
				break;
			case 4:
				timKiem();
				break;
			case 5:
				System.out.println("Thoat Chuong Trinh");
				return;

			default:
				System.out.println("Ban Da Nhap Sai, Moi Ban Nhap Lai");
				break;
			}
//			System.out.println("Ban Co Muon Tiep Tuc Chuong Trinh Khong( Y_Yes, N_NO) ? ");
//			String continuee = scanner.nextLine();
//			if (continuee.equalsIgnoreCase("Y")) {
//				checkContinue = true;
//
//			} else if (continuee.equalsIgnoreCase("N")) {
//				checkContinue = false;
//				System.out.println("Chuong Trinh Da Ket Thuc");
//			} else {
//				System.out.println("Ban Da Nhap Sai Gia Tri, Chuong Trinh Tu Dong Ket Thuc");
//				return;
//			}

		}

	}

	public void themMoi() {
		System.out.println("1-Sach");
		System.out.println("2-Tap Chi");
		System.out.println("3-Bao");
		System.out.println("Moi Ban Chon.");
		int choose = scanner.nextInt();
		scanner.nextLine();
		switch (choose) {
		case 1:
			System.out.println("Nhap Vao Ma Tai Lieu Sach");
			int maTaiLieuSach = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Ten San Xuat Sach");
			String tenSanXuatSach = scanner.nextLine();

			System.out.println("Nhap Vao So Phat Hanh Sach");
			int soBanPhatHanhSach = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Ten Tac Gia");
			String tenTacGia = scanner.nextLine();

			System.out.println("Nhap Vao So So Trang");
			int soTrang = scanner.nextInt();
			scanner.nextLine();

			Document book = new Book(maTaiLieuSach, tenSanXuatSach, soBanPhatHanhSach, tenTacGia, soTrang);

			documents.add(book);

			break;
		case 2:

			System.out.println("Nhap Vao Ma Tai Lieu Tap Chi");
			int maTaiLieuTapChi = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Ten San Xuat Tap Chi");
			String tenSanXuatTapChi = scanner.nextLine();

			System.out.println("Nhap Vao So Phat Hanh Tap Chi");
			int soBanPhatHanhTapChi = scanner.nextInt();

			System.out.println("Nhap Vao So Phat Hanh");
			int soPhatHanhTapChi = scanner.nextInt();

			System.out.println("Nhap Vao So Thang Phat Hanh");
			int thangPhatHanhTapChi = scanner.nextInt();
			scanner.nextLine();

			Document magazine = new Magazine(maTaiLieuTapChi, tenSanXuatTapChi, soBanPhatHanhTapChi, soPhatHanhTapChi,
					thangPhatHanhTapChi);

			documents.add(magazine);
			break;

		case 3:
			System.out.println("Nhap Vao Ma Bao");
			int maTaiLieuBao = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Nhap Vao Ten San Xuat Bao");
			String tenSanXuatBao = scanner.nextLine();

			System.out.println("Nhap Vao So Phat Hanh Bao");
			int soBanPhatHanhBao = scanner.nextInt();

			System.out.println("Nhap Vao So Phat Hanh Bao");
			int ngayPhatHanhBao = scanner.nextInt();
			scanner.nextLine();

			Document paper = new Paper(maTaiLieuBao, tenSanXuatBao, soBanPhatHanhBao, ngayPhatHanhBao);

			documents.add(paper);
			break;

		default:
			break;
		}

	}

	public void hienThiThongTin() {

		for (Document document : documents) {
			System.out.println(document.toString());

		}
	}

	public void timKiem() {
		boolean checkName = false;
		System.out.println("Ban Muon Tim Theo Loai Nao: ");
		System.out.println("1-Book ");
		System.out.println("2-Magazine ");
		System.out.println("3-Paper ");
		int choose = scanner.nextInt();
		scanner.nextLine();

		switch (choose) {
		case 1:
			for (Document document : documents) {

				if (document instanceof Book) {
					System.out.println(document.toString());
				}
			}

			break;
		case 2:
			for (Document document : documents) {

				if (document instanceof Magazine) {
					System.out.println(document.toString());
				}
			}

			break;

		case 3:
			for (Document document : documents) {

				if (document instanceof Paper) {
					System.out.println(document.toString());
				}
			}

			break;

		}

	}

	public void xoaTheoMaTaiLieu(int maTaiLieu) {
		boolean check = false;
		for (Document document : documents) {
			if (document.getMaTaiLieu() == maTaiLieu) {
				if (documents.size() == 1) {
					documents = new ArrayList<>();
					check = true;
				} else {
					documents.remove(document);
					check = true;
				}

			}

		}
		if (check == false) {
			System.out.println("Ma Tai Lieu Ban Can Xoa, Khong Co Trong Danh Sach.");

		} else {
			System.out.println("Xoa Thanh Cong");

		}

	}

}
