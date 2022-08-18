
DROP DATABASE IF EXISTS Testing_System_Assignment_2;
CREATE DATABASE Testing_System_Assignment_2;
USE Testing_System_Assignment_2;



CREATE TABLE Department (
Department_ID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
Department_Name			VARCHAR(50) NOT NULL UNIQUE KEY );


DROP TABLE IF EXISTS	Position;
CREATE TABLE 			Position (
Position_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Position_Name			ENUM('Dev', 'Test', 'Crum Mater', 'PM') NOT NULL );


DROP TABLE IF EXISTS 	`Account`;
CREATE TABLE 			`Account` (
Account_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Email					VARCHAR(50)NOT NULL UNIQUE KEY,
Use_Name				VARCHAR(50)NOT NULL UNIQUE KEY,
Full_Name				VARCHAR(50) NOT NULL,
Department_ID			TINYINT UNSIGNED NOT NULL,
Position_ID				TINYINT UNSIGNED NOT NULL,
Create_Date				DATETIME DEFAULT NOW(),
FOREIGN KEY		(Department_ID)
REFERENCES		Department(Department_ID) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY		(Position_ID)
REFERENCES 		`Position`(Position_ID) ON DELETE CASCADE ON UPDATE CASCADE
 );


DROP TABLE IF EXISTS 	`Group`;
CREATE TABLE 			`Group` (
Group_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Group_Name				NVARCHAR(50) NOT NULL ,
Creator_ID				TINYINT UNSIGNED ,
Create_Date				DATETIME DEFAULT NOW(),
FOREIGN KEY	(Creator_ID) REFERENCES		`Account`(Account_ID)  ON DELETE CASCADE ON UPDATE CASCADE); 


DROP TABLE IF EXISTS 	Group_Account;
CREATE TABLE			Group_Account (
Group_ID 				TINYINT UNSIGNED NOT NULL ,
Account_ID				TINYINT UNSIGNED NOT NULL ,
Join_Date				DATETIME DEFAULT NOW(),
FOREIGN KEY	(Group_ID)  REFERENCES		`Group`(Group_ID)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY	(Account_ID)  REFERENCES		`Account`(Account_ID)ON DELETE CASCADE ON UPDATE CASCADE );


DROP TABLE IF EXISTS 	Type_Question;
CREATE TABLE 			Type_Question (
Type_ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Type_Name				ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE KEY) ;


DROP TABLE IF EXISTS 	Category_Question;
CREATE TABLE 			Category_Question (
Category_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Category_Name			NVARCHAR(50) NOT NULL) ;


DROP TABLE IF EXISTS 	Question;
CREATE TABLE 			Question (
Question_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) NOT NULL,
Category_ID				TINYINT UNSIGNED NOT NULL,
Type_ID					TINYINT UNSIGNED NOT NULL,
Creator_ID				TINYINT UNSIGNED NOT NULL,
Create_Date				DATETIME DEFAULT NOW(),
FOREIGN KEY		(Category_ID) REFERENCES 		Category_Question(Category_ID)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY		(Type_ID)     REFERENCES 		Type_Question(Type_ID)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY		(Creator_ID)  REFERENCES 		`Account`(Account_ID)ON DELETE CASCADE ON UPDATE CASCADE );


DROP TABLE IF EXISTS 	Answer;
CREATE TABLE 			Answer (
Answer_ID    			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Content					NVARCHAR(100) NOT NULL,
Question_ID				TINYINT UNSIGNED NOT NULL,
Is_Correct				BIT DEFAULT 1,
FOREIGN KEY 		(Question_ID) REFERENCES 			Question(Question_ID)  ON DELETE CASCADE ON UPDATE CASCADE);


