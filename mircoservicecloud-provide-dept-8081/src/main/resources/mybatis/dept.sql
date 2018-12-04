DROP TABLE IF EXISTS cloudDB01;
CREATE DATABASE cloudDB01 CHARSET SET UTF8;
USE cloudDB01;
CREATE TABLE dept
(
	deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dname VARCHAR(60),
	db_source VARCHAR(60)
);
#DATABASE()-插入当前数据库的名字
INSERT INTO dept(dname,db_source) VALUE ('开发部', DATABASE());
INSERT INTO dept(dname,db_source) VALUE ('人事部', DATABASE());
INSERT INTO dept(dname,db_source) VALUE ('财务部', DATABASE());
INSERT INTO dept(dname,db_source) VALUE ('市场部', DATABASE());
INSERT INTO dept(dname,db_source) VALUE ('运维部', DATABASE());

SELECT * from dept;