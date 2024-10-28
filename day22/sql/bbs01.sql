create table bbs01(
	num number,
	sub varchar2(30),
	id varchar2(15),
	nalja date,
	content varchar2(2000)
);
/
insert into bbs01 values(1,'test1' ,'tester','2022/12/01','test');
insert into bbs01 values(2,'test2' ,'tester','2023/01/01','test');
insert into bbs01 values(3,'test3' ,'tester','2023/12/31','test');
insert into bbs01 values(4,'test4' ,'tester','2024/01/01','test');
insert into bbs01 values(5,'test5' ,'tester',sysdate,'test');