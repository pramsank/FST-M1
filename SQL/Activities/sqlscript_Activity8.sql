REM   Script: Activity8_contd_Pramila
REM   sample

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders ORDER BY order_date ASC;

select * from orders ORDER BY purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount < 500;

select * from orders ORDER BY order_date ASC;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Paris';

SELECT DISTINCT salesman_city FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city=El Pasol WHERE salesman_name='Paul Adam';

UPDATE salesman SET salesman_city='El Pasol' WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

select * from salesman ORDER BY salesman_id DESC;

select * from salesman ORDER BY salesman_city, commission, salesman_name;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders ORDER BY order_date ASC;

select * from orders ORDER BY purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount < 500;

select * from orders ORDER BY order_date ASC;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Paris';

SELECT DISTINCT salesman_city FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city=El Pasol WHERE salesman_name='Paul Adam';

UPDATE salesman SET salesman_city='El Pasol' WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

select * from salesman ORDER BY salesman_id DESC;

select * from salesman ORDER BY salesman_city, commission, salesman_name;

select distinct salesman_id from orders;

select sum(purchase_amount) from orders;

select AVG(purchase_amount) from orders;

select MAX(purchase_amount) from orders;

select MIN(purchase_amount) from orders;

select count (distinct salesman_id) from orders;

select count (distinct salesman_id) from orders;

select count (distinct salesman_id) from orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders ORDER BY order_date ASC;

select * from orders ORDER BY purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount < 500;

select * from orders ORDER BY order_date ASC;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Paris';

SELECT DISTINCT salesman_city FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city=El Pasol WHERE salesman_name='Paul Adam';

UPDATE salesman SET salesman_city='El Pasol' WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

select * from salesman ORDER BY salesman_id DESC;

select * from salesman ORDER BY salesman_city, commission, salesman_name;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders ORDER BY order_date ASC;

select * from orders ORDER BY purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders where purchase_amount < 500;

select * from orders ORDER BY order_date ASC;

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

DESCRIBE salesman


CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city(20), commission int);

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(20), commission int);

DESCRIBE salesman


INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_city='Paris';

SELECT DISTINCT salesman_city FROM salesman;

SELECT * FROM salesman;

SELECT * FROM salesman;

UPDATE salesman SET salesman_city=El Pasol WHERE salesman_name='Paul Adam';

UPDATE salesman SET salesman_city='El Pasol' WHERE salesman_name='Paul Adam';

SELECT * FROM salesman;

select * from salesman ORDER BY salesman_id DESC;

select * from salesman ORDER BY salesman_city, commission, salesman_name;

select distinct salesman_id from orders;

select sum(purchase_amount) from orders;

select AVG(purchase_amount) from orders;

select MAX(purchase_amount) from orders;

select MIN(purchase_amount) from orders;

select count (distinct salesman_id) from orders;

select count (distinct salesman_id) from orders;

select count (distinct salesman_id) as  'total count of salesman' from orders;

select count (distinct salesman_id) AS "total count of salesman" FROM orders;

DESCRIBE ORDERS


select customer_id, purchase_amount from orders group by customer_id;

select customer_id, max(purchase_amount) from orders group by customer_id;

select customer_id, purchase_amount from orders;

select customer_id, max(purchase_amount) from orders group by customer_id;

select customer_id, max(purchase_amount) from orders group by customer_id order by customer_id;

select customer_id, max(purchase_amount) from orders group by customer_id;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_DATE;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_DATE ASC, ORDER_NO ASC;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_DATE, ORDER_NO;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_DATE ASC, ORDER_NO ASC;

select count (distinct salesman_id) AS "total count of salesman" FROM orders 
 
-- see table columns 
DESCRIBE ORDERS 
 
--find highest purchase amount ordered by each customer with their id and highest purchase amount 
select customer_id, max(purchase_amount) from orders group by customer_id 
 
--find highest purchase amount ordered by each customer with their id and highest purchase amount and sorted ascending on customer id 
select customer_id, max(purchase_amount) from orders group by customer_id order by customer_id;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_DATE ASC, ORDER_NO DESC;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS ORDER BY ORDER_NO DESC, ORDER_DATE ASC;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
GROUP BY ORDER_DATE 
ORDER BY ORDER_NO DESC, ORDER_DATE ASC;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE asc, order_no desc;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE asc, order_no asc;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE desc, order_no asc;

SELECT ORDER_NO, ORDER_DATE  
FROM ORDERS  
ORDER BY ORDER_DATE desc, order_no asc 
group by order_date;

select sum(purchase_amount) from orders;

select AVG(purchase_amount) from orders 
 
--get max purchase amount of all orders 
select MAX(purchase_amount) from orders;

select AVG(purchase_amount) from orders;

select MAX(purchase_amount) from orders;

select customer_id, order_date, max(purchase_amount) from orders where order_date='2012-08-17', 'YYYY/mm/dd') group by customer_id;

select avg(purchase_amount) from orders;

select salesman_id, max(purchase_amount) where order_date=("2012-08-17", "YYYY/MM/DD") group by salesman_id, order_date;

select salesman_id, max(purchase_amount)  
    from orders 
    where order_date = '2012-08-17';

select salesman_id, max(purchase_amount)  
    from orders 
    where order_date = '2012-08-17' 
    group by salesman_id;

select customer_id, max(purchase_amount)  
    from orders 
    where order_date = '2012-08-17' 
    group by customer_id;

DESCRIBE ORDERS


select * from orders;

select * from orders  where order_date = '2012-08-17';

select * from orders;

select * from orders where order_date = '17-Aug-12';

select salesman_id, max(purchase_amount)  
    from orders 
    where order_date = '17-Aug-12' 
    group by salesman_id;

select salesman_id, max(purchase_amount) as 'Max Amount' 
    from orders 
    where order_date = '17-Aug-12' 
    group by salesman_id;

select salesman_id, max(purchase_amount) as "Max Amount" 
    from orders 
    where order_date = '17-Aug-12' 
    group by salesman_id;

select salesman_id, order_date, max(purchase_amount) as "Max Purchase Amount" 
    from orders 
    having max(purchase_amount) in (2030, 5760, 6000);

select salesman_id, order_date, max(purchase_amount) as "Max Purchase Amount" 
    FROM orders 
    HAVING MAX(PURCHASE_AMOUNT) IN(2030, 5760, 6000);

select salesman_id, order_date, max(purchase_amount) as "Max Purchase Amount" 
    FROM orders 
    GROUP BY saleman_id, order_date 
    HAVING MAX(PURCHASE_AMOUNT) IN(2030, 5760, 6000);

select salesman_id, order_date, max(purchase_amount) as "Max Purchase Amount" 
    FROM orders 
    GROUP BY salesman_id, order_date 
    HAVING MAX(PURCHASE_AMOUNT) IN(2030, 5760, 6000);

