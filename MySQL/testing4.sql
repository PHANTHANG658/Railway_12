USE TestingSystem3;
--  1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT * FROM `Account`  a JOIN Department b ON a.DepartmentID = b.DepartmentID;
-- 2:Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT  *  FROM `Account` WHERE CreateDate >'2020-12-20';
--  3 Viết lệnh để lấy ra tất cả các developer
SELECT * FROM `Account`  a JOIN position c ON a.PositionID=c.PositionID WHERE c.PositionName='DEV';
-- 4. LAY RA TAT CA CAC PHONG BAN LON HON 3 NHAN VIEN
SELECT b.DepartmentID,b.DepartmentName ,COUNT(a.DepartmentID) as 'so nhan vien'  FROM `Account`  a JOIN Department b ON a.DepartmentID = b.DepartmentID
GROUP BY  a.DepartmentID HAVING count(a.DepartmentID)>3;
-- 6 thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT e.CategoryID  as 'so luong' FROM e.xam JOIN q.question ON e.ExamID=ex.ExamID;
--  Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT * FROM q.QuestionID JOIN examquestion eq  ON q.QuestionID=eq.QuestionID 
GROUP BY q.QuestionID;
-- Lấy ra Question có nhiều câu trả lời nhất
			
--  9: Thống kê số lượng account trong mỗi group
SELECT		g.GroupID, COUNT(ga.AccountID) AS 'SO LUONG' FROM GroupAccount ga JOIN 	`Group` G ON	ga.GroupID = G.GroupID
GROUP BY	g.GroupID ORDER BY	g.GroupID ASC;



--



