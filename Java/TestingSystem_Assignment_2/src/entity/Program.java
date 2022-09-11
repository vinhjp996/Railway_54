package entity;

import java.util.Date;

import Function.Exercise_1;

public class Program {

	public static void main(String[] args) {

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "bao ve";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "ban hang";

		Department departments[] = { department1, department2, department3 };

		Position position1 = new Position();
		position1.id = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.positionName = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 4;
		position4.positionName = PositionName.TEST;

		Account account11 = new Account();
//		account1.email = new String("account1@gmail.com");
		account11.department = department1;
		account11.position = position1;
		account11.id = 1;
		account11.email = "account1@gmail.com";
		account11.fullName = "account1";
		account11.username = "account1";
		account11.createDate = new Date();

		Account account12 = new Account();
		account12.department = department2;
		account12.position = position2;
		account12.id = 2;
		account12.email = "account2@gmail.com";
		account12.fullName = "account2";
		account12.username = "account2";
		account12.createDate = new Date();

		Account account13 = new Account();
		// account3.department = department3;
		account13.position = position3;
		account13.department = department1;
		account13.id = 3;
		account13.email = "account3@gmail.com";
		account13.fullName = "account3";
		account13.username = "account3";
		account13.createDate = new Date();

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "group1";
		group1.createDate = new Date();
		Account[] accounts = {};
		group1.accounts = accounts;

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "group2";
		group2.createDate = new Date();
		Account[] accounts1 = { account11 };
		group2.accounts = accounts1;

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "group3";
		group3.createDate = new Date();
		Account[] accounts2 = { account11, account12, account13, account11 };
		group3.accounts = accounts2;

		Group group4 = new Group();
		group4.id = 3;
		group4.name = "group3";
		group4.createDate = new Date();
		Account[] accounts3 = { account11, account12, account13, account11 };
		group4.accounts = accounts3;

		Account account1 = new Account();
//		account1.email = new String("account1@gmail.com");
		account1.department = department1;
		account1.position = position1;
		account1.id = 1;
		account1.email = "account1@gmail.com";
		account1.fullName = "account1";
		account1.username = "account1";
		account1.createDate = new Date();
		Group[] groups0 = {};
		account1.groups = groups0;

		Account account2 = new Account();
		account2.department = department2;
		account2.position = position2;
		account2.id = 2;
		account2.email = "account2@gmail.com";
		account2.fullName = "account2";
		account2.username = "account2";
		account2.createDate = new Date();
		Group[] groups2 = { group1, group2 };
		account2.groups = groups2;

		Account account3 = new Account();
		// account3.department = department3;
		account3.position = position3;
		account3.id = 3;
		account3.email = "account3@gmail.com";
		account3.fullName = "account3";
		account3.username = "account3";
		account3.createDate = new Date();
		Group[] groups3 = { group1, group2, group4 };// datatype củ mảg đang là Group[]
		account3.groups = groups3;

//		GroupAccount groupAccount1 = new GroupAccount();
//		groupAccount1.account = account1;
//		groupAccount1.group = group1;
//
//		GroupAccount groupAccount2 = new GroupAccount();
//		groupAccount2.account = account2;
//		groupAccount2.group = group2;
//
//		GroupAccount groupAccount3 = new GroupAccount();
//		groupAccount3.account = account3;
//		groupAccount3.group = group3;

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.typeName = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 1;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.categoryQuestionName = "java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.categoryQuestionName = "sql";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.categoryQuestionName = "net";

		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Cau Hoi 1";
		question1.categoryQuestion = categoryQuestion1;
		question1.typeQuestion = typeQuestion1;
		question1.account = account1;
		question1.createDate = new Date();

		Question question2 = new Question();
		question2.id = 1;
		question2.content = "Cau Hoi 1";
		question2.categoryQuestion = categoryQuestion1;
		question2.typeQuestion = typeQuestion1;
		question2.account = account1;
		question2.createDate = new Date();

		Question question3 = new Question();
		question3.id = 1;
		question3.content = "Cau Hoi 1";
		question3.categoryQuestion = categoryQuestion1;
		question3.typeQuestion = typeQuestion1;
		question3.account = account1;
		question3.createDate = new Date();

		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Tra loi 1";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Tra loi 2";
		answer2.question = question1;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Tra loi 3";
		answer3.question = question1;
		answer3.isCorrect = true;

		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "De 001";
		exam1.title = " De Java";
		exam1.categoryQuestion = categoryQuestion1;
		exam1.account = account1;
		exam1.duration = 60;
		exam1.createDate = new Date();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "De 002";
		exam2.title = " De SQL";
		exam2.categoryQuestion = categoryQuestion2;
		exam2.account = account2;
		exam2.duration = 60;
		exam2.createDate = new Date();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "De 003";
		exam3.title = " De .NET";
		exam3.categoryQuestion = categoryQuestion3;
		exam3.account = account3;
		exam3.duration = 90;
		exam3.createDate = new Date();

		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;

		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;

		Exercise_1 exercise_1 = new Exercise_1();
//		System.out.println("question1");
//		exercise_1.question_1(account1);
//
//		System.out.println("question2");
//		exercise_1.question_2(account1);
//		System.out.println("===");
//		exercise_1.question_2(account2);
//		System.out.println("===");
//		exercise_1.question_2(account3);

//		exercise_1.question_3(account3);

//		exercise_1.question_4(account2);

//		exercise_1.question_5(group4);

//		exercise_1.question_6(account3);
//		exercise_1.question_8(accounts2);
//		exercise_1.question12(departments);
		exercise_1.question_13(accounts2);
	}

}