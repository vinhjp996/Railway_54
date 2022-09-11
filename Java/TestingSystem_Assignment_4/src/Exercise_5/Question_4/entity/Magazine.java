package Exercise_5.Question_4.entity;

public class Magazine extends Document {
	private int soPhatHanh;
	private int thangPhatHanh;

	public Magazine(int maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return super.toString() + " Magazine [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
	}

}
