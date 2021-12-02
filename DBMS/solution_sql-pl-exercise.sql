use cdacmumbai2021;
-- square and cube of number//////
 /*2. Write a program that declares an integer variable called num, assigns a value to it, 
and computes and inserts into the tempp table the value of the variable itself, its 
square, and its cube.*/

create table s_cube(squre int(20), cube_s int(40));
delimiter //
create procedure abc2()
begin 
declare x int default 2;
declare s int;
declare c int;
set s=x*x;
set c=x*x*x;
insert into s_cube values(s,c);
end ;//
delimiter ;
call abc2;

select * from s_cube;

drop procedure abc2;

/*Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice 
versa. The required formulae are:- C= (F-32)*5/9 
F= 9/5*C + 32*/
delimiter //
create procedure abc2(T int )
begin 
declare c int;
declare f int;
set f=9/5*T+32;
set c=(f-32)*5/9;
insert into tempp values(f,'fahrehneit');
insert into tempp values(c,'celsius');
end ; //
delimiter ;
call abc2(109);
select * from tempp;
drop procedure abc2;
drop table temperature;

 /*4. Convert a number of inches into yards, feet, and inches. For example, 124 inches 
equals 3 yards, 1 foot, and 4 inches. */

delimiter //
create procedure abc2(Inc int)
begin
declare yd int ;
declare ft int;
declare d int;
set d=mod(Inc,36);
 set yd=Inc/36;
 set Inc=mod(d,12);
 set ft=d/12;
 insert into tempp values(yd,'yards');
 insert into tempp values(ft,'foots');
 insert into tempp values(Inc,'inches');
 end ; //
 delimiter ;
 call abc2(124);
 select * from tempp;
 drop procedure abc2;
/*
5. Write a program that enables a user to input an integer. The program should then 
state whether the integer is evenly divisible by 5 . */
delimiter //
create procedure abc2(I int)
begin
if mod(I,5)=0 then
insert into tempp values(I,'TRUE');
end if;
end ; //
delimiter ;
call abc2(55);
select * from tempp;
drop procedure abc2;
 
/* 6. Your block should read in two real numbers and tell whether the product of the two 
numbers is equal to or greater than 100.*/

delimiter //
create procedure abc2(G int)
begin
if G>100 then
insert into tempp values(G,'Greater than 100');
elseif G=100 then
insert into tempp values(G,'Equal to 100');
end if;
end ; //
delimiter ;
call abc2(100);
select * from tempp;
drop procedure abc2;









