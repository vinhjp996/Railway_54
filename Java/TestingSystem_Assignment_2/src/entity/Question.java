package entity;
import java.util.Date;

public class Question {

	public int id;
	public String content;
	public CategoryQuestion categoryQuestion;
	public TypeQuestion typeQuestion;
	public Account account;
	public Date createDate;

	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", categoryQuestion="
				+ categoryQuestion.categoryQuestionName + ", typeQuestion=" + typeQuestion.typeName + ", account="
				+ account.fullName + ", createDate=" + createDate + "]";
	}

}
