package Exercise_2_package.question_1.com.vti.entity;

import java.security.Timestamp;

public class GroupAccount {

	private Group group;
	private Account account;
	private Timestamp createDate;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "GroupAccount [group=" + group + ", account=" + account + ", createDate=" + createDate + "]";
	}
}
