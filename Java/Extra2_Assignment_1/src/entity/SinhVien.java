package entity;

public class SinhVien {

	int id;
	int tuoi;
	String name;
	String queQuan;
	String maSV;
	He he;

	public void lamBaiTapVeNha() {
		System.out.println("Sinh Vien Dang Lam Bai Tap Ve Nha.");
	}

	public int tuoiCuaSinhVien() {
		return this.tuoi;
	}

	// in ra hệ của sinh viên
	public void heCuaSinhVien() {
		System.out.println("He Cua Sinh Vien La: " + this.he);

	}

}
