drop database if exists bank;
create database bank;
use bank;
create table 신한(계좌번호 char(16),계좌주 varchar(10),입금액 bigint, 마일리지 bigint);
create table 국민(계좌번호 char(16),계좌주 varchar(10),입금액 bigint, 랜덤쿠폰 varchar(10));
create table 농협(계좌번호 char(16),계좌주 varchar(10),입금액 bigint, 포인트 bigint);
select *from 신한;
select *from 국민;
select *from 농협;