select * from emp;
create view v1
as
select empno,ename from emp;
select * from cdacmumbai2021.v1;
desc v1;
insert into cdacmumbai2021.v1 values(10,'shweta');
select * from v1;
select * from cdacmumbai2021.v2;
create view v2 as
select empno,ename from emp;
select upper(ename),sal*12 annual from emp;
select * from v2; 


create table tempp ( fit int,sec varchar(50));
delimiter //
create procedure abc1()
begin
declare x int;
set x=10;
insert into tempp values (1,'hello');
end ;//
delimiter ;
call abc1();
select * from tempp;
drop procedure abc1;

-- perimeter and area of rectangle /////////////
use cdacmumbai2021;
create table rectangle(peri float(20),area float(20));
delimiter //
create procedure abc3()
begin
declare L float default 10 ;
declare W float  default 5;
declare p float(20);
 declare A float(20);
 set p= 2*(L+W);
set A= L*W;
insert into rectangle values(p,A);
end; //
delimiter ;
call  abc3();
select * from rectangle;
commit;

--practice/////////////////
delimiter //
create procedure abc2()
begin
declare x int default 10;
insert into tempp values(x,'shweta');
end; //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;--

--parctice//////////
delimiter //
create procedure abc2()
begin
declare x char(15) default 'KING';
declare y float default 33443;
declare z float default 0.04;
declare hra float;
 set  hra = y*z;
insert into tempp values( y,x);
insert into tempp values(hra,'HRA');
end ; //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;--

--practice //////////
delimiter //
create procedure abc2(x char(15),y float, z float)
begin
declare hra float;
set hra=y*z;
insert into tempp values(y,x);
insert into tempp values(hra,'HRA');
end ;//
delimiter ;
call abc2('by',223,566);
select * from tempp;
drop procedure abc2;
show procedure status where name like 'A%';


select * from emp;
--ractice/////////
delimiter //
create procedure abc2()
begin
declare x int;
select sal into x from emp where ename='E';
insert into tempp values(x,'you can do it');
end ; //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

--practice /////////////
delimiter //
create procedure abc2( ch char(20))
begin
declare y int;
select sal into y from emp where ename =ch;
insert into tempp values(y,ch);
end ;//
delimiter ;
call abc2('B');
select * from tempp;
drop procedure abc2;

--practice/////
delimiter //
create procedure abc2()
begin
declare x int ;
declare y int;
select sal, empno into x,y from emp where ename='D';
insert into tempp values(y, 'diya');
end ;//
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

--practice////// decision making statement/////
delimiter //
create procedure abc2()
begin
declare x int ;
declare y int ;
select sal, empno into x,y from emp where ename='D';
if x>5000 then
insert into tempp values(y,'money');
end if;
end; //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

--if else////////////
delimiter //
create procedure abc2()
begin
declare x int ;
declare y int ;
select sal, empno into x,y from emp where ename='D';
if x>5000 then
insert into tempp values(y,'money');
else
insert into tempp values(y,'honey');
end if;
end; //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

-- nested if else//////////
delimiter //
create procedure abc2()
begin
declare x int;
declare y int;
select sal,deptno into x, y from emp where ename='E';
if x>6000 then
insert into tempp values(y,'high sal');
elseif x<6000 then
insert into tempp values(y,'low sal');
else 
insert into tempp values(y,'medium sal');
end if;
end ;//
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

--boolean variavle///////////
delimiter //
create procedure abc2()
begin
declare  x boolean default true;
if x then
insert into tempp values(11,'duri');
end if ;
end //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

--while loop////////////
delimiter //
create procedure abc2()
begin
declare x int default 1;
while x<5 do
insert into tempp values(x,'while loop');
 set x=x+1;
end while;
end //
delimiter ;
call abc2;
select * from tempp;
drop procedure abc2;

-- esting of while////////////
delimiter //
create procedure abc2(z int)
begin
declare x int default 1;
declare y int default 1;
while x<5 do
while y<5 do
insert into tempp values(y,'while of y');
set y=y+1;
end while;
insert into tempp values(x,'while of x');
set x=x+1;
end while;
end //
delimiter ;
call abc2(3);
select * from tempp;
drop procedure abc2;

--do while loop OR  repeat loop///////
delimiter //
create procedure abc2()
begin
declare x int default 1; 
repeat
insert into tempp values(x,'anjali');
set x=x+1;
until x<3 
end repeat ;
end //
delimiter ;
call abc2();
select * from tempp;
drop procedure abc2;

--loops//iterator,loops,leave////////
delimiter //
create procedure abc2()
begin
declare x int default 1;
pqr_loop:loop
if x>10 then
leave pqr_loop;
end if;
set x=x+1;
if mod(x,2)!=0 then
iterate pqr_loop;
else
insert into tempp values(x,'inside loop');
end if;
end  loop; 
end ; //
delimiter ;
call  abc2;
select * from tempp;
drop procedure abc2;

--cursors///////////important
delimiter //
create procedure abc2()
begin
declare a int;
declare b varchar(50);
declare c int;
declare d int;
declare y int default 0;
declare z int;
declare c1 cursor for select * from emp;
select count(*) into z from emp;
open c1;
 while y<z do
 fetch c1 into a,b,c,d;
 insert into tempp values(a,b);
 set y=y+1;
 end while;
 close c1;
 end ; //
 delimiter ;
 call abc2;
 select * from tempp;
drop procedure abc2;

-- continue handler///////////////////
delimiter //
create procedure abc2()
begin
declare a int;
declare b varchar(50);
declare c int;
declare d int;
declare y int default 0;
declare z int;
declare c1 cursor for select * from emp;
 declare   continue handler for not found set y=1; 
open c1;
 cursor_loop:loop
 fetch c1 into a,b,c,d;
 if y=1 then
 leave cursor_loop;
 end if;
 insert into tempp values(a,b);
 end  loop cursor_loop;
 set y=y+1;
 close c1;
 end ; //
 delimiter ;
 call abc2;
 select * from tempp;
drop procedure abc2;

