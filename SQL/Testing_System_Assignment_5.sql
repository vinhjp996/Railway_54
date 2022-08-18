

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale







-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
CREATE OR REPLACE VIEW cau3 as
			SELECT Content FROM question
			WHERE length(Content) > 20; 
SELECT * FROM cau3;
DELETE
FROM asdf;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất

SELECT * FROM `Account`;
SELECT a.Department_ID,b.Department_Name, count(a.Department_ID) as sl1
FROM `Account` a
JOIN Department b ON a.Department_ID = b.Department_ID
GROUP BY a.Department_ID
HAVING sl1 = (
				SELECT count(Department_ID) as sl
				FROM `Account`
				GROUP BY Department_ID
				ORDER BY Department_ID DESC LIMIT 1);


SELECT Department_ID, count(Department_ID) as sl
FROM `Account`
GROUP BY Department_ID
ORDER BY Department_ID DESC LIMIT 1;


-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW cau5 as
SELECT Full_Name,Content 
FROM `Account` a
JOIN Question b ON a.Account_ID = b.Creator_ID
WHERE Full_Name LIKE 'Nguyen%' ;

SELECT * FROM cau5;

/*Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo*/



WITH ABC_CTE_1 AS(
SELECT Full_Name,b.Department_Name
FROM `Account` a
JOIN Department b ON a.Department_ID = b.Department_ID
WHERE Department_Name = 'Sale')

SELECT * 
FROM ABC_CTE_1;







































