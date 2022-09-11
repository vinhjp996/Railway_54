package entity;
import java.security.Timestamp;

public class GroupAccount {

	public Group group;
	public Account account;
	public Timestamp createDate;

	@Override
	public String toString() {
		return "GroupAccount [group=" + group + ", account=" + account + ", createDate=" + createDate + "]";
	}
}
