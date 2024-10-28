emp38aemp35xeCREATE TABLE dept(
	deptno INT PRIMARY KEY AUTO_INCREMENT,
	dname VARCHAR(10),
	loc VARCHAR(5)
);

CREATE TABLE emp(
	sabun INT PRIMARY KEY AUTO_INCREMENT,
	ename VARCHAR(10) NOT NULL,
	mgr INT,
	pay INT DEFAULT 0,
	deptno INT NOT NULL REFERENCES dept(deptno)
);
INSERT INTO dept (dname,loc) VALUES ('본사','서울');
INSERT INTO dept (dname,loc) VALUES ('생산','대전');
INSERT INTO dept (dname,loc) VALUES ('영업','대구');
INSERT INTO dept (dname,loc) VALUES ('물류','부산');
COMMIT;
INSERT INTO emp(ename,mgr,pay,deptno) VALUES ('강말자',null,1000,1);
INSERT INTO emp(ename,mgr,pay,deptno) VALUES ('김개똥',1,1000,2);
INSERT INTO emp(ename,mgr,pay,deptno) VALUES ('이말년',1,1000,3);
INSERT INTO emp(ename,mgr,pay,deptno) VALUES ('박춘재',1,1000,4);
INSERT INTO emp(ename,mgr,pay,deptno) VALUES ('최춘자',2,1000,2);
COMMIT;

SELECT * FROM dept;
SELECT * FROM emp;


#SELECT empno,ename,pay,(SELECT danme FROM dept WHERE dept.deptno=emp.deptno) FROM emp;
SELECT a.sabun,a.ename, a.pay, b.dname FROM emp a INNER JOIN dept b ON a.deptno=b.deptno;

SELECT a.sabun,a.ename, a.pay, b.dname FROM emp a LEFT OUTER JOIN dept b ON a.deptno=b.deptno;

SELECT sabun,ename,mgr FROM emp;

SELECT a.sabun,a.ename,b.ename AS mgrname FROM emp a INNER JOIN emp b ON a.mgr=b.sabun;