create table dept02(
idx number primary key,
loc varchar2(6) not null
);

create table emp02(
sabun number primary key,
name varchar2(6) not null,
idx number references dept02(idx)
);
