


-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

-- Do đầu ra trả về một bảng mà một bản thì không có datatype nên với nhửng bài đầu ra là một bản nên không bắt buộc phải ghi out
-- Đầu vào bắt buộc phải có nếu đề bì cho còn đầu ra thì không cần phải ghi củng được 


DROP PROCEDURE IF EXISTS get_Department_Name;
DELIMITER $$
CREATE PROCEDURE get_Department_Name ( IN in_Department_Name VARCHAR(50))
	
    BEGIN
			SELECT a.Account_ID,a.Email,a.Full_Name,b.Department_Name
            FROM `Account` a
            JOIN department b ON a.Department_ID = b.Department_ID
            WHERE b.Department_Name = in_Department_Name;
    
    
    END$$
DELIMITER ;

CALL get_Department_Name ( 'bao ve' );



-- Question 2: Tạo store để in ra số lượng account trong mỗi group


DROP PROCEDURE IF EXISTS get_group;
DELIMITER $$
CREATE PROCEDURE get_group ()
	
    BEGIN
			SELECT a.Group_ID, a.Group_Name , count(b.Account_ID) as sl_ac
            FROM `Group` a
            LEFT JOIN group_account b ON a.Group_ID = b.Group_ID
            GROUP BY a.Group_ID;
    END$$
DELIMITER ;

CALL get_group ();


 -- Nhập vào ID group in ra số account trong group đó

DROP PROCEDURE IF EXISTS get_group;
DELIMITER $$
CREATE PROCEDURE get_group ( IN in_Group_ID TINYINT)
	
    BEGIN
			SELECT b.Group_ID, a.Group_Name  , count(b.Account_ID) as sl_ac
            FROM `Group` a
            JOIN group_account b ON a.Group_ID = b.Group_ID
            WHERE b.Group_ID = in_Group_ID ;
    
    
    END$$
DELIMITER ;

CALL get_group ( '1' );



-- Tạo store truyền vào id của group và in ra tất cả các account trong group đó
DROP PROCEDURE IF EXISTS get_group;
DELIMITER $$
CREATE PROCEDURE get_group ( IN in_Group_ID TINYINT)
	
    BEGIN
			SELECT b.Group_ID, a.Group_Name, c.Email, c.Full_Name  , count(b.Account_ID) as sl_ac
            FROM `Group` a
            JOIN group_account b ON a.Group_ID = b.Group_ID
            JOIN `account` c on b.Account_ID = c.Account_ID
            WHERE b.Group_ID = in_Group_ID ;
    
    
    END$$
DELIMITER ;

CALL get_group ( '1' );



-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại

DROP PROCEDURE IF EXISTS get_question;
DELIMITER $$
CREATE PROCEDURE get_question ()
	
    BEGIN
			SELECT Type_Name, count(b.Type_ID) as sl_ac
            FROM question a
            JOIN Type_Question b ON a.Type_ID = b.Type_ID
            WHERE month(a.Create_Date) = month(now()) AND  year(a.Create_Date) = year(now()) 
			GROUP BY b.Type_ID ;
    
    END$$
DELIMITER ;

CALL get_question ();



-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

SELECT count(Type_ID) as sl_ac
FROM question 
GROUP BY Type_ID;
 
			-- Cach 1:
 
DROP PROCEDURE IF EXISTS get_question_4 ;
DELIMITER $$
CREATE PROCEDURE get_question_4 ()
	
    BEGIN
			with cte_max_type_id as (	SELECT count(Type_ID) as max_sl 
										FROM question 
                                        GROUP BY Type_ID)
			SELECT Type_ID, count(Type_ID) as max_ab
            FROM question 
			GROUP BY Type_ID 
            HAVING count(Type_ID) = ( SELECT max(max_sl) FROM cte_max_type_id );
    END$$
DELIMITER ;
CALL get_question_4 ();

			-- cách 2: Sử dụng subquery 2 lần.

DROP PROCEDURE IF EXISTS get_question_4 ;
DELIMITER $$
CREATE PROCEDURE get_question_4 ()
	
    BEGIN			
			SELECT Type_ID, count(Type_ID) as max_ab
            FROM question 
			GROUP BY Type_ID 
            HAVING count(Type_ID) = ( 	SELECT max(max_sl) 
										FROM (	SELECT count(Type_ID) as max_sl 
												FROM question 
												GROUP BY Type_ID ) as x );
    END$$
