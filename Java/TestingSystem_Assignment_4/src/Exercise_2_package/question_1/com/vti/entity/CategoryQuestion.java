package Exercise_2_package.question_1.com.vti.entity;

public class CategoryQuestion {

	private int id;
	private String categoryQuestionName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryQuestionName() {
		return categoryQuestionName;
	}

	public void setCategoryQuestionName(String categoryQuestionName) {
		this.categoryQuestionName = categoryQuestionName;
	}

	@Override
	public String toString() {
		return "CategoryQuestion [id=" + id + ", categoryQuestionName=" + categoryQuestionName + "]";
	}

}
