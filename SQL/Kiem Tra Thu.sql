DROP DATABASE IF EXISTS Quan_Ly_Thuc_Tap_Sinh;
CREATE DATABASE Quan_Ly_Thuc_Tap_Sinh;
USE Quan_Ly_Thuc_Tap_Sinh;


CREATE TABLE GiangVien (
magv 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
hoten			VARCHAR(50) NOT NULL UNIQUE KEY,
luong 			TINYINT UNSIGNED NOT NULL );

INSERT INTO 		GiangVien 	(	hoten,	 					luong 	)
VALUES 							(	'Nguyen Van Hoang',			10		),
								(	'Nguyen Van Tho',			15		),
                                (	'Nguyen Van Phuc',			20		);


CREATE TABLE SinhVien (
masv 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
hoten 				VARCHAR(50) NOT NULL ,
namsinh 			INT UNSIGNED ,
quequan 			VARCHAR(50) NOT NULL );

INSERT INTO 		SinhVien 	(	hoten,	 					namsinh,		quequan	 			)
VALUES 							(	'Nguyen Van Thanh',			1996,			'Tra Vinh'			),
								(	'Nguyen Van Hau',			1997,			'Vinh Long'			),
                                (	'Nguyen Van Lam',			2000,			'Can Tho'			);




CREATE TABLE DeTai (
madt				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
tendt				VARCHAR(50) NOT NULL UNIQUE KEY,
kinhphi				INT UNSIGNED NOT NULL,
NoiThucTap 			VARCHAR(50) NOT NULL UNIQUE KEY );


INSERT INTO 		DeTai 	(	tendt,	 					kinhphi,		NoiThucTap	 		)
VALUES 						(	'Cong Nghe Sinh Hoc',		100,			'Tra Vinh'			),
							(	'Cong Nghe Van',			200,			'Vinh Long'			),
							(	'Cong Nghe Toan',			300,			'Can Tho'			);


CREATE TABLE HuongDan (
id					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
magv				TINYINT UNSIGNED NOT NULL,
masv				TINYINT UNSIGNED NOT NULL,
madt				TINYINT UNSIGNED ,
ketqua 				VARCHAR(50) NOT NULL ,

FOREIGN KEY		(masv)
REFERENCES		SinhVien(masv) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(madt)
REFERENCES		DeTai(madt) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(magv)
REFERENCES		GiangVien(magv) ON DELETE CASCADE ON UPDATE CASCADE );

INSERT INTO 	HuongDan 	(	magv,	 		masv,		madt,			ketqua	 		)
VALUES 						(	2,				1,			3,				'Dau'			),
							(	1,				2,			null,			'Truoc'			),
                            (	3,				3,			1,				'Dau'			);
                            
                            
-- Lấy tất cả các sinh viên chưa có đề tài hướng dẫn

SELECT 	b.hoten, c.tendt
FROM 	HuongDan a
LEFT JOIN SinhVien b ON a.masv = b.masv
LEFT JOIN DeTai c ON c.madt = a.madt
WHERE	a.madt IS NULL;

--  Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’

SELECT tendt, count(a.madt) AS sl
FROM 	HuongDan a
JOIN SinhVien b ON a.masv = b.masv
JOIN DeTai c ON c.madt = a.madt
GROUP BY a.madt
HAVING	tendt = 'Cong Nghe Sinh Hoc' ;


/*Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm: mã số, họ tên và tên đề tài
	(Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")*/
    
CREATE VIEW SinhVienInfo AS
SELECT 	b.masv,b.hoten, ( CASE WHEN c.tendt IS NULL	THEN ' Chua Co' ELSE c.tendt END ) as tendt
FROM 	HuongDan a
LEFT JOIN SinhVien b ON a.masv = b.masv
LEFT JOIN DeTai c ON c.madt = a.madt ;

SELECT * FROM SinhVienInfo;

-- Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1990 thì hiện ra thông báo "năm sinh phải > 1990"

DROP TRIGGER IF EXISTS Bai_Thi;
DELIMITER $$
CREATE TRIGGER Bai_Thi 
BEFORE	INSERT ON SinhVien
FOR EACH ROW
BEGIN
	IF (new.namsinh <= 1990)
    THEN 
    SIGNAL SQLSTATE '11314' 
    SET MESSAGE_TEXT = ' Năm sinh phải > 1990 ';
    END IF;
    
END $$
DELIMITER ;

INSERT INTO 		SinhVien 	(	hoten,	 					namsinh,		quequan	 			)
VALUES 							(	'Nguyen Van Than',			1988,			'Tra Vinh'			);

SELECT * FROM SinhVien;


-- Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì tất cả thông tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi


DROP PROCEDURE IF EXISTS Bai_Thi_1;
DELIMITER $$
CREATE PROCEDURE Bai_Thi_1( in in_masv TINYINT )

BEGIN		
			
			DELETE 
            FROM SinhVien
            WHERE masv = in_masv;
			
END$$
DELIMITER ;

CALL Bai_Thi_1(1);
SELECT * FROM HuongDan;






/*SQL – Final Exam 2
Requirement 1:
Để quản lý Thực tập của sinh viên, người ta xây dựng một cơ sở dữ liệu có tên là
ThucTap gồm các sơ đồ quan hệ sau (trường có dấu gạch chân là PrimaryKey):
 GiangVien	(magv, hoten, luong)
 SinhVien	(masv, hoten, namsinh, quequan)
 DeTai		(madt, tendt, kinhphi, NoiThucTap)
 HuongDan	(id, masv, madt, magv, ketqua)
Questions
1. Tạo table với các ràng buộc và kiểu dữ liệu
Thêm ít nhất 3 bản ghi vào table
2. Viết lệnh để
a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn
b) Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’
3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
mã số, họ tên và tên đề tài
(Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")
4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900
thì hiện ra thông báo "năm sinh phải > 1900"
5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông
tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi
*/


