DELIMITER ;
CALL get_question_4 ();


		-- Cách 3: Sử dụng subquery 1 lần.

DROP PROCEDURE IF EXISTS get_question_4 ;
DELIMITER $$
CREATE PROCEDURE get_question_4 ()
	
    BEGIN			
			SELECT Type_ID
            FROM question 
			GROUP BY Type_ID 
            HAVING count(Type_ID) = ( 	SELECT count(Type_ID) as max_sl 
										FROM question 
										GROUP BY Type_ID 
                                        ORDER BY max_sl DESC LIMIT 1 );
    END$$
DELIMITER ;
CALL get_question_4 ();


-- Cách 4: Dùng tham số đầu ra
DROP PROCEDURE IF EXISTS sp_GetCountQuesFromType;
DELIMITER $$
CREATE PROCEDURE sp_GetCountQuesFromType(OUT v_ID TINYINT)
BEGIN			
			SELECT Type_ID INTO v_ID
            FROM question 
			GROUP BY Type_ID 
            HAVING count(Type_ID) = ( 	SELECT count(Type_ID) as max_sl 
										FROM question 
										GROUP BY Type_ID 
                                        ORDER BY max_sl DESC LIMIT 1 );
    END$$
DELIMITER ;
SET @ID =0;
Call sp_GetCountQuesFromType(@ID);
SELECT @ID;


-- Cach 5: Dùng CTE có tham số đầu ra

DROP PROCEDURE IF EXISTS sp_GetCountQuesFromType;
DELIMITER $$
CREATE PROCEDURE sp_GetCountQuesFromType(OUT v_ID TINYINT)
BEGIN
WITH CTE_CountTypeID AS (	SELECT count(Type_ID) AS SL 
							FROM question 
							GROUP BY Type_ID)
                            
		SELECT q.Type_ID INTO v_ID 
		FROM question q
		GROUP BY q.Type_ID
		HAVING COUNT(q.Type_ID) = (	SELECT max(SL) 
									FROM CTE_CountTypeID);
                                    
END$$
DELIMITER ;
SET @ID =0;
Call sp_GetCountQuesFromType(@ID);
SELECT @ID;


-- Câu 4.1 : Tạo store để trả ra name của type question có nhiều câu hỏi nhất

DROP PROCEDURE IF EXISTS sp_GetCountQuesFromType;
DELIMITER $$
CREATE PROCEDURE sp_GetCountQuesFromType(OUT v_ID VARCHAR(50))
BEGIN			
			SELECT Type_Name INTO v_ID
            FROM question a
            JOIN type_question b ON a.Type_ID = b.Type_ID
			GROUP BY a.Type_ID 
            HAVING count(a.Type_ID) = ( 	SELECT count(Type_ID) as max_sl 
											FROM question 
											GROUP BY Type_ID 
											ORDER BY max_sl DESC LIMIT 1 );
    END$$
DELIMITER ;
SET @name1 ='';
Call sp_GetCountQuesFromType(@name1);
SELECT @name1;



-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question

DROP PROCEDURE IF EXISTS get_question_4 ;
DELIMITER $$
CREATE PROCEDURE get_question_4 ()
	
    BEGIN
			with cte_max_type_id as (	SELECT count(Type_ID) as max_sl 
										FROM question 
                                        GROUP BY Type_ID)
                                        
			SELECT Type_Name, b.Type_ID, count(a.Type_ID) as max_sl
            FROM question a
            JOIN Type_Question b ON a.Type_ID = b.Type_ID
			GROUP BY b.Type_ID 
            HAVING count(a.Type_ID) = (	SELECT max(max_sl) FROM cte_max_type_id);
    END$$
DELIMITER ;
CALL get_question_4 ();

-- Question 6: 	Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
			-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS get_question_6 ;
DELIMITER $$
CREATE PROCEDURE get_question_6 ( in in_Group_Name VARCHAR(50)) 
	
    BEGIN
			SELECT Group_Name AS group_use_name 
            FROM `group`
            WHERE Group_Name LIKE concat('%',in_Group_Name,'%')
            UNION
            SELECT Use_Name  
            FROM `Account`
            WHERE Use_Name LIKE concat ('%',in_Group_Name,'%') ;
	END$$
