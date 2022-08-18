

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
DROP TRIGGER IF EXISTS Question_1;
DELIMITER $$
CREATE TRIGGER Question_1 
BEFORE	INSERT ON `Group`
FOR EACH ROW
BEGIN
	DECLARE in_Create_Date DATETIME ;
	SET in_Create_Date = date_sub(now(), interval 1 year) ;				-- DATE_SUB( date, INTERVAL value unit )
																		-- 	 date: Ngày mà khoảng thời gian nên được trừ.
																		-- 	 value: Giá trị của khoảng thời gian / ngày mà bạn muốn trừ. Có thể chỉ định giá trị
																		-- 	dương và âm cho tham số này.
																		-- 	 unit: Loại đơn vị của khoảng thời gian như NGÀY, THÁNG, PHÚT, GIỜ, v.v.

    IF (new.Create_Date <= in_Create_Date)
    THEN 
    SIGNAL SQLSTATE '11314' 
    SET MESSAGE_TEXT = ' Khong Duoc Nhap Thoi Gian TRuoc 1 Nam Truoc ';
    END IF;
    
END $$
DELIMITER ;

INSERT INTO 	`Group` 	( Group_Name,		 		Creator_ID, 		Create_Date)
VALUES 						('Group2',					5,					'2018-03-05');

SELECT date_sub(now(), interval 10 day );


-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
			-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user".ALTER


DROP TRIGGER IF EXISTS Question_2;
DELIMITER $$
CREATE TRIGGER Question_2
BEFORE	INSERT ON `Account`
FOR EACH ROW
BEGIN
	DECLARE in_Department_ID TINYINT UNSIGNED ;
	SELECT Department_ID INTO in_Department_ID
    FROM Department
    WHERE Department_Name = 'sale';
    IF (new.Department_ID = in_Department_ID)
    THEN 
    SIGNAL SQLSTATE '11314' 
    SET MESSAGE_TEXT = ' phong ba sale da du nguoi ';
    END IF;
    
END $$
DELIMITER ;

INSERT INTO 	`Account`	(Email, 					 	Use_Name, 			Full_Name, 					Department_ID, 		Position_ID,	Create_Date		)
VALUES 						('NguyenVinh1@gmail.com',		'NguyenVinh1',		'Nguyen Truong Vinh1', 		'2' , 				'1',			'2020-03-05'	);











/*Question 1: 
Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
trước 1 năm trước.
Question 2: 
Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user".ALTER
Question 3: 
Cấu hình 1 group có nhiều nhất là 5 user
Question 4: 
Cấu hình 1 bài thi có nhiều nhất là 10 Question
Question 5: 
Tạo trigger không cho phép người dùng xóa tài khoản có email là
admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó
Question 6: 
Không sử dụng cấu hình default cho field DepartmentID của table
Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
Question 7: 
Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.
Question 8: 
Viết trigger sửa lại dữ liệu cho đúng:
Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
Question 9: 
Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
Question 10: 
Viết trigger chỉ cho phép người dùng chỉ được update, delete các
question khi question đó chưa nằm trong exam nào
Question 12: 
Lấy ra thông tin exam trong đó:
Duration <= 30 thì sẽ đổi thành giá trị "Short time"
30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
Duration > 60 thì sẽ đổi thành giá trị "Long time"
Question 13: 
Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
là the_number_user_amount và mang giá trị được quy định như sau: 2
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
Question 14: 
Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
không có user thì sẽ thay đổi giá trị 0 thành "Không có User"*/














