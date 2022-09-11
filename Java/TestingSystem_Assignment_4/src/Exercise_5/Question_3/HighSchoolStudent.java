package Exercise_5.Question_3;



public class HighSchoolStudent extends Student {

	private int id;
	private String name;
	private String clazz;
	private String desiredUniversity;
	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
		super(id, name);
		this.id = id;
		this.name = name;
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	
	

}