DELIMITER ;
CALL get_question_6 ('ng');



SELECT Department_ID
FROM department
UNION ALL
SELECT Department_ID
FROM `account` ORDER BY Department_ID;



-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
			-- username sẽ giống email nhưng bỏ phần @..mail đi positionID: sẽ có default là developer
			-- departmentID: sẽ được cho vào 1 phòng chờ Sau đó in ra kết quả tạo thành công

SELECT * from Department;

/*vti@gmail@123
substring_index(vti@gmail@123,'@',1) = vti
substring_index(vti@gmail@123,'@',2)= gmail
substring_index(vti@gmail@123,'@',3) = 123
substring_index(vti@gmail@123,'@',-1) = 123
substring_index(vti@gmail@123,'i',-2) = @gma*/


DROP PROCEDURE IF EXISTS get_question_7 ;
DELIMITER $$
CREATE PROCEDURE get_question_7 ( in in_fullName VARCHAR(50),  in in_email VARCHAR(50))
	
    BEGIN -- substring_index có 3 phần: - giá trị truyền vào. - mốc để cắt giá trị. - 
			DECLARE new_Use_Name VARCHAR(50) DEFAULT substring_index(in_email,'@',1);
            DECLARE new_Department_ID TINYINT UNSIGNED DEFAULT 11 ;
            DECLARE new_Position_ID TINYINT UNSIGNED DEFAULT 1 ;
            DECLARE new_Create_Date DATETIME DEFAULT NOW() ;
INSERT INTO `Account` 	(Email, 			Use_Name, 			Full_Name, 			Department_ID, 			Position_ID,		Create_Date		)
VALUES 					(in_email,			new_Use_Name,		in_fullName, 		new_Department_ID , 	new_Position_ID,	new_Create_Date	);
            
            
	END$$
DELIMITER ;
CALL get_question_7 ('abc','ddss@gmail.com');
SELECT * FROM `Account`;



-- Question 8: 		Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
				-- 	để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE IF EXISTS Question_8;
DELIMITER $$
CREATE PROCEDURE Question_8( in in_Type_Name ENUM('Essay','Multiple-Choice'))

BEGIN			
			SELECT *, length(a.Content) as sl
            FROM question a
            JOIN type_question b ON a.Type_ID = b.Type_ID
            WHERE b.Type_Name = in_Type_Name 
            AND  length(a.Content) = (	SELECT length(Content)
										FROM question a
										JOIN type_question b ON a.Type_ID = b.Type_ID
										WHERE b.Type_Name = in_Type_Name
										ORDER BY length(Content)  DESC LIMIT 1);

    END$$
