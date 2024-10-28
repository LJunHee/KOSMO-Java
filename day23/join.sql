create table dept11(
deptno number,
loc varchar2(6)
);

create table emp11(
empno number,
name varchar2(6),
deptno number
);

insert into dept11 values (1,'서울');
insert into dept11 values (2,'대전');
insert into dept11 values (3,'대구');

insert into emp11 values (1111,'user1', 1);
insert into emp11 values (2222,'user2', 2);
insert into emp11 values (4444,'user4', 4);
commit;