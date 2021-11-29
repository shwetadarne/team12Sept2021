use cdacmumbai2021;
create table employee(emp_id int(10),e_name varchar(20),sal float(20),dept_no int(10), job char(10), mgr int(10));
select * from employee;
insert into employee(emp_id,e_name,sal,dept_no,job,mgr)values(1,'arun',8000,1,'M',4),
(2,'ali',7000,1,'C',1),
(3,'kiran',3000,1,'C',1),
(4,'jack',9000,2,'M',null),
(5,'thomson',8000,2,'C',4);
select sum(sal) from employee where dept_no=1;
select dept_no,sum(sal) from employee  group by dept_no;
select sum(sal) from employee  group by dept_no;
select dept_no,min(sal) from employee  group by dept_no;
select dept_no,count(*) from employee  group by dept_no;
select dept_no,sum(sal) from employee where sal>7000 group by dept_no;
select dept_no,job,sum(sal) from employee  group by dept_no,job;
select dept_no,job,sum(sal) from employee  group by job,dept_no;
select dept_no,sum(sal),job,mgr from employee  group by dept_no,job,mgr;


create table Dept(dept_no int(20), dname varchar(20), loc char(20));
insert into Dept(dept_no,dname,loc) values(1,'TRA','BBY'),
(2,'EXP','DH'),
(3,'MKTG','CAL');
select * from Dept;

create table employee(emp_id int(10),e_name varchar(20),sal float(20),dept_no int(10), job char(10), mgr int(10));
select * from employee;
insert into employee(emp_id,e_name,sal,dept_no,job,mgr)values(1,'arun',8000,1,'M',4),
(2,'ali',7000,1,'C',1),
(3,'kiran',3000,1,'C',1),
(4,'jack',9000,2,'M',null),
(5,'thomson',8000,2,'C',4);
select sum(sal) from employee where dept_no=1;
select dept_no,sum(sal) from employee  group by dept_no;
select sum(sal) from employee  group by dept_no;
select dept_no,min(sal) from employee  group by dept_no;
select dept_no,count(*) from employee  group by dept_no;
select dept_no,sum(sal) from employee where sal>7000 group by dept_no;
select dept_no,job,sum(sal) from employee  group by dept_no,job;
select dept_no,sum(sal) from employee  group by dept_no,job,mgr;
create table employee(emp_id int(10),e_name varchar(20),sal float(20),dept_no int(10), job char(10), mgr int(10));
select * from employee;
insert into employee(emp_id,e_name,sal,dept_no,job,mgr)values(1,'arun',8000,1,'M',4),
(2,'ali',7000,1,'C',1),
(3,'kiran',3000,1,'C',1),
(4,'jack',9000,2,'M',null),
(5,'thomson',8000,2,'C',4);
select sum(sal) from employee where dept_no=1;
select dept_no,sum(sal) from employee  group by dept_no;
select sum(sal) from employee  group by dept_no;
select dept_no,min(sal) from employee  group by dept_no;
select dept_no,count(*) from employee  group by dept_no;
select dept_no,sum(sal) from employee where sal>7000 group by dept_no;
select dept_no,job,sum(sal) from employee  group by dept_no,job;
select dname,e_name from dept,employee where dept.dept_no=employee.dept_no;

select dname,e_name from employee,dept where dept.dept_no=employee.dept_no ;
select dname,e_name from employee,dept where dept.dept_no=employee.dept_no order by 1;
select dname,e_name,job,mgr from employee,dept where dept.dept_no=employee.dept_no order by 1 ;

select * from employee,dept where dept.dept_no=employee.dept_no order by 4;
select dname, dept_no,loc,e_name,emp_id from employee,dept where dept.dept_no=employee.dept_no ;

select dname,e_name from employee,dept where dept.dept_no=employee.dept_no ;
select dname,e_name,sum(sal) from employee,dept where dept.dept_no=employee.dept_no group by dname;

select upper(e_name),dname from employee,dept where dept.dept_no=employee.dept_no group by upper(e_name) having sum(sal)>1000 order by 1;

select * from dept;
select * from employee;
select * from dept,employee;
select dname,e_name from dept,employee where dept.dept_no=employee.dept_no;
select dname,e_name from dept,employee where dept.dept_no!=employee.dept_no;

select dname,e_name from dept left outer join employee on(dept.dept_no=employee.dept_no);
select dname,e_name from dept right outer join employee on(dept.dept_no=employee.dept_no);

select dname,e_name from employee left outer join dept on(dept.dept_no=employee.dept_no) union
select dname,e_name from employee right outer join dept on(dept.dept_no=employee.dept_no);
select * from dept;
select * from employee;


select dname,e_name from employee,dept;
select dname,e_name from dept,employee;
select dname,e_name,dept.dept_no from dept,employee;

select a.e_name, b.e_name from employee a,employee b where a.mgr=b.emp_id;


create table depthead (dept_no int(20),dhead varchar(20));
insert into depthead (dept_no,dhead) values(1,'arun'),
(2,'jack');
select * from depthead;
select e_name,dname,dhead from dept,employee,depthead 
/*
where depthead.dept_no=dept.dept_no and dept.dept_no=employee.dept_no;*/
where depthead.dept_no=dept.dept_no or dept.dept_no=employee.dept_no;
select * from depthead;
select * from dept;
select * from employee;

create table projects2(projno char(20), clientname varchar(20),proj_dtls varchar(20));
insert into projects2(projno,clientname,proj_dtls) values('p1', 'Deloitte','cgs'),
('p2','morgan_stantey','ams'),
('p3','dnp_paribas','macros_deg'),
('p4','icici_bank','pps'),
('p5','amfi','website_deg');
select * from projects2;

create table projects_emp2(projno char(10), emp_id int(10));
insert into projects_emp2(projno,emp_id)values('p1', 1),('p2',2),('p3',3),('p4',4),('p5',5);
select * from projects_emp2;
drop table projects_emp1;
select * from employee;

select clientname, proj_dtls,e_name from projects_emp2,employee,projects2 
where projects2.projno=projects_emp2.projno and employee.emp_id =projects_emp2.emp_id order by 1,2,3; 








 