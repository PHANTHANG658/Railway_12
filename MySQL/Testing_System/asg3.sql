USE TestingSystem3;
-- LAY RA PHONG BAN CO TEN SALE
SELECT DepartmetID FROM Departmet WHERE DaparmentName='SALE';
-- LAY RA TEN GROUP HOAT DONG TRC NGAY 20-12-2019
 SELECT GroupName FROM   `group` WHERE CreateDate <'2019-12-20';
-- LAY RA CAC MA DE THI LƠN HƠN 60 VA TAO RA TRC NGAY 20/12/2019
SELECT CategoryID FROM `exam` WHERE Duration>60 AND CreateDate < '2019-12-2019';
-- GROUP TAO RA GAN Nhat 
SELECT  GroupName FROM `group ` ORDER BY CreateDate LIMIT 5;
-- DEM SO NHAN VIEN THUOC BANG tID CÓ ID=2
SELECT count(DepartmentID) FROM Departmen WHERE DepartmentID=2;
-- LAY RA NHAN VIEN BAT DAU BANG CHU D KET THUC BANG CHU O
  SELECT FullName FROM 	`accoun` WHERE  FullName LIKE 'D%O'; 
  -- XOA TAT CA CAC EXAM TAO TRC NGAY 20-12-2019
  DELETE  FROM exam WHERE  CreateDate<'2019-12-20';
 -- UPDAATE ACCOUNT COS ID=5  THANH NGUYEN BA LOC VA EMAL THANH LOCNGUYEN@GMAIL.COM
 UPDATE `Acconunt` 
 SET FullName =N'NGUYEN BA LOC',
    Email='locnguyen@gmail.com'
    WHERE AccountID=5;
    --  ACCOUNT COS ID-5 SE THUOC GR 4
    UPDATE `GroupAccount` 
    SET  AccountID=5
    WHERE GroupID=4;
    
    
   
  
  
  
  






--


