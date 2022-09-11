package Exercise_5.Question_4.entity;

public class Document {
	private int maTaiLieu;
	private String tenNhaSanXuat;
	private int soBanPhatHanh;

	public Document(int maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaSanXuat = tenNhaSanXuat;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaSanXuat() {
		return tenNhaSanXuat;
	}

	public void setTenNhaSanXuat(String tenNhaSanXuat) {
		this.tenNhaSanXuat = tenNhaSanXuat;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	@Override
	public String toString() {
		return "Document [maTaiLieu=" + maTaiLieu + ", tenNhaSanXuat=" + tenNhaSanXuat + ", soBanPhatHanh="
				+ soBanPhatHanh + "]";
	}

}
