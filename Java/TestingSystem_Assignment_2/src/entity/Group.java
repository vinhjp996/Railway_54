package entity;

import java.util.Date;

public class Group {

	public int id;
	public String name;
	public Account creator;// nguoi tao group
	public Date createDate;
	public Account[] accounts;// danh sách acc trong group

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate + "]";
	}

}
