package entity;

public class ThayCo {

	int id;
	int tuoi;
	int luong;
	String name;
	String queQuan;

	public int traVeTienLuong() {
		return this.luong;
	}

	public void inRaTienLuong() {
		System.out.println("In Ra Tien Luong: " + this.luong);

	}
}
