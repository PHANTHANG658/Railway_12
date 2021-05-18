DROP DATABASE IF EXISTS fresher;
CREATE DATABASE fresher;
USE fresher;
CREATE TABLE  Trainee(
TraineeID INT UNSIGNED NOT NULL,
Full_Name NVARCHAR(50) NOT NULL,
Birth_Date DATE,
 Gender ENUM('MALE','FEMALE','`UNKNOWN`') UNIQUE,
 ET_IQ INT, -- NHON  HƠN 20
ET_Gmath INT,-- NHO HƠN 20
ET_English INt, -- NHO HƠN 50
Training_Class NVARCHAR(50) NOT NULL,
Evaluation_Notes NVARCHAR (50) NOT NULL );
INSERT INTO Trainee ( TraineeID,Full_Name,Birth_Date,Birth_Date, Gender, ET_IQ,ET_Gmath,ET_English,Training_Class,Evaluation_Notes)
VALUES( 1,'NGUYENDUCANH', '1996-06-01','MALE',10,10,40,'VT3','DHTN'),
       (2, 'NGUYENHOANGANH', '1996-03-01','`UNKNOWN`', 19,18,30,'VT6','DHTN'),
       (3, 'PHAMTHULAN', '1996-01-02','MALE',15,15,29, 'VT5','DHTN'),
       (4, 'PHAMDUCTAN','1996-03-07','MALE',19,18,27,'VT6','DHTN'),
       (5,'TRANDUCANH','1996-03-05','FEMALE',17,17,28,'VT1','DHTN'),
       (6,'TRANCONGANH','1996-03-01','MALE',16,14,30,'VT1','DHTN'),
       (7, 'PHAMTHIHUONG','1996-01-02','FEMELE',15,14,13,'VT4','DHTN');
       
       




