import java.util.Date;

public class Group {

	public int id;
	public String name;
	public Account creator;
	public Date createDate;

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate + "]";
	}

}