DELIMITER ;
CALL Question_8 ('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

            
DROP PROCEDURE IF EXISTS Question_9;
DELIMITER $$
CREATE PROCEDURE Question_9( in in_exam_ID TINYINT )

BEGIN		
			DELETE 
            FROM exam_question
            WHERE exam_ID = in_exam_ID;
			DELETE 
            FROM exam
            WHERE exam_ID = in_exam_ID;
            
END$$
DELIMITER ;
CALL Question_9 (2);
SELECT * FROM exam;


-- Question 10: 	Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
				-- Sau đó in số lượng hàng đã xóa từ các table liên quan trong khi xóa



DROP PROCEDURE IF EXISTS Question_10;
DELIMITER $$
CREATE PROCEDURE Question_10 ()

BEGIN	
		DECLARE delete_exam INT DEFAULT 0;
        DECLARE delete_exam_question INT DEFAULT 0;
        DECLARE i INT DEFAULT 1;
        DECLARE id INT ;
        
		SELECT count(a.Exam_ID) INTO delete_exam_question
		FROM exam a
		JOIN exam_question b ON a.Exam_ID = b.Exam_ID
		WHERE year(now()) - year(a.Create_Date) >= 3;
        
		SELECT count(Exam_ID) INTO delete_exam
		FROM exam
		WHERE year(now()) - year(Create_Date) >= 3;	
            
		while (i<= delete_exam) 
        do
			select Exam_ID into id 
            from exam 
            where year(now()) - year(Create_Date) >= 3 limit 1;
            
			call Question_9(id);
			set i = i+1;
		end while; 
			select concat(	'ở bảng exam xóa ',delete_exam,' hàng.		 
							ở bảng examquestion xóa', delete_exam_question, ' hàng.
                            Tổng xóa ', delete_exam+ delete_exam_question, ' hàng' ) as thongbao;

            
END$$
DELIMITER ;
CALL Question_10 ();
SELECT * FROM exam;



-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
			-- nhập vào tên phòng ban cần xóa và các account thuộc phòng ban đó sẽ được
			-- chuyển về phòng ban default là phòng ban chờ việc.


SELECT * FROM department;
SELECT * FROM `account` ;

DROP PROCEDURE IF EXISTS Question_11;
DELIMITER $$
CREATE PROCEDURE Question_11( in in_Department_Name VARCHAR(50) )

BEGIN		
			UPDATE `account` 
			SET Department_ID = 12
			WHERE Department_ID = (	SELECT Department_ID
									FROM Department
									WHERE Department_Name = in_Department_Name);
			DELETE 
            FROM Department
            WHERE Department_Name = in_Department_Name;
            
            SELECT *
            FROM `account`
            WHERE Department_ID = 12;
            
END$$
DELIMITER ;
CALL Question_11 ('bao ve');


-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

DROP PROCEDURE IF EXISTS Question_12;
DELIMITER $$
CREATE PROCEDURE Question_12( in in_Department_Name VARCHAR(50) )

BEGIN		
			SELECT thang , count(thang) as sl
			FROM 		(	SELECT Question_ID, month(Create_Date) as thang
							FROM question
			WHERE year(Create_Date) = year(now())) as x
GROUP BY thang;
            
END$$
DELIMITER ;
CALL Question_12 ('bao ve');

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
				-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng)

SELECT * 
FROM question;


DROP PROCEDURE IF EXISTS sp_CountQuesInMonth;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesInMonth()
BEGIN
with cte_month as(
	select 1 as `month`
    union
    select 2 as `month`
    union
    select 3 as `month`
    union
    select 4 as `month`
    union
    select 5 as `month`
    union
    select 6 as `month`
    union
    select 7 as `month`
    union
    select 8 as `month`
    union
    select 9 as `month`
    union
    select 10 as `month`
    union
    select 11 as `month`
    union
    select 12 as `month`
)
select a.`month`, count(b.Question_ID) as so_luong
from cte_month a 
left join ( select * 
			from question 	
            where year(Create_Date) = year(now())) b on a.`month`= month(b.Create_Date) 
group by a.`month`;
END$$
DELIMITER ;
Call sp_CountQuesInMonth();


DROP PROCEDURE IF EXISTS sp_CountQuesInMonth;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesInMonth()
BEGIN
WITH CTE_12Months AS (
SELECT 1 AS MONTH
UNION SELECT 2 AS MONTH
UNION SELECT 3 AS MONTH
UNION SELECT 4 AS MONTH
UNION SELECT 5 AS MONTH
UNION SELECT 6 AS MONTH
UNION SELECT 7 AS MONTH
UNION SELECT 8 AS MONTH
UNION SELECT 9 AS MONTH
UNION SELECT 10 AS MONTH
UNION SELECT 11 AS MONTH
UNION SELECT 12 AS MONTH
)
SELECT M.MONTH, count(MONTH(Q.Create_Date)) AS SL FROM CTE_12Months M
LEFT JOIN (SELECT * FROM question Q1 WHERE YEAR(Q1.Create_Date) = YEAR(now()) ) Q
ON M.MONTH = month(Q.Create_Date)
GROUP BY M.MONTH;
END$$
DELIMITER ;

CALL sp_CountQuesInMonth();



WITH CTE_12Months AS (
	  SELECT 1 AS MONTH
UNION SELECT 2 AS MONTH
UNION SELECT 3 AS MONTH
UNION SELECT 4 AS MONTH
UNION SELECT 5 AS MONTH
UNION SELECT 6 AS MONTH
UNION SELECT 7 AS MONTH
UNION SELECT 8 AS MONTH
UNION SELECT 9 AS MONTH
UNION SELECT 10 AS MONTH
UNION SELECT 11 AS MONTH
UNION SELECT 12 AS MONTH
)
SELECT *
FROM CTE_12Months M
LEFT JOIN (SELECT * FROM question Q1 WHERE YEAR(Q1.Create_Date) = YEAR(now()) ) Q
ON M.MONTH = MONTH(Q.Create_Date);


SELECT * 
FROM question Q1 
WHERE YEAR(Q1.Create_Date) = YEAR(now());






-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
				-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng)
                
