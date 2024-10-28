create table lec06(
num number primary key,
name varchar2(6) not null,
age number(2) check (age between 1 and 80)
);