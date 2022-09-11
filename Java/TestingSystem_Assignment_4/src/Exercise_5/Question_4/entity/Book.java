package Exercise_5.Question_4.entity;

public class Book extends Document {
	private String tenTacGia;
	private int soTrang;

	public Book(int maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return super.toString() + " Book [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + "]";
	}

}