DROP PROCEDURE IF EXISTS sp_CountQuesBefore6Month;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesBefore6Month()
BEGIN
with cte_month2 as (
	select month(date_sub(now(), interval 5 month)) as `month`, year(date_sub(now(), interval 5 month)) as `year`
    union
    select month(date_sub(now(), interval 4 month)) as `month`, year(date_sub(now(), interval 4 month)) as `year`
    union
    select month(date_sub(now(), interval 3 month)) as `month`, year(date_sub(now(), interval 3 month)) as `year`
    union
    select month(date_sub(now(), interval 2 month)) as `month`, year(date_sub(now(), interval 2 month)) as `year`
    union
    select month(date_sub(now(), interval 1 month)) as `month`, year(date_sub(now(), interval 1 month)) as `year`
    union
	select month(now()) as `month`, year(now()) as `year`)
    
select a.`month`, a.`year`, case when count(b.QuestionID) = 0 then 'không có câu hỏi nào'
									else count(b.QuestionID)
									end as so_luong 
from cte_month2 a
left join (	select * 
			from question 
            where CreateDate>= date_sub(now(), interval 5 month)) b on a.`month` = month(b.CreateDate) 
group by a.`month`;

END$$
DELIMITER ;

CALL sp_CountQuesBefore6Month;




with cte_month2 as (
	select month(date_sub(now(), interval 5 month)) as `month`, year(date_sub(now(), interval 5 month)) as `year`
    union
    select month(date_sub(now(), interval 4 month)) as `month`, year(date_sub(now(), interval 4 month)) as `year`
    union
    select month(date_sub(now(), interval 3 month)) as `month`, year(date_sub(now(), interval 3 month)) as `year`
    union
    select month(date_sub(now(), interval 2 month)) as `month`, year(date_sub(now(), interval 2 month)) as `year`
    union
    select month(date_sub(now(), interval 1 month)) as `month`, year(date_sub(now(), interval 1 month)) as `year`
    union
	select month(now()) as `month`, year(now()) as `year`)
    
select a.`month`, a.`year`,  CASE WHEN	 count(b.Question_ID) = 0 
										then 'không có câu hỏi nào'
										else count(b.Question_ID)
										end as so_luong 
from cte_month2 a
left join (	select * 
			from question 
            where Create_Date >= date_sub(now(), interval 5 month)) b on a.`month` = month(b.Create_Date) 
group by a.`month`;

with cte_month2 as (
	select month(date_sub(now(), interval 5 month)) as `month`, year(date_sub(now(), interval 5 month)) as `year`
    union
    select month(date_sub(now(), interval 4 month)) as `month`, year(date_sub(now(), interval 4 month)) as `year`
    union
    select month(date_sub(now(), interval 3 month)) as `month`, year(date_sub(now(), interval 3 month)) as `year`
    union
    select month(date_sub(now(), interval 2 month)) as `month`, year(date_sub(now(), interval 2 month)) as `year`
    union
    select month(date_sub(now(), interval 1 month)) as `month`, year(date_sub(now(), interval 1 month)) as `year`
    union
	select month(now()) as `month`, year(now()) as `year`)
    
    SELECT * FROM cte_month2;





/*Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
account thuộc phòng ban đó
Question 2: Tạo store để in ra số lượng account trong mỗi group
Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
trong tháng hiện tại
Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào
Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
trong store sẽ tự động gán:
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
Sau đó in ra kết quả tạo thành công
Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
dụng store ở câu 9 để xóa)
Sau đó in số lượng record đã remove từ các table liên quan trong khi
removing
Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
chuyển về phòng ban default là phòng ban chờ việc
Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6
tháng gần đây nhất
(Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong
tháng")*/
















































