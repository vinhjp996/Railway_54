package Function;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.PositionName;

public class Exercise_1 {

	/*
	 * Question 1: Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
	 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
	 * in ra text "Phòng ban của nhân viên này là ..."
	 */

	public void question_1(Account account1) {
		System.out.println("=== Question 1 ===");
		if (account1.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else
			System.out.println("Phòng ban cua nhân viên này là:" + account1.department.name);
	}

	/*
	 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
	 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
	 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
	 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
	 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
	 * người hóng chuyện, tham gia tất cả các group"
	 */

	public void question_2(Account account1) {

		System.out.println("=== Question 2 ===");
		if (account1.groups.length == 0) {
			System.out.println("Nhan vien chua có group.");
		} else if (account1.groups.length == 1 || account1.groups.length == 2) {
			System.out.println("Group cua nhân viên này là Java Fresher, C# Fresher");
		} else if (account1.groups.length == 3) {
			System.out.println("Nhân viên này là nguoi quan trong, tham gia nhieu group");
		} else if (account1.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

	}

	/*
	 * Question 3: Sử dụng toán tử ternary để làm Question 1
	 */

	public void question_3(Account account) {
		System.out.println("=== Question 3 ===");
		// phàn 1: điều kiện so sánh ? phần 2: kết quả trả về nếu đúng : phần 3 ket qua
		// neu sai
		System.out.println(account.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban cua nhân viên này là:" + account.department.name);
	}

	/*
	 * Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của
	 * account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không
	 * phải thì in ra text "Người này không phải là Developer"
	 */

	public void question_4(Account account) {
		System.out.println("=== Question 4 ===");
		System.out.println(account.position.positionName.equals(PositionName.DEV) ? "Đây là Developer"
				: "Người này không phải là Developer");

	}

	/*
	 * SWITCH CASE Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra
	 * theo format sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
	 * Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng
	 * account = 3 thì in ra "Nhóm có ba thành viên" Còn lại in ra
	 * "Nhóm có nhiều thành viên"
	 */

	public void question_5(Group group) {
		System.out.println("=== Question 5 ===");
		switch (group.accounts.length) {
		case 0:
			System.out.println("Nhóm khong có thành viên");
			break;
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhieu thành viên");
			break;

		}

	}

	/*
	 * Question 6: Sử dụng switch case để làm lại Question 2
	 */

	public void question_6(Account account1) {
		System.out.println("=== Question 6 ===");
		switch (account1.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;

		}

	}

	/*
	 * FOREACH Question 8: In ra thông tin các account bao gồm: Email, FullName và
	 * tên phòng ban của họ.
	 */

	public void question_8(Account[] accounts) {
		System.out.println("=== Question 8 ===");

		for (int i = 0; i < accounts.length; i++) {
			accounts[i].inRaThongTin(accounts[i]);

		}

		// System.out.println(accounts[1]);

//		for (Account account : accounts) {
//			System.out.println(account.email);
//			System.out.println(account.fullName);
//			System.out.println(account.department.name);
//		}

//		int a = 0;
//		while (a < accounts.length) {
//			System.out.println(accounts[a]);
//			a++;
//		}

//		int b = 0;
//		do {
//			System.out.println(accounts[b]);
//			b++;
//		} while (b < accounts.length);
//
	}

	/*
	 * Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như
	 * Question 10
	 */
	public void question12(Department[] departments) {

		for (int i = 0; i < 2; i++) {
			System.out.println(departments[i]);
		}

	}

	/*
	 * Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
	 */
	public void question_13(Account[] accounts) {

		for (int i = 0; i < accounts.length; i++) {
			if (i == 1) {
				continue;
			} else
				System.out.println(accounts[i]);

		}

	}

}
