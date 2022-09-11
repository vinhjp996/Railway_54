package entity;

public class LopTinChi {

	int id;
	String tenLopHoc;
	String monHoc;
	int thoiGianHoc;
	int soLuongSinhVien;
	ThayCo thayCo;

	// in ra ten thay co

	public void tenThayCo() {
		System.out.println("Ten Thay Co La:" + this.thayCo.name);

	}

	// trả về so luong sinh vien

	public int soLuongSinhVien() {
		return this.soLuongSinhVien;

	}

}