DROP TABLE IF EXISTS	Exam;
CREATE TABLE 			Exam (
Exam_ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Code`					CHAR(20) NOT NULL,
Title					NVARCHAR(50) NOT NULL,
Category_ID				TINYINT UNSIGNED NOT NULL,
Doration				TINYINT UNSIGNED NOT NULL,
Creator_ID				TINYINT UNSIGNED NOT NULL,
Create_Date				DATETIME DEFAULT NOW(),
FOREIGN KEY		(Category_ID)  REFERENCES 		Category_Question(Category_ID)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY		(Creator_ID)   REFERENCES 		`Account`(Account_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS 	Exam_Question;
CREATE TABLE 			Exam_Question (
Exam_ID    				TINYINT UNSIGNED NOT NULL,
Question_ID				TINYINT UNSIGNED NOT NULL,
FOREIGN KEY		(Question_ID)   REFERENCES 		Question(Question_ID)ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY		(Exam_ID) 		REFERENCES 		Exam(Exam_ID)ON DELETE CASCADE ON UPDATE CASCADE
);


 -- Add Data Deparment
 
INSERT INTO 	Department 		(Department_Name	)
VALUES							('Marketing' 		),
								('Sale' 			),
								('Bao ve'			),
								('Nhan su'			),
								('Ky thuat' 		),
								('Tai chinh'		),
								('Pho giam doc'		),
								('Giam đoc' 		),
								('Thu ki' 			),
								('Lao cong' 		),
								('Ban hang' 		);
                                
                                
                                
INSERT INTO Position 			(Position_Name 		)
VALUES 							('Dev' 				),
								('Test'				),
								('Crum Mater'		),
								('PM' 				);

INSERT INTO 	`Account`	(Email, 					 	Use_Name, 			Full_Name, 					Department_ID, 		Position_ID,	Create_Date		)
VALUES 						('NguyenVinh@gmail.com',		'NguyenVinh',		'Nguyen Truong Vinh', 		'5' , 				'1',			'2020-03-05'	),
							('NguyenYen@gmail.com',			'NguyenYen',		'Nguyen Thi Ngoc Yen', 		'2' , 				'2',			'2020-03-05'	),
							('NguyenNhi@gmail.com', 		'NguyenNhi',		'Nguyen Dong Nhi', 			'1' , 				'2',			'2020-03-07'	),
							('NguyenDien@gmail.com', 		'NguyenDien',		'Nguyen Thi Dien', 			'3' , 				'4',			'2020-03-08'	),
							('LyCong@gmail.com', 			'LyCong',			'Ly Cong Tu', 				'5' , 				'4',			'2020-03-10'	),
							('TieuNuong@gmail.com', 		'TieuNuong',		'Tieu Co Nuong', 			'6' , 				'3',			'2020-04-05'	),
							('LangTu@gmail.com', 			'Lanh Tu',			'Do Be Mua Dao', 			'3' , 				'2', 			'2020-04-20' 	),
							('NguyenH@gmail.com', 			'NguyenH',			'Nguyen van H', 			'8' , 				'1',			'2020-04-07'	),
							('ChauJ@gmail.com', 			'ChauJ',			'Chau van J', 				'2' , 				'2',			'2020-04-07'	),
							('NguyenK@gmail.com', 			'NguyenK',			'Nguyen van Do', 			'10' ,				'1',			'2020-04-09'	),
							('BanhL@gmail.com', 			'BanhL',			'Banh van L', 				'7' , 				'1', 			 DEFAULT		),
							('NguyenN@gmail.com', 			'NguyenN',			'Nguyen van N', 			'10' , 				'1', 			 DEFAULT		),
							('NguyenN@gmaidfdfl.com', 			'NguyeeffnN',			'Nguyen van Nhhhhhhfussdv', 			'10' , 				'1', 			 DEFAULT		),
							('NguyenN@gmaidfssdddfl.com', 			'NguyeeffsdnN',			'Nguyen van Nhhhhhhfussdv', 			'10' , 				'1', 			 DEFAULT		);
                            
                            
INSERT INTO 	`Group` 	( Group_Name,		 		Creator_ID, 		Create_Date)
VALUES 						('Group1',					5,					'2019-03-05'),
							('Group2', 					1,					'2020-03-07'),
							('Group3', 					2,					'2020-03-09'),
							('Group4', 					3,					'2020-03-10'),
							('Group5', 					4,					'2020-03-28'),
							('Group6', 					6,					'2020-04-06'),
							('Group7', 					7,					'2020-04-07'),
							('Group8', 					8,					'2020-04-08'),
							('Group9',					9,					'2018-04-09'),
							('Group10', 				10,					'2020-04-10');
                            
                            
INSERT INTO 	`Group_Account` ( Group_ID, 		Account_ID, 		Join_Date )
VALUES 							( 1, 				1,					'2019-03-05'),
								( 1, 				2,					'2020-03-07'),
								( 3, 				3,					'2020-03-09'),
								( 3, 				4,					'2020-03-10'),
								( 5, 				5,					'2020-03-28'),
								( 1, 				3,					'2020-04-06'),
								( 1, 				7,					'2020-04-07'),
								( 8, 				3,					'2020-04-08'),
								( 1, 				9,					'2020-04-09'),
								( 10,				10,					'2020-04-10');



INSERT INTO 		Type_Question		(Type_Name 			)
VALUES 									('Essay' 			),
										('Multiple-Choice' 	);



INSERT INTO 		Category_Question 	(Category_Name 	)
VALUES 									('KT Mieng' 		),
										('KT 15p'			),
										('KT 20p' 			),
                                        ('KT 60p' 			),
										('KT 60p' 			),
										('G-HK 1' 			),
										('HK 1' 			),
										('G-HK 2' 			),
										('HK2' 				),
										('Cuoi Nam' 		);
										



INSERT INTO 		Question 	(Content,	 					Category_ID, 	Type_ID, 	Creator_ID, 	Create_Date	 )
VALUES 							('Cau hoi ve Toan', 			1,				'1', 		'2',			'2020-04-05'),
								('Cau Hoi ve Hoa', 				10,				'2', 		'2',			'2020-04-05'),
								('Hoi ve Sinh', 				9,				'2', 		'3',			'2020-04-06'),
								('Hoi ve Ly', 					6,				'1', 		'4',			'2022-04-06'),
								('Hoi ve Su', 					5,				'1', 		'5',			'2020-04-06'),
								('Hoi ve Dia', 					3,				'2', 		'6',			'2022-04-06'),
								('Hoi ve Giao Duc Cong Dan', 	2,				'1', 		'7',			'2020-04-06'),
								('Hoi ve Am Nhac', 				8,				'1', 		'8',			'2022-04-07'),
								('Hoi ve Anh Van', 				4,				'2', 		'9',			'2020-04-07'),
								('Hoi ve The Duc', 				7,				'1', 		'10',			'2020-04-07'),
								('Hoi ve The Duc', 				7,				'1', 		'10',			'2020-04-07');




INSERT INTO 		Answer		( Content,				 Question_ID,		 Is_Correct )
VALUES 							('Tra loi 01',				1, 					0 ),
								('Tra loi 02',				1, 					1 ),
								('Tra loi 03', 				1, 					0 ),
								('Tra loi 04', 				1, 					1 ),
								('Tra loi 05', 				2, 					1 ),
								('Tra loi 06', 				3, 					1 ),
								('Tra loi 07', 				4, 					0 ),
								('Tra loi 08', 				8, 					0 ),
								('Tra loi 09', 				9, 					1 ),
								('Tra loi 10', 				10, 				1 );



INSERT INTO 	Exam 		(`Code`, 		Title, 						Category_ID,	Doration,	 	Creator_ID, 	Create_Date )
VALUES 						('KT001', 		'De thi Toan',				1, 				15, 			'5',			'2019-04-05'),
							('KT002', 		'De thi Ly',				10, 			120, 			'2',			'2019-04-05'),
							('KT003', 		'De thi Hoa', 				9,				60,				'2',			'2019-04-07'),
							('KT004', 		'De thi Sinh', 				6, 				60, 			'3',			'2020-04-08'),
							('KT005', 		'De thi Su', 				5, 				90, 			'4',			'2020-04-10'),
							('KT006', 		'De thi Dia', 				3,				15, 			'6',			'2020-04-05'),
							('KT007', 		'De thi Anh Van', 			2,				15, 			'7',			'2020-04-05'),
							('KT008',		'De thi Am Nhac', 			8,				60, 			'8',			'2020-04-07'),
							('KT009',		'De thi The Duc',			4,				100 , 			'9',			'2020-04-07'),
							('KT0010',		'De thi Giao Duc Cong Dan', 7,				60 , 			'10',			'2020-04-08');




INSERT INTO 		Exam_Question	( Exam_ID, 				Question_ID )
VALUES 								( 1,					 5 ),
									( 2, 					10 ),
									( 3, 					4 ),
				 					( 4,	 				3 ),
									( 5, 					7 ),
									( 6, 					10 ),
									( 7, 					2 ),	
									( 8, 					10 ),
									( 9, 					9 ),	
                                    ( 9, 					9 ),
									( 9, 					9 ),
                                    
									( 10,					8 );




