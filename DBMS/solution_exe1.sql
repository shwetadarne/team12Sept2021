-- DROP TABLE IF EXISTS `customers`;
create TABLE customers1 (
customer_Id int(11) NOT NULL,
First_Name varchar(50) NOT NULL,
Last_Name varchar(50) NOT NULL,
phone varchar(50) NOT NULL,
creditLimit decimal(10,2) DEFAULT NULL,
PRIMARY KEY (`customer_Id`)
);
insert into customers1(customer_Id,First_Name,Last_Name,phone,creditLimit)
values
(103,'Atelier','Schmitt','08-7896
6578','21000.00'),(112,'Signal','King','7025551838','71800.00'),
(114,'Ferguson','Peter','03-9520 4555','117300.00'),(119,'Labrune','Janine
','40.67.8555','118200.00'),
(121,'Bergulfsen','Jonas ','07-98
9555','81700.00'),(124,'Nelson','Susan','4155551450','210500.00'),
(125,'Piestrzeniewicz','Zbyszek ','(26) 642-7555','0.00'),(128,'Keitel','Roland','+49 69
66 90 2555','59700.00'),
(129,'Murphy','Julie','6505555787','64600.00'),
(141,'Freyre','Diego ','(91) 555 94 44','227600.00'),(144,'Berglund','Christina
','0921-12 3555','53100.00'),
(145,'Petersen','Jytte ','31 12 3555','83400.00'),(146,'Saveley','Mary
','78.32.5555','123900.00'),
(148,'Eric','Jecob','+65 221
7555','103800.00'),(151,'Young','Jeff','2125557413','138500.00');
select * from customers1;
use cdacmumbai2021;
-- DROP TABLE IF EXISTS `orders`;
CREATE TABLE orders1(
order_Id int(11) NOT NULL,
order_Date date NOT NULL,
shipped_Date date DEFAULT NULL,
Deliver varchar(15) NOT NULL,
customer_Id int(11) NOT NULL,
PRIMARY KEY (order_Id),
FOREIGN KEY (customer_Id) REFERENCES customers1(customer_Id)
);
insert into orders1(order_Id,order_Date,shipped_Date,Deliver,customer_Id) values
(10100,'2003-01-06','2003-01-13','Shipped',114),(10101,'2003-01-09','2003-01-18','Sh
ipped',125),
(10102,'2003-01-10','2003-01-18','Shipped',129),(10103,'2003-01-29','2003-02-07','Sh
ipped',121),
(10104,'2003-01-31','2003-02-09','Shipped',141),(10105,'2003-02-11','2003-02-21','Sh
ipped',145);
select * from orders1;


-- 1. Write a Query to add a column package_stat to the table orders1.

alter table  orders1 add column package_stat varchar(50);

-- 2. Write a Query to change the package_stat column of orders table with 'not available'
-- for all orders.

 update orders1 set package_stat='not available';
desc orders1;

-- 3. Write a Query to delete a row from customers table where credit_limit is 0.00
-- Write SELECT statements to achieve the following:
 delete  from customers1 where creditLimit =0.00;
 delete from orders1 where customer_Id=125;
select * from orders1;
select * from customers1;
rollback;


-- 1. Write a Query to display the first_name with the occurrence of ‘el’ in the customers
-- tables.

-- select first_name from customers1 where First_Name='el';
select  First_Name  from customers1 where First_Name like '%el%';

-- 2. Write a Query to prepare a list with customer name ,customer_id ,order_id for the
-- customers whose delivery status is shipped.
select first_name,last_name,customers1.customer_Id,order_id from customers1,orders1;
                     

-- 3. Write a Query to get the number of customers with the creditLimit greater than 50000.

select  count(customer_id) from customers1 where creditLimit> 50000;

-- 4. Write a Query to display the customer_id, name ( first name and last name ), order_id
-- and deliver for all customers.
select customers1.customer_Id ,first_name,last_name,order_id from customers1,orders1;

-- 5. Write a Query to customer name in order of creditLimit smallest to highest.
select first_name,last_name from customers1 order by creditLimit;

-- 6. Write a stored procedure by name order_day. The procedure should show the
-- customer_id and the day on which he had made the order

create table cus_day(customer_id int, day_d varchar(50));
delimiter //
create procedure order_day()
begin
declare a int;
declare b date;
declare y int default 0;
declare c1 cursor for select customer_id,order_date from orders1;
declare continue handler for not found set y=1;
open c1;
cursor_c1:loop
fetch c1 into a,b;
if y=1 then
leave cursor_c1;
end if;
insert into cus_day values(a,b);
end loop cursor_c1;
close c1;
end; //
delimiter ;
call order_day();
select * from cus_day;
 


-- 7. Write a stored function by the name of cutomer_search. The stored function should
-- return the maximum creditLimit made by any customer.
   create table F(credit_l decimal);
   delimiter //
   create function customer_search()
   returns decimal
   deterministic 
   begin
   declare p decimal;
     set p= max(creditlimit) from customers1;
    returns p
   
   
   end ; //
   delimiter ;
   
   delimiter //
   create procedure abc2( )
   begin 
   declare x decimal;
   set x= costomer_search();
   insert into F values(x);
   end; //
   delimiter ;
   call abc2();
   select * from F;
       
   
#####################################################################
-- 1. Create DEPT table with the following structure:-
create table DEPT1(
DEPTNO INT(2),
DNAME VARCHAR (14),
LOC VARCHAR (13));
-- Insert the following rows in DEPT table:-
insert into DEPT1 values(10, 'ACCOUNTING', 'NEW YORK'),
(20,' RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');
-- 2. Create EMP table with the following structure:-
create table EMP11(
EMPNO INT(4),
ENAME VARCHAR (10),
JOB VARCHAR (9),
HIREDATE DATE,
SAL FLOAT(7,2),
COMM FLOAT(7,2),
DEPTNO INT(2));
-- Insert the following rows in EMP table:-
insert into EMP11 values(7369, 'SMITH', 'CLERK', '80-10-17', 800, null, 20),
(7499, 'ALLEN', 'SALESMAN', '81-10-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', '81-02-22', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', '81-04-02', 2975, null, 20),
(7654, 'MARTIN', 'SALESMAN', '81-09-28', 1250,  null, 30),
(7698, 'BLAKE', 'MANAGER', '81-05-01', 2850, null, 30),
(7782, 'CLARK', 'MANAGER', '81-01-09', 2450, null, 10),
(7788, 'SCOTT', 'ANALYST', '82-12-09', 3000, null, 20),
(7839, 'KING', 'PRESIDENT', '81-11-17', 5000, null, 10),
(7844, 'TURNER', 'SALESMAN', '81-08-08', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', '83-01-12', 1100, null, 20),
(7900, 'JAMES', 'CLERK', '81-12-03', 950, null, 30),
(7902, 'FORD', 'ANALYST', '81-12-03', 3000, null, 20),
(7934, 'MILLER', 'CLERK', '82-01-23', 1300, null, 10);
-- Write SELECT statements to achieve the following:-
-- 1. Display only the EMPNO and ENAME columns from EMP table.

select empno,ename from emp11;

-- 2. Display all employees who are CLERKs and the MANAGERs.
-- select * from emp11 where job='clerk' or job='manager';

select * from emp11 where job in ('clerk','manager');

-- 3. Display the ENAME and JOB for all employees who belong to the same DEPTNO as
-- employee ‘KING’.
select ename, job  from emp11 where deptno=10;

-- 4. Find the names of all employees hired in the month of February (of any year).

    select ename from emp11 where month(hiredate)=2;
    
-- 5. Display the employees in descending order of DEPTNO.
    
    select * from emp11 order by deptno desc;
    
    
-- 6. Display the employee name and employee number of the employees with the
-- headings as NUMBER and NAME.
select ename as NAME ,empno as NUMBER   from emp11 ;

-- 7. Find the names of all employees who were hired on the last day of the month.
select ename  from emp11 where  day(hiredate)=31 or day(hiredate)=30  or day(hiredate)=29 ;
insert into emp11(ename,hiredate)values ('shweta','1980-02-29');

/*-- 8. Find the name of the employee who is receiving the maximum salary.*/
select ename ,max(sal) from emp11; 


-- 9. Display the sum of SAL for all the employees belonging to DEPTNO 10.

select sum(sal) from emp11 where deptno=10;

-- 10. Display the rows where JOB column ends with the letter ‘T’.

select * from emp11 where job like '%T';

-- 11Write a stored procedure to convert a temperature in Fahrenheit (F) to its equivalent in
-- Celsius (C). The required formula is:- C= (F-32)*5/9
-- Insert the temperature in Centigrade into TEMPP table. Calling program for the stored
-- procedure need not be written.

select * from tempp;
delimiter //
create procedure abc2(f float)
begin
declare c float;
set c= (f-32)*5/9;
insert into tempp values(c, 'celcius');
end ; //
delimiter ;
call abc2(3345.5);
select * from tempp;
drop procedure abc2;


-- 12. Write a stored function by the name of Num_cube. The stored function should return the
-- cube of a number ‘N’. The number ‘N’ should be passed to the stored function as a
-- parameter. Calling program for the stored function need not be written*/

delimiter //
create function Num_cube( n int)
returns int
deterministic
begin
return n*n*n;
end ; //
delimiter ;

delimiter //
create procedure abc2(n int)
begin
declare x int;
set x=Num_cube(n);
insert into tempp values(x,'cube of number');
end ; //
delimiter ;
call abc2(2);
select * from tempp;
delete from tempp;
drop procedure abc2;










