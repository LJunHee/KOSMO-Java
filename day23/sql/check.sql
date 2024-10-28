create table lec05(
num number primary key,
name varchar2(6) not null,
gender char(1) check (gender in ('m','w'))
);