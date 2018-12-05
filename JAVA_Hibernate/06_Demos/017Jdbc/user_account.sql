drop table myuser;
create table myuser
(
	username varchar2(20),
	password varchar2(20)
);

insert into myuser values('111','111');
insert into myuser values('123','123');

drop table Account;
create table Account( 
	accno number(6) not null, 
	name varchar2(20),
	balance number(8,2)
);

insert into Account values('111','Brijesh',1000);
insert into Account values('222','Smita',2000);