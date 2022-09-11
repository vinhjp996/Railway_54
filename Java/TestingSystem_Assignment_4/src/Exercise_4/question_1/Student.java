package Exercise_4.question_1;

public class Student {

	private int id;
	private String name;
	private String hometown;
	private float mark;

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.mark = 0;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public void congDiem(float diemCong) {
		this.mark = this.mark + diemCong;
	}

	public void inRaThongTinSinhVien() {
		String xeploai = null;
		if (this.mark < 4) {
			xeploai = "Yeu";
		} else if (this.mark >= 4 && this.mark < 6) {
			xeploai = "Trung Binh";

		} else if (this.mark >= 6 && this.mark < 8) {
			xeploai = "Kha";

		} else {
			xeploai = "Gioi";

		}

		System.out.println("Ten: " + this.name + ", " + "Hoc Luc: " + xeploai);

	}

}
