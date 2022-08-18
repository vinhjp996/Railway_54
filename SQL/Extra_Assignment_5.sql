




































/*Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
của ProductSubcategory là 'Saddles'.
Hướng dẫn:
Sử dụng Sub Query để lấy ra tất cả các ID của ProductSubcategory có name =
'Saddles'.
Sau đó trong outer query, sử dụng kết quả từ Sub Query để lấy ra yêu cầu của đề bài.
Kết quả sẽ như sau:
Name
-----------------------------
LL Mountain Seat/Saddle
ML Mountain Seat/Saddle
HL Mountain Seat/Saddle
LL Road Seat/Saddle
ML Road Seat/Saddle
HL Road Seat/Saddle
LL Touring Seat/Saddle
ML Touring Seat/Saddle
HL Touring Seat/Saddle
(9 row(s) affected)
Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
Hướng dẫn:
Mệnh đề WHERE trong subquery sẽ sử dụng ký tự wildcard ‘Bo%’ .
Kết quả sẽ như sau:
Name
----------------------------
Water Bottle - 30 oz.
Mountain Bottle Cage
Road Bottle Cage
LL Bottom Bracket
ML Bottom Bracket
HL Bottom Bracket*/