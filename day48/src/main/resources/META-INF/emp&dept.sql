DROP TABLE IF EXISTS emp;
CREATE TABLE emp(
empno number PRIMARY KEY auto_increment,
ename VARCHAR(10) not null,
pay number default 0,
hiredate date
);
DROP TABLE IF EXISTS dept;
CREATE TABLE dept(
deptno INT PRIMARY KEY,
ename VARCHAR(10) not null,
loc varchar(10) not null
);