package Exercise_2_package.question_1.com.vti.entity;

import java.util.Date;

public class Question {

	private int id;
	private String content;
	private CategoryQuestion categoryQuestion;
	private TypeQuestion typeQuestion;
	private Account account;
	private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", categoryQuestion="
				+ categoryQuestion.getCategoryQuestionName() + ", typeQuestion=" + typeQuestion.getTypeName()
				+ ", account=" + account.getFullName() + ", createDate=" + createDate + "]";
	}

}
