select * from emp_per_hierachy;

DROP TABLE EMPLOYEE_HQL;
CREATE TABLE EMPLOYEE_HQL (
  emp_id number(11) ,
  emp_name varchar2(20) NOT NULL,
  emp_salary number(10,0) NOT NULL,
  CONSTRAINT pk_emp_hql PRIMARY KEY (emp_id)
);
 
CREATE TABLE ADDRESS_HQL (
  emp_id number(11),
  address_line1 varchar2(50) NOT NULL ,
  zipcode varchar2(10),
  city varchar2(20) ,
  CONSTRAINT pk_emp_hql2 PRIMARY KEY (emp_id),
  CONSTRAINT fk_emp_hql FOREIGN KEY (emp_id) REFERENCES EMPLOYEE_HQL (emp_id)
);
 
INSERT INTO EMPLOYEE_HQL (emp_id, emp_name, emp_salary)
VALUES	(1, 'Smita', 100);
INSERT INTO EMPLOYEE_HQL (emp_id, emp_name, emp_salary)
VALUES		(2, 'Diya', 200);
INSERT INTO EMPLOYEE_HQL (emp_id, emp_name, emp_salary)
VALUES		(3, 'Lisa', 300);
INSERT INTO EMPLOYEE_HQL (emp_id, emp_name, emp_salary)
VALUES		(4, 'Jack', 400);


INSERT INTO ADDRESS_HQL (emp_id, address_line1, zipcode, city)
VALUES
	(1, 'Albany Dr', '95129', 'San Jose');
INSERT INTO ADDRESS_HQL (emp_id, address_line1, zipcode, city)
VALUES	(2, 'Arques Ave', '95051', 'Santa Clara');
INSERT INTO ADDRESS_HQL (emp_id, address_line1, zipcode, city)
VALUES	(3, 'BTM 1st Stage', '560100', 'Bangalore');
INSERT INTO ADDRESS_HQL (emp_id, address_line1, zipcode, city)
VALUES	(4, 'City Centre', '100100', 'New Delhi');
	
commit;
