USE 	TestingSystem3;
DROP  PROCEDURE IF EXISTS get_DepartmentName_by_id;
DELIMITER $$
CREATE PROCEDURE get_DepartmentName_by_id(IN in_id smallint  ) 
BEGIN 
		SELECT * FROM department WHERE   departmentID =in_id ;  
END $$ 
DELIMITER ; 
call get_DepartmentName_by_id;

-- 1 Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

DROP  PROCEDURE IF EXISTS  get_account_BY_DepartmentName;
DELIMITER $$
CREATE PROCEDURE
 get_account_BY_DepartmentName(IN in_departmentName  VARCHAR(50)) 
BEGIN 
		SELECT a.*, d.departmentname  FROM `Account`a JOIN department d 
        ON a.departmentID= d.departmentID
        WHERE   d.departmentName  =in_departmentname;  
END $$ 
DELIMITER ; 
call get_account_BY_DepartmentName('SALE'); 

-- 2 Tạo store để in ra số lượng account trong mỗi group
DROP  PROCEDURE IF EXISTS  get_SL_Account_By_Group;
DELIMITER $$
CREATE PROCEDURE
get_SL_Account_By_Group() 
BEGIN 
		SELECT groupID,(SELECT groupName FROM `Group` WHERE groupID=ga.groupID) AS GROUP_NAME, 
        COUNT(*) AS SL FROM  groupaccount ga 
		GROUP BY groupID; 
END $$ 
DELIMITER ; 
call get_SL_Account_By_Group; 

-- 3 Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại

-- 4 Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP  PROCEDURE IF EXISTS  get_typeID_by_max_question;
DELIMITER $$
CREATE PROCEDURE
get_typeID_by_max_question(OUT out_typeID mediumint ) 
BEGIN 
		SELECT 	typeID  		INTO out_typeID  	
        FROM 	question 		GROUP BY typeID HAVING COUNT(*)= 
		(SELECT MAX(SL)			FROM 
								(SELECT COUNT(*) AS SL FROM  question GROUP BY typeID) AS COUNT_SL) ; 
END $$ 
DELIMITER ;
SET 	@gid=0;  
call 	get_typeID_by_max_question(@gid);  
SELECT 	@gid; 

-- 5 Sử dụng store ở question 4 để tìm ra tên của type question
SELECT 	typeName FROM typequestion WHERE typeID=@gid; 




