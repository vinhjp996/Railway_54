

DROP DATABASE IF EXISTS Quan_Ly_Hoc_Sinh;
CREATE DATABASE Quan_Ly_Hoc_Sinh;
USE Quan_Ly_Hoc_Sinh;



CREATE TABLE Student (
StudentID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
Student_Name				VARCHAR(50) NOT NULL,
Age					TINYINT UNSIGNED,
Gender 				ENUM( '0' , '1', '2' ) NOT NULL ) ;

INSERT INTO 	Student 	( Student_Name,		 		Age, 			Gender)
VALUES 						('Nguyen van Do',			20,				'1'),
							('Nguyen van Re',			26,				'0'),
                            ('Nguyen van Mi',			23,				'2');


CREATE TABLE `Subject` (
SubjectID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
Subject_Name				VARCHAR(50) NOT NULL ) ;

INSERT INTO 	`Subject` 	( Subject_Name	 	)
VALUES 						('Toan'				),
							('Ly'				),
                            ('Hoa'				);



CREATE TABLE StudentSubject (
StudentID			TINYINT UNSIGNED, 
SubjectID			TINYINT UNSIGNED,
Mark				TINYINT UNSIGNED, 
`Date`				DATETIME DEFAULT NOW() ,

FOREIGN KEY		(StudentID)
REFERENCES		Student(StudentID)ON DELETE CASCADE ON UPDATE CASCADE ,

FOREIGN KEY		(SubjectID)
REFERENCES		`Subject`(SubjectID)ON DELETE CASCADE ON UPDATE CASCADE  );


INSERT INTO 	StudentSubject 	( StudentID,		 	SubjectID, 			Mark		)
VALUES 							(	1,					2,					10			),
								(	2,					3,					1			),
                                (	3,					2,					9			);


-- Lấy tất cả các môn học không có bất kì điểm nào

SELECT Subject_Name, Mark
FROM `Subject` a
LEFT JOIN StudentSubject b ON a.SubjectID = b.SubjectID
WHERE Mark IS NULL;

--  Lấy danh sách các môn học có ít nhất 2 điểm

SELECT Subject_Name, b.SubjectID
FROM `Subject` a
LEFT JOIN StudentSubject b ON a.SubjectID = b.SubjectID
WHERE Mark <= 2 ;




/*Tạo view có tên là "StudentInfo" lấy các thông tin về học sinh bao gồm:
Student ID,Subject ID, Student Name, Student Age, Student Gender,
Subject Name, Mark, Date
(Với cột Gender show 'Male' để thay thế cho 0, 'Female' thay thế cho 1 và
'Unknow' thay thế cho null)*/


CREATE VIEW StudentInfo AS

SELECT a.StudentID , a.Student_Name, 
( CASE a.Gender WHEN '0' THEN 'Male' 
				WHEN '1' THEN 'Female' 	
                ELSE 'Unknow' END ) as Gender,c.SubjectID, c.Subject_Name , a.Age,  b.Mark, b.`Date`
FROM Student a
LEFT JOIN StudentSubject b ON a.StudentID = b.StudentID
LEFT JOIN  `Subject` c ON c.SubjectID = b.SubjectID;


SELECT * FROM StudentInfo;


/*4. Không sử dụng On Update Cascade & On Delete Cascade
a) Tạo trigger cho table Subject có tên là SubjectUpdateID:
Khi thay đổi data cột ID của table Subject, thì giá trị tương
ứng với cột SubjectID của table StudentSubject cũng thay đổi theo*/


DROP TRIGGER IF EXISTS SubjectUpdateID;
DELIMITER $$
CREATE TRIGGER SubjectUpdateID
AFTER UPDATE ON `Subject`
FOR EACH ROW
BEGIN
		UPDATE StudentSubject
        SET SubjectID = NEW.SubjectID
        WHERE SubjectID = OLD.SubjectID;
        
END$$
DELIMITER ;

UPDATE `Subject`
   SET SubjectID='5'
 WHERE SubjectID='2';
         
SELECT * FROM StudentSubject;







/*Ta có 1 database để quản lý điểm của học sinh như dưới (trường có dấu gạch chân là PrimaryKey)
 Student(ID,Name,Age,Gender)
 Subject(ID, Name)
 StudentSubject(StudentID,SubjectID,Mark,Date)
Questions
1. Tạo table với các ràng buộc và kiểu dữ liệu
Thêm ít nhất 3 bản ghi vào table
2. Viết lệnh để
a) Lấy tất cả các môn học không có bất kì điểm nào
b) Lấy danh sách các môn học có ít nhất 2 điểm
3. Tạo view có tên là "StudentInfo" lấy các thông tin về học sinh bao gồm:
Student ID,Subject ID, Student Name, Student Age, Student Gender,
Subject Name, Mark, Date
(Với cột Gender show 'Male' để thay thế cho 0, 'Female' thay thế cho 1 và
'Unknow' thay thế cho null)
4. Không sử dụng On Update Cascade & On Delete Cascade
a) Tạo trigger cho table Subject có tên là SubjectUpdateID:
Khi thay đổi data của cột ID của table Subject, thì giá trị tương
ứng với cột SubjectID của table StudentSubject cũng thay đổi
theo
b) Tạo trigger cho table StudentSubject có tên là StudentDeleteID:
Khi xóa data của cột ID của table Student, thì giá trị tương ứng với
cột StudentID của table StudentSubject cũng bị xóa theo */

































































