import java.util.Date;

public class Program {

	public static void main(String[] args) {
// Cau 2:

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "bao ve";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "ban hang";

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

		Account account1 = new Account();
//		account1.email = new String("account1@gmail.com");
		account1.department = department1;
		account1.position = position1;
		account1.id = 1;
		account1.email = "account1@gmail.com";
		account1.fullName = "account1";
		account1.username = "account1";
		account1.createDate = new Date();

		Account account2 = new Account();
		account2.department = department2;
		account2.position = position2;
		account2.id = 2;
		account2.email = "account2@gmail.com";
		account2.fullName = "account2";
		account2.username = "account2";
		account2.createDate = new Date();

		Account account3 = new Account();
		account3.department = department3;
		account3.position = position3;
		account3.id = 3;
		account3.email = "account3@gmail.com";
		account3.fullName = "account3";
		account3.username = "account3";
		account3.createDate = new Date();

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "group1";
		group1.creator = account1;
		group1.createDate = new Date();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "group2";
		group2.creator = account2;
		group2.createDate = new Date();

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "group3";
		group3.creator = account3;
		group3.createDate = new Date();

		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.account = account1;
		groupAccount1.group = group1;

		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.account = account2;
		groupAccount2.group = group2;

		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.account = account3;
		groupAccount3.group = group3;

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

// Cau 3:

//		System.out.println("Cau 3: In ra gia tri cac doi tuong:");
//		System.out.println("deparment1: " + department1);
//		System.out.println("position1: " + position1);
//		System.out.println("account1: " + account1);
//		System.out.println("group1: " + group1);
//		System.out.println("groupAccount1: " + groupAccount1);
//		System.out.println("typeQuestion1: " + typeQuestion1);
//		System.out.println("categoryQuestion1: " + categoryQuestion1);
//		System.out.println("question1: " + question1);
//		System.out.println("answer1: " + answer1);
//		System.out.println("exam1: " + exam1);
//		System.out.println("examQuestion1: " + examQuestion1);

		account1.inRaTenPhongBan();
		account1.traVeTenPhongBan();
		System.out.println("Tra Ve Ten Phong Ban: " + account1.traVeTenPhongBan());

	}

}
/*
 * Table 1:Department ??? DepartmentID: ?????nh danh c???a ph??ng ban (auto increment) ???
 * DepartmentName: t??n ?????y ????? c???a ph??ng ban (VD: sale, marketing, ...)
 * 
 * Table 2: Position ??? PositionID: ?????nh danh c???a ch???c v??? (auto increment) ???
 * PositionName: t??n ch???c v??? (Dev, Test, Scrum Master, PM)
 * 
 * Table 3: Account ??? AccountID: ?????nh danh c???a User (auto increment) ??? Email: ???
 * Username: ??? FullName: ??? DepartmentID: ph??ng ban c???a user trong h??? th???ng ???
 * PositionID: ch???c v??? c???a User ??? CreateDate: ng??y t???o t??i kho???n
 * 
 * Table 4: Group ??? GroupID: ?????nh danh c???a nh??m (auto increment) ??? GroupName:
 * t??n nh??m ??? CreatorID: id c???a ng?????i t???o group ??? CreateDate: ng??y t???o group
 * 
 * Table 5: GroupAccount ??? GroupID: ?????nh danh c???a nh??m ??? AccountID: ?????nh danh
 * c???a User ??? JoinDate: Ng??y user tham gia v??o nh??m
 * 
 * Table 6: TypeQuestion ??? TypeID: ?????nh danh c???a lo???i c??u h???i (auto increment) ???
 * TypeName: t??n c???a lo???i c??u h???i (Essay, Multiple-Choice)
 * 
 * 2
 * 
 * Table 7: CategoryQuestion ??? CategoryID: ?????nh danh c???a ch??? ????? c??u h???i (auto
 * increment) ??? CategoryName: t??n c???a ch??? ????? c??u h???i (Java, .NET, SQL, Postman,
 * Ruby, ...)
 * 
 * Table 8: Question ??? QuestionID: ?????nh danh c???a c??u h???i (auto increment) ???
 * Content: n???i dung c???a c??u h???i ??? CategoryID: ?????nh danh c???a ch??? ????? c??u h???i ???
 * TypeID: ?????nh danh c???a lo???i c??u h???i ??? CreatorID: id c???a ng?????i t???o c??u h???i ???
 * CreateDate: ng??y t???o c??u h???i
 * 
 * Table 9: Answer ??? AnswerID: ?????nh danh c???a c??u tr??? l???i (auto increment) ???
 * Content: n???i dung c???a c??u tr??? l???i ??? QuestionID: ?????nh danh c???a c??u h???i ???
 * isCorrect: c??u tr??? l???i n??y ????ng hay sai
 * 
 * Table 10: Exam ??? ExamID: ?????nh danh c???a ????? thi (auto increment) ??? Code: m?? ?????
 * thi ??? Title: ti??u ????? c???a ????? thi ??? CategoryID: ?????nh danh c???a ch??? ????? thi ???
 * Duration: th???i gian thi ??? CreatorID: id c???a ng?????i t???o ????? thi ??? CreateDate:
 * ng??y t???o ????? thi
 * 
 * Table 11: ExamQuestion ??? ExamID: ?????nh danh c???a ????? thi ??? QuestionID: ?????nh danh
 * c???a c??u h???i
 */