USE TestingSystem3;


   SELECT q.questionID ,q.content FROM q question  
    INNER JOIN answer a  ON a.questionID=q.questionID;
 SELECT * FROM answer a  inner join question q on a.questionID=q.questionID;

 SELECT q.Questionname , q.content from examquestion e inner join question q on  e.QuestionID= q.QuestionID GROUP BY e.QuestionID HAVING
COUNT(e.QuestionID) =(SELECT max( countquestion) from (SELECT count(*)  AS countquestion from examquestion group by questionID) as maxcount);
--  1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT * FROM `Account`  a JOIN Department b ON a.DepartmentID = b.DepartmentID;
-- 2:Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT  *  FROM `Account` WHERE CreateDate >'2020-12-20';
--  3 Viết lệnh để lấy ra tất cả các developer
SELECT * FROM `Account`  a JOIN position c ON a.PositionID=c.PositionID WHERE c.PositionName='DEV';
-- 4. LAY RA TAT CA CAC PHONG BAN LON HON 3 NHAN VIEN
SELECT b.DepartmentID,b.DepartmentName ,COUNT(a.DepartmentID) as 'so nhan vien'  FROM `Account`  a JOIN Department b ON a.DepartmentID = b.DepartmentID
GROUP BY  a.DepartmentID HAVING count(a.DepartmentID)>3;
-- 5 lay ra danh sach cau hoi thi trong nhieu de thi  hat
SELECT * FROM  examquestion e INNER JOIN question q ON a.ExamID =eq.ExamID ;
SELECT questionID,count(*) from examquestion group by questionID;
SELECT max( countquestion) from (SELECT count(*)  AS countquestion from examquestion group by questionID) as maxcount;
-- 6 thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT e.CategoryID  as 'so luong' FROM e.exam 
 LEFT JOIN q.question ON e.ExamID=ex.ExamID;
--  Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT * FROM q.QuestionID JOIN examquestion eq  ON q.QuestionID=eq.QuestionID 
GROUP BY q.QuestionID;
-- Lấy ra Question có nhiều câu trả lời nhất
--  9: Thống kê số lượng account trong mỗi group
SELECT		g.GroupID, COUNT(ga.AccountID) AS 'SO LUONG' FROM  `Account` ga JOIN 	`Group` G ON	ga.GroupID = G.GroupID
GROUP BY	g.GroupID ORDER BY	g.GroupID ASC;
-- cau 5 danh sach de thi co nhieu cau hoi nhat
 SELECT q.Questionname , q.content from examquestion e inner join question q on  e.QuestionID= q.QuestionID
 GROUP BY e.QuestionID HAVING
COUNT(e.QuestionID) =(SELECT max( countquestion) from (SELECT count(*)  AS countquestion from examquestion group by questionID) as maxcount);
-- tim nhan vien co it chuc vu nhat
-- b1 -- tim so chuc vu it nhat 
SELECT min(countPositionID) from (select count(*) as countPositionID from `account` group by PositionID) mincount;
SELECT p.PositionName FROM `Account` a INNER JOIN `position` p ON  a.PositionID=p.PositionID  GROUP BY  a.PositionID 
 HAVING COUNT(a.PositionID) 
=(SELECT min(countPositionID) from (select count(*) as countPositionID from `account` group by PositionID) as mincount);
-- lay ra question co nhieu cau tr loi nhat 
-- cau 8 lay ra question co nhieu cau tra loi nhat
-- b1 tim ra question co nhieu cau tra loi nhat "
 -- tim max cau tra loi nhieu nhat 
  SELECT * FROM answer a  inner join question q on a.questionID=q.questionID;
  --  CAU 8:max question id cua bang ansewr
  SELECT max(countquestionID)
	FROM (select count(*) AS countquestionID FROM answer group by questionID ) as maxquestion;
    SELECT q.questionID ,q.content, count(a.questionID) FROM a answer 
    INNER JOIN question q ON a.questionID=q.questionID
    GROUP BY a.questionID 
    HAVING count(a.questionID)= (SELECT max(countquestionID)
	FROM (select count(*) AS countquestionID FROM answer group by questionID ) as maxquestion);
    -- lay ra so luong cua tung ban 
SELECT d.departmentID , d. departmentname , p.positionName , 
count(p.position) as sl from `account` a inner join department d on a.department = d.departmentid 
inner join  position p on a.position = p.positionid 
group by a.departmentid, a.positonid;
-- 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì,
SELECT 		t.TypeName, q.CreatorID , q.Content , a.Content , q.CreateDate 
FROM		Question q
INNER JOIN 	Answer a ON	q.QuestionID = a.QuestionID
INNER JOIN	TypeQuestion t ON q.TypeID = t.TypeID;
-- 13  Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT  t.TypeName , conunt(q.TypeID) as' dem sl'
FROM question q INNER JOIN tyquestion t 
ON q.TypeID = t.TypeID
GROUP BY q.TypeID;
-- 14:Lấy ra group không có account nào
SELECT AccountID FROM  `Group` g
LEFT JOIN GroupAccount GA ON g. GroupID= GA.GroupID
WHERE GA.AccountID IS NULL;
--  16 Lấy ra question không có answer nào
SELECT * FROM question q 
LEFT JOIN answer a 
ON q.questionID=a.questionID 
WHERE a.questionID IS NULL;






--



