package Exercise_5.Question_1.entity;

public class CongNhan extends CanBo {

	private int level;

	public CongNhan(String name, int age, String address, int level) {
		super(name, age, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level < 1 && level > 10) {
			System.out.println("Level Must From 1 to 10 ");
		} else {
			this.level = level;
		}

	}

	@Override
	public String toString() {
		return super.toString() + " CongNhan [level=" + level + "]";
	}

}
