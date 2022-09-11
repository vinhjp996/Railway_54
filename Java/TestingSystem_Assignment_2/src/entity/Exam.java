package entity;
import java.util.Date;

public class Exam {

	public int id;
	public String code;
	public String title;
	public CategoryQuestion categoryQuestion;
	public int duration;
	public Account account;
	public Date createDate;

	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", categoryQuestion=" + categoryQuestion
				+ ", duration=" + duration + ", account=" + account + ", createDate=" + createDate + "]";
	}

}
