select ename,
	case
	when deptno=10 then 'accounting' 
	when deptno=20 then 'research'
	when deptno=30 then 'sales'
	when deptno=40 then 'operations'
	end
from emp;
