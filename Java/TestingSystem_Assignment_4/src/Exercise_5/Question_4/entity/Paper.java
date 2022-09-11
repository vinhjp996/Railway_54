package Exercise_5.Question_4.entity;

public class Paper extends Document {
	private int ngayPhatHanh;

	public Paper(int maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + " Paper [ngayPhatHanh=" + ngayPhatHanh + "]";
	}

}
