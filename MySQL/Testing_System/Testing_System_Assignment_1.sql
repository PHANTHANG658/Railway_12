DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

CREATE TABLE Department (
	DepartmentID 			INT,
	DepartmentName 			VARCHAR(50)
);

CREATE TABLE `Position` (
	PositionID 				INT,
	PositionName 			VARCHAR (50)
);

CREATE TABLE `Account`(
acccountid INT,
email VARCHAR(100),
username VARCHAR(50),
fullname VARCHAR(50),
departmentID INT,
positionID INT,
createdate DATE
);

CREATE TABLE `Group` (
GroupID INT,
GroupName VARCHAR (100),
CreatorID INT,
CreateDate DATE
);
CREATE TABLE GroupAccount (
GroupID INT,
AccountID INT,
JoinDate DATE
);
CREATE TABLE TypeQuestion ( TypeID VARCHAR(100) );
CREATE TABLE CategoryQuestion (
CategoryID VARCHAR(100),
CategoryName VARCHAR(100)
);
CREATE  TABLE Question (
QuestionID INT(100),
Content VARCHAR (100),
TypeID INT,
CreatorID INT,
CreateDate DATE 
);
CREATE TABLE Answer (
ExamID INT,
`Code` INT,
Title VARCHAR(50),
CategoryID INT,
Duration TIME,
CreatorID INT,
CreateDate DATETIME 
);
CREATE TABLE  ExamQuestion
(
ExamID INT,
QuestionID INT );




