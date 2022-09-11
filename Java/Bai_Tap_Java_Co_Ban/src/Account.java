
public class Account {

	/*
	 * tạo 1 đối tương acc có name và age. tạo 1 mảng có chưa 5 acc. sắp xếp các acc
	 * theo tuổi giảm dần
	 */

	private String name;
	private int age;

	public Account(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", age=" + age + "]";
	}

}
