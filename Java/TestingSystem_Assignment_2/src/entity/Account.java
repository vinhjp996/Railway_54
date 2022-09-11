package entity;

import java.util.Date;

public class Account {

	public int id;
	public String email;
	public String username;
	public String fullName;
	public Department department;// chri là 1 đối tuong
	public Position position;
	public Date createDate;
	public Group[] groups;// danh sach cac group dang tham gia(nhieu doi tuong)

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullName=" + fullName
				+ ", department=" + department.name + ", position=" + position.positionName + ", createDate="
				+ createDate + "]";

	}

	public void inRaThongTin(Account account) {
		System.out.println(account.email);
		System.out.println(account.fullName);
		System.out.println(account.department.name);

	}

//	In ra ten phong ban cua account

	public void inRaTenPhongBan() {
		System.out.println("Ten Phong Ban La: " + this.traVeTenPhongBan());
	}

//	Tra ve ten phong ban cua account

	public String traVeTenPhongBan() {
		return this.department.name;
	}

}
