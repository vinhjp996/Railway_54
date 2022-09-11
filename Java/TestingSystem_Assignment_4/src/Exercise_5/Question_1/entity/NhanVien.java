package Exercise_5.Question_1.entity;

public class NhanVien extends CanBo {

	// task: nhiệm vụ
	private String task;

	public NhanVien(String name, int age, String address, String task) {
		super(name, age, address);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return super.toString() + " NhanVien [task=" + task + "]";
	}

}
