Drop Database if Exists Library;

Create Database Library;

Use Library;

create table fineA
(memb_no int(4),
acc_no int(4),
idate date,
rdate date,
adate date,
fineamt double(8,2));

create table lib
(acc_no int(4) primary key,
btitle varchar(30) not null,
author1 varchar(30),
author2 varchar(30),
pub_id int(4),
price float(7),
pdate date,
pages int(4),
edition int(4),
status char(1));

create table login
(ID varchar(20),
Password varchar(20));

create table member
(memb_no int(4) primary key,
memb_name varchar(30),
memb_add varchar(40),
memb_phone varchar(10),
mdate date,
medate date,
mfee double(8,2),
mem_status char(1),
mem_issue char(1));

insert into member values(1,"Nikhil","Burari",9910496189,"2011-01-01","2012-01-01",1000,"Y","Y");
insert into member values(2,"Shrey","Kaushik",9971810230,"2011-01-01","2010-01-01",900,"Y","Y");
insert into member values(3,"Shubham","Amrit vihar",8897002905,"2011-01-01","2011-01-01",1100,"Y","Y");
insert into member values(4,"Deepankar","Nathupura",8744081449,"2011-01-01","2013-01-01",1300,"Y","Y");


create table Missue
(acc_no int(4),
memb_no int(4),
idate date,
rdate date);

create table publisher
(pub_id int(4) primary key not null,
pub_name varchar(30) not null,
pub_address varchar(40), 
pub_phone1 varchar(12),
pub_phone2 varchar(12),
status char(1));

insert into publisher values(1,"Unique publisher","Noida",9845623889,8734238979,"Y");
insert into publisher values(2,"Global ltd","Rohini",9844503889,8731208979,"Y");
insert into publisher values(3,"Press","Faridabad",9845623489,8751238979,"Y");

create table Tissue
(acc_no int(4),
memb_no int(4),
idate date,
rdate date);

insert into login values("JMPS","1234");
