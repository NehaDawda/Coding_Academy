select * From VEHICLE_DETAILS3;
select * From USER_DETAILS3;

create table VEHICLE
(
VEHICLE_ID number(4),
VEHICLE_NAME varchar2(10)
);

insert into Vehical values(1111,'BMW');
insert into vehical vlaues(1112,'LANCER');

create table USER_DETAIL 
(
user_id number(4),
USER_NAME varchar2(10),
VEHICLE_ID number(4)
);

insert into User_Detail values(2,'Vijay',1111);


