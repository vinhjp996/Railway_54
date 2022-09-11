import java.util.Date;

public class Account {

	public int id;
	public String email;
	public String username;
	public String fullName;
	public Department department;
	public Position position;
	public Date createDate;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullName=" + fullName
				+ ", department=" + department.name + ", position=" + position.positionName + ", createDate="
				+ createDate + "]";
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
