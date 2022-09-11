package Exercise_2_package.question_1.com.vti.entity;

public class TypeQuestion {

	private int id;
	private TypeName typeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", typeName=" + typeName + "]";
	}

}
