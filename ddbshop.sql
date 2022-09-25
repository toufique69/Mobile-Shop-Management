CREATE TABLE ADMIN_INFO
(
AdminId number(10) NOT NULL PRIMARY KEY,
AdminName varchar2(50) NOT NULL,
UserName varchar2(50) NOT NULL,
UserPass varchar2(50) NOT NULL CHECK (REGEXP_LIKE (UserPass,'[a-z][0-9]{3}')),
Gender varchar2(50) NOT NULL CHECK(Gender in ('Male','Female')),
Designation varchar2(50) NOT NULL,
PhoneNo varchar2(11) NOT NULL CHECK(REGEXP_LIKE(PHONENO,'[0-9]{11}')),
Address varchar2(50) NOT NULL,
Salary Number(30) NOT NULL,
JoinDate varchar2(50)
);

----TRIGGER----
CREATE SEQUENCE A_ID_SEQ
  MINVALUE 100
  MAXVALUE 999999999999999999999999999
  START WITH 100
  INCREMENT BY 1
  CACHE 50;

CREATE OR REPLACE TRIGGER ID_TRIGGER
BEFORE INSERT ON ADMIN_INFO
FOR EACH ROW
BEGIN
  SELECT A_ID_SEQ.NEXTVAL
  INTO   :new.AdminId
  FROM   dual;
END;
=============================================================================================
=============================================================================================
=============================================================================================
=============================================================================================
CREATE TABLE EMPLOYEE_INFO
(
EmployeeId number(10) NOT NULL PRIMARY KEY,
EmployeeName varchar2(50) NOT NULL,
UserName varchar2(50) NOT NULL,
UserPass varchar2(50) NOT NULL CHECK (REGEXP_LIKE (UserPass,'[a-z][0-9]{3}')),
Gender varchar2(50) NOT NULL CHECK(Gender in ('Male','Female')),
Designation varchar2(50) NOT NULL,
PhoneNo varchar2(11) NOT NULL CHECK(REGEXP_LIKE(PHONENO,'[0-9]{11}')),
Address varchar2(50) NOT NULL,
Salary Number(30) NOT NULL,
JoinDate varchar2(50)
);

----TRIGGER----
CREATE SEQUENCE E_ID_SEQ
  MINVALUE 200
  MAXVALUE 999999999999999999999999999
  START WITH 200
  INCREMENT BY 1
  CACHE 50;

CREATE OR REPLACE TRIGGER EMP_ID_TRIGGER
BEFORE INSERT ON EMPLOYEE_INFO
FOR EACH ROW
BEGIN
  SELECT E_ID_SEQ.NEXTVAL
  INTO   :new.EmployeeId
  FROM   dual;
END;
=============================================================================================
=============================================================================================
=============================================================================================
=============================================================================================
CREATE TABLE CATEGORY_INFO
(
CategoryId number(10) NOT NULL PRIMARY KEY,
CategoryName varchar2(50) NOT NULL
);

----PROCEDUR----
CREATE PROCEDURE insert_into_category(c_id in number,c_name in varchar2) AS
BEGIN
INSERT INTO CATEGORY_INFO (CategoryId,CategoryName) 
values(c_id,c_name);
END;

----FUNCTION----
create or replace function get_category(c_name varchar2) return SYS_REFCURSOR AS
my_cursor SYS_REFCURSOR;
BEGIN
	open my_cursor for  select CategoryId,CategoryName from CATEGORY_INFO ORDER BY CategoryId;
	return my_cursor;
END;
=============================================================================================
=============================================================================================
=============================================================================================
=============================================================================================
CREATE TABLE DEALER_INFO
(
DealerId number(10) NOT NULL PRIMARY KEY,
DealerName varchar2(50) NOT NULL,
DealerAddress varchar2(50),
DealerPhone nchar(11) NOT NULL
)

----TRIGGER----
CREATE SEQUENCE DEALER_ID_SEQ
  MINVALUE 500
  MAXVALUE 999999999999999999999999999
  START WITH 500
  INCREMENT BY 1
  CACHE 50;

CREATE OR REPLACE TRIGGER DEALER_ID_TRIGGER
BEFORE INSERT ON DEALER_INFO
FOR EACH ROW
BEGIN
  SELECT DEALER_ID_SEQ.NEXTVAL
  INTO   :new.DealerId
  FROM   dual;
END;

----FUNCTION----
create or replace function get_dealer(d_name varchar2) return SYS_REFCURSOR AS
my_cursor SYS_REFCURSOR;
BEGIN
	open my_cursor for  select DealerId,DealerName,DealerAddress,DealerPhone from DEALER_INFO ORDER BY DealerId;
	return my_cursor;
END;
=============================================================================================
=============================================================================================
=============================================================================================
=============================================================================================
CREATE TABLE PRODUCT_INFO
(
ProductId number(20) NOT NULL,
EntryDate varchar2(50) NOT NULL,
DealerName varchar2(50) NOT NULL,
Brand varchar2(50) NOT NULL,
Model varchar2(50) NOT NULL,
CategoryName varchar2(50) NOT NULL,
Description varchar2(500),
ManufactureDate DATE NOT NULL,
Price number(10) NOT NULL,
Availble varchar2(50) NOT NULL CHECK(Availble in ('Yes','No')),
Quantity number(10) NOT NULL,
PRIMARY KEY (ProductId)
);

----TRIGGER----
CREATE OR REPLACE TRIGGER PRODUCT_ManufactureDate_CHECK
  BEFORE INSERT OR UPDATE ON PRODUCT_INFO
  FOR EACH ROW
BEGIN
  IF( :new.ManufactureDate < date '2005-01-01' or 
      :new.ManufactureDate > sysdate )
  THEN
    RAISE_APPLICATION_ERROR( 
      -20001, 
      'Manufacture Date must be later than Jan 1, 2005 and earlier than today' );
  END IF;
END;

----PROCEDURE----
CREATE PROCEDURE insert_into_PRODUCT_INFO(p_id in number,e_date in varchar2,d_name in varchar2,br in varchar2, md in varchar2, c_name in varchar2, 
des in varchar2, m_date in date, price in number, av in varchar2, quan in number) AS
BEGIN
INSERT INTO PRODUCT_INFO (ProductId,EntryDate,DealerName,Brand,Model,CategoryName,Description,ManufactureDate,Price,Availble,Quantity) 
values(p_id,e_date,d_name,br,md,c_name,des,m_date,price,av,quan);
END;
=============================================================================================
=============================================================================================
=============================================================================================
=============================================================================================
CREATE TABLE ORDER_INFO
(
OrderId NUMBER(10) NOT NULL PRIMARY KEY,
OrderDate VARCHAR2(20) NOT NULL,
CustomerName VARCHAR2(20) NOT NULL,
PhoneNo VARCHAR2(20) NOT NULL,
ProductId number(20) NOT NULL,
Brand varchar2(50) NOT NULL,
Model varchar2(50) NOT NULL,
CategoryName varchar2(50) NOT NULL,
Price number(10) NOT NULL,
PurchaseQuantity number(10) NOT NULL,
FinalAmount number(10) NOT NULL
);

----TRIGGER----
CREATE SEQUENCE ORDER_ID_SEQ
  MINVALUE 1000
  MAXVALUE 999999999999999999999999999
  START WITH 1000
  INCREMENT BY 1
  CACHE 50;

CREATE OR REPLACE TRIGGER ORDER_ID_TRIGGER
BEFORE INSERT ON ORDER_INFO
FOR EACH ROW
BEGIN
  SELECT ORDER_ID_SEQ.NEXTVAL
  INTO   :new.OrderId
  FROM   dual;
END;














