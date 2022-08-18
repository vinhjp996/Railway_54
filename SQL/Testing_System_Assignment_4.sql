
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ

SELECT a.Full_Name, b.Department_Name 
FROM `account` a 
JOIN department b on a.Department_ID = b.Department_ID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010

SELECT * FROM `account`;

SELECT a.Email,a.Use_Name,a.Full_Name,b.Department_Name,c.Position_Name,a.Create_Date FROM `account` a 
JOIN department b on a.Department_ID = b.Department_ID
JOIN `position` c on a.Position_ID = c.Position_ID
WHERE a.Create_Date > '2010-12-20' ;

-- Question 3: Viết lệnh để lấy ra tất cả các developer

SELECT a.Email,a.Use_Name,a.Full_Name,b.Department_Name,c.Position_Name,a.Create_Date 
FROM `account` a 
JOIN department b on a.Department_ID = b.Department_ID
JOIN `position` c on a.Position_ID = c.Position_ID
WHERE c.Position_Name = 'dev';


-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

SELECT b.Department_ID, b.Department_Name , count(a.Department_ID) as sl
FROM `account` a
JOIN department b on a.Department_ID = b.Department_ID
GROUP BY a.Department_ID
HAVING sl > 3;


-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

SELECT * FROM question;
SELECT * FROM Exam_Question;

SELECT b.Question_ID, a.Content , count(b.Question_ID) as sl
FROM question a
JOIN Exam_Question b ON a.Question_ID = b.Question_ID
GROUP BY b.Question_ID
HAVING sl = (	SELECT count(Question_ID) as sl
				FROM Exam_Question
				GROUP BY Question_ID
				ORDER BY sl DESC LIMIT 1);

-- lay ra so lan duoc su dung cua cau hoi duoc su dung nhieu nhat
SELECT count(Question_ID) as sl
FROM Exam_Question
GROUP BY Question_ID
ORDER BY sl DESC LIMIT 1;


SELECT max(sl)
FROM (	SELECT count(Question_ID) as sl
		FROM Exam_Question
		GROUP BY Question_ID) as a;



-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT * FROM category_question;
SELECT * FROM question;
SELECT  Q.Category_ID, CQ.Category_Name , count(Q.Category_ID) 
FROM question as Q 
JOIN category_question as CQ on Q.Category_ID=CQ.Category_ID
GROUP BY Q.Category_ID;


-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT * FROM question;
SELECT * FROM exam_question;
SELECT q.Question_ID, q.Content,  count(e.Question_ID) 
from question as q 
LEFT JOIN exam_question as e on q.Question_ID= e.Question_ID
GROUP BY e.Question_ID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

SELECT a.Question_ID , a.Content , count(b.Question_ID) as sl
FROM question a
JOIN answer b ON a.Question_ID = b.Question_ID
GROUP BY b.Question_ID
HAVING sl = (	SELECT count(Question_ID) as sl
				FROM answer
				GROUP BY Question_ID
				ORDER BY sl DESC LIMIT 1);

SELECT count(Question_ID) as sl
FROM answer
GROUP BY Question_ID
ORDER BY sl DESC LIMIT 1;


-- Question 9: Thống kê số lượng account trong mỗi group
SELECT * FROM `account`;
SELECT * FROM `group`;
SELECT * FROM group_account;

SELECT a.Group_ID ,a.Group_Name , count(b.Group_ID) 
FROM `group` a 
LEFT JOIN group_account b 
ON a.Group_ID = b.Group_ID
GROUP BY b.Group_ID;


-- Question 10: Tìm chức vụ có ít người nhất
SELECT * FROM Position;

SELECT a.Position_ID , b.Position_Name , count(b.Position_ID) as sl
FROM `account` a
JOIN Position b ON a.Position_ID = b.Position_ID
GROUP BY b.Position_ID
HAVING sl = (	SELECT count(Position_ID) as sl
				FROM `account`
				GROUP BY Position_ID
				ORDER BY sl ASC LIMIT 1);

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM

SELECT * FROM department;

SELECT b.Department_Name,c.Position_Name , count(a.Position_ID) as sl
FROM `account` a 
JOIN department b on a.Department_ID = b.Department_ID
JOIN position c on a.Position_ID = c.Position_ID
GROUP BY  a.Department_ID, a.Position_ID;


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của 
--               question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...

SELECT a.Question_ID, a.Content, d.Type_Name, c.Full_Name, b.Content
FROM question a 
JOIN Answer b on a.Question_ID = b.Question_ID
JOIN `account` c on c.Account_ID = a.Creator_ID
JOIN Type_Question d on d.Type_ID = a.Type_ID;


-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm

SELECT d.Type_Name , count(d.Type_ID) as sl
FROM question a
JOIN Type_Question d on d.Type_ID = a.Type_ID
GROUP BY d.Type_ID;

-- Question 14:Lấy ra group không có account nào

SELECT  a.Group_ID, a.Group_Name, b.Account_ID
FROM `Group` a
LEFT JOIN `Group_Account` b
ON a.Group_ID = b.Group_ID
WHERE b.Account_ID is null;

-- Question 16: Lấy ra question không có answer nào

SELECT  a.Question_ID, a.Content, b.Question_ID
FROM question a
LEFT JOIN answer b
ON a.Question_ID = b.Question_ID
WHERE b.Question_ID is null;


-- Question 17:
	-- a) Lấy các account thuộc nhóm thứ 1
	-- b) Lấy các account thuộc nhóm thứ 2
    -- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau


SELECT b.Account_ID,  a.Full_Name
FROM `account` a
JOIN `Group_Account` b
ON a.Account_ID = b.Account_ID 
WHERE b.Group_ID = 1

UNION

SELECT b.Account_ID,  a.Full_Name
FROM `account` a
JOIN `Group_Account` b
ON a.Account_ID = b.Account_ID 
WHERE b.Group_ID = 3;

/*Question 18:
	a) Lấy các group có lớn hơn 5 thành viên
	b) Lấy các group có nhỏ hơn 7 thành viên
	c) Ghép 2 kết quả từ câu a) và câu b)*/

SELECT a.Group_ID, a.Group_Name
FROM `group` a
JOIN `Group_Account` b
ON a.Group_ID = b.Group_ID 
GROUP BY a.Group_ID
HAVING count(b.Group_ID) > 2

UNION all

SELECT a.Group_ID, a.Group_Name
FROM `group` a
JOIN `Group_Account` b
ON a.Group_ID = b.Group_ID 
GROUP BY a.Group_ID
HAVING count(b.Group_ID) < 10;












/*	Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
	Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
	Question 3: Viết lệnh để lấy ra tất cả các developer
	Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
	Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
	Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
	Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
	Question 8: Lấy ra Question có nhiều câu trả lời nhất
	Question 9: Thống kê số lượng account trong mỗi group
	Question 10: Tìm chức vụ có ít người nhất
	Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
	Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
	question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
	Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
	Question 14:Lấy ra group không có account nào
	Question 15: Lấy ra group không có account nào
	Question 16: Lấy ra question không có answer nào
	Exercise 2: Union
	Question 17:
	a) Lấy các account thuộc nhóm thứ 1
	b) Lấy các account thuộc nhóm thứ 2
	c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
	Question 18:
	a) Lấy các group có lớn hơn 5 thành viên
	b) Lấy các group có nhỏ hơn 7 thành viên
	c) Ghép 2 kết quả từ câu a) và câu b) */














