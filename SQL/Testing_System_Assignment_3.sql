

-- Question 3: lấy ra id của phòng ban "Sale"

SELECT Department_ID FROM department
WHERE Department_Name LIKE "Sale";

-- Question 4: lấy ra thông tin account có full name dài nhất

SELECT max(length((Full_Name))) FROM `account`;

SELECT * FROM `account`
WHERE length((Full_Name)) = (SELECT max(length((Full_Name))) FROM `account`);


-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3

-- Trường hợp 1 lấy ra account có full name dài nhất trong phòng ban có id = 3
SELECT max(length((Full_Name))) FROM `account`
WHERE Department_ID = 3;

SELECT * FROM `account`
WHERE length((Full_Name)) = (SELECT max(length((Full_Name))) FROM `account` WHERE Department_ID = 3) and Department_ID = 3;

-- Trường hợp 2: Lấy ra account có full name dài nhất trong tất cả các account và có deparmentid = 3

SELECT max(length((Full_Name))) FROM `account`;

SELECT * FROM `account`
WHERE length((Full_Name)) = (SELECT max(length((Full_Name))) FROM `account`) and Department_ID = 3;


-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019

SELECT * FROM `group`
WHERE Create_Date < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời


SELECT a.Question_ID, count(a.Question_ID) as SL FROM Answer a
GROUP BY a.Question_ID
HAVING count(a.Question_ID) >= 4;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019

SELECT * FROM exam
WHERE Doration >= 60 AND Create_Date < '2019-12-20';


-- Question 9: Lấy ra 5 group được tạo gần đây nhất

SELECT * FROM `group`
ORDER BY Create_Date DESC
LIMIT 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2

SELECT count(1) FROM `account`
WHERE Department_ID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
-- trong substring có 3 thành phần: chuổi cần cắt, vị trí bắt đầu(1 là đầu tiên, -1 là vị trí cuối ), số lượng kí tự. Nếu vị trtis ở giử là 1 thì sẽ lấy từ trái sang phải còn -1 thì sẽ lấy từ phải sang trái

substring(vti@gmail@123,-2,2) = 12

SELECT * FROM `account`
WHERE (substring(Full_Name,1,1)) LIKE 'N' AND (substring(Full_Name,-2,1)) LIKE 'e';

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
 
 DELETE 
 FROM exam 
 WHERE Create_Date < '2019-12-20';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"ALTER

SELECT * FROM question;

DELETE 
FROM question
WHERE (substring(Content,1,7)) LIKE 'cau hoi';

DELETE 
FROM question 
WHERE Content LIKE "cau hoi%";

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn

SELECT * FROM `account`;

UPDATE `account`
SET Full_Name = 'nguyen ba loc', email = 'thanh.loc.nguyenba@vti.com.vn'
WHERE Account_ID = 5;


-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 

SELECT * FROM Group_Account;

UPDATE `Group_Account`
SET Group_ID = 4
WHERE Account_ID = 5;


/*	Question 1: Thêm ít nhất 10 record vào mỗi table
	Question 2: lấy ra tất cả các phòng ban
	Question 3: lấy ra id của phòng ban "Sale"
	Question 4: lấy ra thông tin account có full name dài nhất
	Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
	Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
	Question 7: Lấy ra ID của question có >= 4 câu trả lời
	Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
	Question 9: Lấy ra 5 group được tạo gần đây nhất
	Question 10: Đếm số nhân viên thuộc department có id = 2
	Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
	Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
	Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
	Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
	Question 15: update account có id = 5 sẽ thuộc group có id = 4 */
    
    
    
    
    
    
    
    
    
    