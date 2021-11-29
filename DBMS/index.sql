create table emp(empno smallint(10),ename char(10), sal float(20), deptno smallint(10));
select* from emp;
insert into emp(empno,ename,sal,deptno)values(5,'A',5000,1),
(4,'A',6000,1),
(1,'C',7000,1),
(2,'D',9000,2),
(3,'E',8000,2);

  create index ind_empno on emp(empno);
  select * from emp where empno =1;
  
  
  create index ind_empno on emp(ename);
  select * from emp ;
  create index ind_empno on emp(ename);
  select * from emp where ename  is null;
  
  create index ind_empno on emp(ename);
  select * from emp where ename ='D' or sal>500;
  
  create index ind_empno on emp(dept_no,emp_no);
  select * from emp where deptno =1 or empno=1;
  select * from emp;
  
select * from dept;
alter table dept rename column dept_no to deptno;

create index ind_dep  on  emp(deptno);
create index ind_dep  on  dept(deptno);
select dname,ename from 
show index from emp;