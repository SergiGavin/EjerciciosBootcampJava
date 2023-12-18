CREATE DATABASE bbddNegocio;
use bbddNegocio;

CREATE TABLE SALESMAN(
idSalesman INTEGER PRIMARY KEY AUTO_INCREMENT,
nameSalesman VARCHAR(30),
nameCity VARCHAR(15),
comision DECIMAL(5,2)
);
CREATE TABLE CUSTOMER(
idCustomer INTEGER PRIMARY KEY AUTO_INCREMENT,
nameCustomer VARCHAR(30),
city VARCHAR(15),
grade INTEGER
);
CREATE TABLE ORDERS(
idOrder INTEGER PRIMARY KEY AUTO_INCREMENT,
purch_amt DECIMAL(8,2),
fecha DATE,
FK_ID_COSTUMER INTEGER,
FOREIGN KEY (FK_ID_COSTUMER) REFERENCES bbddNegocio.CUSTOMER(idCustomer),
FK_ID_SALESMAN INTEGER,
FOREIGN KEY (FK_ID_SALESMAN) REFERENCES bbddNegocio.SALESMAN(idSalesman)
);

INSERT INTO SALESMAN VALUES
(NULL, 'Sergi', 'Sabadell', 7.2),
(NULL, 'Carlos', 'Barcelona', 5.1),
(NULL, 'Mari Angeles','Barcelona', 5.8),
(NULL, 'David','León', 8.1),
(NULL, 'Lorena','Valladolid', 8.4),
(NULL, 'Rubén','Valladolid', 7.1),
(NULL, 'Angela','Zaragoza', 5.7),
(NULL, 'Jose Luis','Cerdanyola', 6.0),
(NULL, 'Sheila','Barberà', 9.0),
(NULL, 'Cristian','Terrassa', 4.0);

INSERT INTO CUSTOMER VALUES
(NULL, 'Juan', 'Barcelona', 7),
(NULL, 'Maria', 'Madrid', 5),
(NULL, 'Laura','Valencia', 5),
(NULL, 'Carlos','Sevilla', 8),
(NULL, 'Ana','Malaga', 8),
(NULL, 'David','Bilbao', 7),
(NULL, 'Patricia','Zaragoza', 5),
(NULL, 'Luis','Valladolid', 6),
(NULL, 'Sofia','Granada', 9),
(NULL, 'Javier','Murcia', 4);

INSERT INTO ORDERS VALUES
(NULL, 8.0,'2023-10-02',4,6),
(NULL, '6.0','2023-10-04',9,3),
(NULL, '10.0','2023-10-09',2,7),
(NULL, '17.0','2023-10-12',8,1),
(NULL, '4.0','2023-10-05',10,5),
(NULL, '9.0','2023-10-01',6,9),
(NULL, '2.0','2023-10-15',3,4),
(NULL, '3.0','2023-10-16',7,2),
(NULL, '22.0','2023-10-19',1,8),
(NULL, '17.0','2023-10-18',5,10);

-- Contar registro de orders
SELECT COUNT(*) FROM orders;
-- Customers con nombres distintos
SELECT DISTINCT nameCustomer FROM customer; 
-- Orden de salesman por ventas
SELECT * FROM salesman INNER JOIN ORDERS ON idSalesman = FK_ID_SALESMAN order by purch_amt desc;
-- Primeros 5 customers
SELECT * FROM customer order by idCustomer asc limit 5;
-- Registro mas bajo de purch_amt de cada uno 
SELECT nameSalesman, min(purch_amt) as vendaMenor FROM salesman INNER JOIN ORDERS ON idSalesman = FK_ID_SALESMAN group by nameSalesman order by vendaMenor;
-- Registro mas alto de purch_amt
SELECT nameSalesman, max(purch_amt) as vendaMayor FROM salesman INNER JOIN ORDERS ON idSalesman = FK_ID_SALESMAN group by nameSalesman order by vendaMayor;



