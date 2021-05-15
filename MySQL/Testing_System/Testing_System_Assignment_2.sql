DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

CREATE TABLE Department (
DepartmentID TINYINT UNSIGNED PRIMARY KEY ,
DepartmentName VARCHAR(50) UNIQUE KEY NOT NULL
);

CREATE TABLE `Position` (
PositionID TINYINT UNSIGNED,
PositionName ENUM('DEV','TEST','Scrum Master','PM')
);

CREATE TABLE `Account`(
acccountid TINYINT UNSIGNED,
email VARCHAR(100) PRIMARY KEY,
username VARCHAR(50),
fullname VARCHAR(50),
departmentID TINYINT,
positionID TINYINT,
createdate DATE
);

CREATE TABLE `Group` (
GroupID TINYINT UNSIGNED,
GroupName VARCHAR (100),
CreatorID VARCHAR (100),
CreateDate DATE
);
CREATE TABLE GroupAccount (
GroupID TINYINT,
AccountID TINYINT,
JoinDate DATE
);
CREATE TABLE TypeQuestion ( TypeID VARCHAR(100) );
CREATE TABLE CategoryQuestion (
CategoryID TINYINT UNIQUE,
CategoryName VARCHAR(100)
);
CREATE  TABLE Question (
QuestionID TINYINT UNSIGNED UNIQUE,
Content VARCHAR (100),
TypeID VARCHAR (100),
CreatorID VARCHAR (100),
CreateDate DATE 
);
CREATE TABLE Answer (
ExamID VARCHAR(50),
`Code` TINYINT UNSIGNED,
Title VARCHAR(50),
CategoryID TINYINT UNSIGNED,
Duration TIME,
CreatorID INT,
reateDate DATETIME 
);
CREATE TABLE  ExamQuestion
(
ExamID TINYINT UNSIGNED,
QuestionID TINYINT UNSIGNED );