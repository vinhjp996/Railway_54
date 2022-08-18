DROP DATABASE IF EXISTS Extra_Assignment_2;
CREATE DATABASE Extra_Assignment_2;
USE Extra_Assignment_2;

DROP TABLE IF EXISTS 	LOAIMATHANG;
CREATE TABLE LOAIMATHANG (
MaLoaiMatHang 							TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
TenLoaiMatHang							VARCHAR(50) NOT NULL );



DROP TABLE IF EXISTS 	DICHVU;
CREATE TABLE DICHVU (
MaDichVu 								TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
TenDichVu								VARCHAR(50) NOT NULL );



DROP TABLE IF EXISTS 	KHOANGTHOIGIAN;
CREATE TABLE KHOANGTHOIGIAN (
MaKhoanThoiGianGiaoHang 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
MoTa									VARCHAR(50) NOT NULL );



DROP TABLE IF EXISTS 	KHUVUC;
CREATE TABLE KHUVUC (
MaKhuVuc 								TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
TenKhuVuc								VARCHAR(50) NOT NULL );


DROP TABLE IF EXISTS 	THANHVIENGIAOHANG;
CREATE TABLE THANHVIENGIAOHANG (
MaThanhVienGiaoHang 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
TenThanhVienGiaoHang				   	VARCHAR(50) NOT NULL ,
NgaySinh								DATETIME,
GioiTinh								ENUM('Nam','Nu') NOT NULL ,
SDTThanhVien							TINYINT UNSIGNED,
DiaChiThanhVien							VARCHAR(50) NOT NULL 
);



DROP TABLE IF EXISTS 	DANGKIGIAOHANG;
CREATE TABLE DANGKIGIAOHANG (
MaThanhVienGiaoHang						TINYINT UNSIGNED AUTO_INCREMENT  ,
MaKhoangThoiGianDangKiGiaoHang			TINYINT UNSIGNED,
PRIMARY KEY (MaThanhVienGiaoHang,MaKhoangThoiGianDangKiGiaoHang)
);
  
  
  

DROP TABLE IF EXISTS 	KHACHHANG;
CREATE TABLE KHACHHANG (
MaKhachHang								TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
MaKhuVuc								TINYINT UNSIGNED NOT NULL,
TenKhachHang							VARCHAR(50) NOT NULL,
SDTKhachHang							TINYINT UNSIGNED NOT NULL,
DiaChiEmail								VARCHAR(50) NOT NULL,
DiaChiNhanHang							VARCHAR(50) NOT NULL,
FOREIGN KEY		(MaKhuVuc)
REFERENCES		KHUVUC(MaKhuVuc) ON DELETE CASCADE ON UPDATE CASCADE
 );
 
 
 
 
DROP TABLE IF EXISTS 	DONHANG_GIAOHANG;
CREATE TABLE DONHANG_GIAOHANG (
MaDonHangGiaoGiaoHang 					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
MaKhachHang								TINYINT UNSIGNED NOT NULL,
MaThanhVienGiaoHang 					TINYINT UNSIGNED NOT NULL,
MaDichVu 								TINYINT UNSIGNED NOT NULL,
MaKhuVucGiaoHang 						TINYINT UNSIGNED NOT NULL,
TenNguoiNhan 							VARCHAR(50) NOT NULL,
DiaChiGiaoHang 							VARCHAR(50) NOT NULL,
SDTNguoiNhan 							TINYINT UNSIGNED NOT NULL,
MaKhoanThoiGianGiaoHang 				TINYINT UNSIGNED NOT NULL ,
NgayGiaoHang 							TINYINT UNSIGNED NOT NULL,
PhuongThucThanhToan 					VARCHAR(50) NOT NULL,
TrangThaiPheDuyet 						VARCHAR(50) ,
TrangThaiGiaoHang 						VARCHAR(50) ,
FOREIGN KEY		(MaKhachHang)
REFERENCES		KHACHHANG(MaKhachHang) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(MaThanhVienGiaoHang)
REFERENCES		THANHVIENGIAOHANG(MaThanhVienGiaoHang) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(MaDichVu)
REFERENCES		DICHVU(MaDichVu) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(MaKhuVucGiaoHang)
REFERENCES		KHUVUC(MaKhuVuc) ON DELETE CASCADE ON UPDATE CASCADE,

FOREIGN KEY		(MaKhoanThoiGianGiaoHang)
REFERENCES		KHOANGTHOIGIAN(MaKhoanThoiGianGiaoHang) ON DELETE CASCADE ON UPDATE CASCADE

);




DROP TABLE IF EXISTS 	CHITIET_DONHANG;
CREATE TABLE CHITIET_DONHANG (
MaDonHangGiaoHang						TINYINT UNSIGNED AUTO_INCREMENT  ,
TenSanPhamDuocGiao						CHAR(100)   NOT NULL ,
SoLuong									TINYINT UNSIGNED NOT NULL,
TrongLuong								TINYINT UNSIGNED NOT NULL,
MaLoaiMatHang							TINYINT UNSIGNED NOT NULL,
TienThuHo								TINYINT UNSIGNED NOT NULL,
PRIMARY KEY		(MaDonHangGiaoHang,TenSanPhamDuocGiao),
FOREIGN KEY		(MaLoaiMatHang)
REFERENCES		LOAIMATHANG(MaLoaiMatHang) ON DELETE CASCADE ON UPDATE CASCADE

);


INSERT INTO 	LOAIMATHANG 		(	MaLoaiMatHang,			TenLoaiMatHang	)
VALUES								(	MH001,					'Quan Ao' 		),
									(	MH002,					'My Pham' 		),
									(	MH003,					'Do Gia Dung' 	),
									(	MH004,					'Do Dien Tu' 	);
                                    
                                    
INSERT INTO 	DICHVU 				(	MaDichVu,				TenDichVu								)
VALUES								(	DV001,					'Giao Hang Nguoi Nhan Tra Tien Phi' 	),
									(	DV002,					'Giao Hang Nguoi Gui Tra Tien Phi' 		),
									(	DV003,					'Giao Hang Cong Ich( Khong Tinh Phi)' 	);
		                                   
                                    
INSERT INTO 	KHUVUC 				(	MaKhuVuc,				TenKhuVuc		)
VALUES								(	KV001,					'Son La' 		),
									(	KV002,					'Dien Bien' 	),
									(	KV003,					'Ngu Hanh Son' 	),                                  
                                    (	KV004,					'Hai Chau' 		),
                                    (	KV005,					'Thanh Khe' 	);
                                    
                                    
                                    
INSERT INTO 	KHOANGTHOIGIAN 		(	MaKhoanThoiGianGiaoHang,			MoTa			)
VALUES								(	TG001,								'7H-9H AM' 		),
									(	TG002,								'9H-11H AM' 	),
									(	TG003,								'1H-3H PM' 		),                                  
                                    (	TG004,								'3H-5H PM' 		),
                                    (	TG005,								'7H-9.30H PM' 	); 	                                   
                                    
                                    






































