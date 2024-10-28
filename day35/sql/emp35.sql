## 주석
CREATE TABLE emp35 (
	empno INT NOT NULL AUTO_INCREMENT,
	ename VARCHAR(50) NULL DEFAULT NULL,
	pay INT NULL,
	hiredate TIMESTAMP NULL DEFAULT NULL,
	PRIMARY KEY (empno)
)COLLATE= 'utf8mb4_general_ci';

#dummy
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user1',1000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user2',2000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user3',3000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user4',4000,NOW());
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user5',5000,NOW());
COMMIT;
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user30',5000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user31',1000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user32',5000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user33',3000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user34',5000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user35',5000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user36',2000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user37',5000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user38',2000,'1999/12/31');
INSERT INTO emp35 (ename,pay,hiredate) VALUES ('user39',4000,'1999/12/31');
ROLLBACK;
SELECT * FROM (SELECT * FROM emp35 ORDER BY empno DESC) a LIMIT 10 OFFSET 0;
SELECT * FROM (SELECT * FROM emp35 ORDER BY empno DESC) a LIMIT 10 OFFSET 10;
SELECT * FROM emp35 LIMIT 10 OFFSET 20;
