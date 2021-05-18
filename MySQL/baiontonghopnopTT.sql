DROP DATABASE IF EXISTS fresher;
CREATE DATABASE fresher;
USE fresher;
DROP TABLE IF EXISTS Trainee;
CREATE TABLE  Trainee(
TraineeID INT UNSIGNED ,
Full_Name NVARCHAR(50) NOT NULL,
Birth_Date DATE,
 Gender VARCHAR(50),
 ET_IQ INT, -- NHON  HƠN 20
 ET_Gmath INT,-- NHO HƠN 20
ET_English INt, -- NHO HƠN 50
Training_Class NVARCHAR(50) ,
Evaluation_Notes NVARCHAR (50) NOT NULL 
);
       INSERT INTO Trainee(TraineeID ,Full_Name,Birth_Date, Gender, ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes)
VALUES( 1,'NGUYENDUCANH', '1996-06-01','MALE',10,10,40,'VT3','DHTN'),
       (2, 'NGUYENHOANGANHMINH', '1996-03-01','`UNKNOWN`', 19,18,30,'VT6','DHTN'),
       (3, 'PHAMTHULAN', '1998-01-02','MALE',16,16,29, 'VT5','DHTN'),
       (4, 'PHAMDUCTAN','1999-03-07','MALE',7,5,27,'VT6','DHTN'),
       (5,'TRANDUCANH','2000-03-05','FEMALE',11,17,28,'VT1','DHTN'),
       (6,'TRANCONGANH','2001-03-01','MALE',16,14,30,'VT1','DHTN'),
       (7, 'PHAMTHIHUONG','1996-01-02','FEMELE',15,14,13,'VT4','DHTN'),
       (8, 'NGUYENMINHDUC','1995-03-01', 'MALE',15,14,20,'VT5','DHTN'),
       (9, 'NGUYENHOANGANH','1992-12-10','MALE',20,20,30,'VT1','DHTN'),
       (10, 'NGUYENDUCTRI','1993-05-10','FEMALE',19,19,40,'VT1','DHTN');
       -- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
--  và sắp xếp theo ngày sinh. Điểm ET_IQ >=12, ET_Gmath>=12, ET_English>=2  
SELECT * FROM   Trainee WHERE   ET_IQ>=12 AND  ( ET_IQ>=12 AND ET_English>=20);
       --  CAU 5 LAY RA THUC TAP SINH BAT DAU BANG CHU N KET THUC BANG CHU C
       SELECT * FROM Trainee WHERE Full_Name LIKE 'N%C';
       -- CAU 6 LAY RA THONG TIN FULLNAME BAT DAU BANG CHU G
        SELECT * FROM Trainee WHERE Full_Name LIKE '_G%';
        -- LAY RA TEN DAI NHAT TRONG BANG
       SELECT * FROM Trainee WHERE length(Full_Name) = (SELECT MAX(length(Full_Name)) FROM Trainee);
       --  CAU  11 LAY RA ID CUA TEN DAI NHAT
       SELECT TraineeID FROM Trainee WHERE length(Full_Name) = (SELECT MAX(length(Full_Name)) FROM Trainee);
       -- CAU 12 : LAY RA TEN VA BANG DIEM cua ng co ki tu dai nhat
       SELECT  Full_Name,ET_IQ,ET_Gmath,ET_English FROM Trainee WHERE length(Full_Name) = (SELECT MAX(length(Full_Name)) FROM Trainee);
       -- CAU 13: lay ra 5 thuc tap sinh nho tuoi nhat
       SELECT  * FROM Trainee ORDER BY Birth_Date DESC LIMIT 5;
       -- CAU 14 : 
         SELECT * FROM   Trainee WHERE  ( ET_IQ+ET_Gmath>=20 AND ET_IQ>=8) AND  ( ET_Gmath>=8 AND ET_English>=18);
-- XOA HOC SNH CO ID=5
         DELETE FROM Trainee WHERE TraineeID=5;
-- CAU 16 
DELETE FROM Trainee  WHERE ET_IQ+ET_Gmath<=15;
-- CHUYEN HOC SINH CO ID = SANG LOP VT1
UPDATE Trainee 
SET  Training_Class = N'VT1'
WHERE TraineeID = 2;
-- CAU 19 
UPDATE Trainee
SET Full_Name= N'LE VAN A',
ET_IQ=10,
ET_Gmath=15,
ET_English=30
WHERE TraineeID=10;


       
       
       
