package Exercise_2_package.question_1.com.vti.backend;

import Exercise_2_package.question_1.com.vti.entity.Account;

public class Excercise2 {

	int id = 1;
	String email = "nguyenvana@gmail.com";
	String username = "nguyenvana";
	String firstName = "nguyen";
	String lastName = "a";

// Cau a	
	Account account = new Account();
//	Cau b
	Account account2 = new Account(id, email, username, firstName, lastName);

}
