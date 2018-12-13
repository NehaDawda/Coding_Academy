create table Products (
	product_id number(3),
	product_nm varchar2(20),
	product_desc varchar2(30),
	product_price number(8,2),
	product_qty number(8,2)
);

Drop table Products;

select * from Products;