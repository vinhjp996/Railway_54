package Exercise_5.Question_3;

public abstract class Student extends Person {

	private int id;
	private String name;

	public Student(int id, String name) {
		super(name);
		this.id = id;
	}

}
