CREATE DATABASE IF NOT EXISTS BBDD_ciudades;
USE BBDD_ciudades;

CREATE TABLE IF NOT EXISTS CIUDAD(
idCiudad INTEGER PRIMARY KEY AUTO_INCREMENT, 
nombreCiudad VARCHAR(50),
ultima_Act_Ciudad TIMESTAMP,
FK_ID_PAIS INTEGER,
FOREIGN KEY (FK_ID_PAIS) REFERENCES BBDD_ciudades.PAIS(idPais)
);

CREATE TABLE IF NOT EXISTS PAIS(
idPais INTEGER  PRIMARY KEY AUTO_INCREMENT, 
nombrePais VARCHAR(50),
ultima_Act_Pais TIMESTAMP
);

CREATE TABLE IF NOT EXISTS DIRECCION(
idDireccion INTEGER  PRIMARY KEY AUTO_INCREMENT, 
calle VARCHAR(50),
codigo_postal VARCHAR(10),
telefono VARCHAR(15),
localizacion VARCHAR(45),
ultima_Act_Direccion TIMESTAMP,
FK_ID_CIUDAD INTEGER,
FOREIGN KEY (FK_ID_CIUDAD) REFERENCES BBDD_ciudades.CIUDAD(idCiudad)
);

INSERT INTO PAIS (idPais, nombrePais, ultima_Act_Pais) VALUES
(NULL,'Estados Unidos','2023-10-19'),
(NULL,'Canadá','2023-10-18'),
(NULL,'Reino Unido','2023-10-17'),
(NULL,'Francia','2023-10-16'),
(NULL,'Alemania','2023-10-15'),
(NULL,'España','2023-10-11'),
(NULL,'Italia','2023-10-12'),
(NULL,'Japón','2023-10-14'),
(NULL,'China','2023-10-01'),
(NULL,'India','2023-10-11'),
(NULL,'Australia','2023-10-03'),
(NULL,'México','2023-09-30'),
(NULL,'Rusia','2023-09-29'),
(NULL,'Egipto','2023-10-15'),
(NULL,'Portugal','2023-10-11'),
(NULL,'Corea del Sur','2023-10-12'),
(NULL,'Corea del Norte','2023-05-01'),
(NULL,'Noruega','2023-10-13'),
(NULL,'Suecia','2023-10-18'),
(NULL,'Argentina','2023-10-11');

INSERT INTO CIUDAD (idCiudad, nombreCiudad, ultima_Act_Ciudad, FK_ID_PAIS) VALUES
(NULL,'Toronto','2023-10-08',2),
(NULL,'Sídney','2023-10-01',11),
(NULL,'París','2023-10-12',4),
(NULL,'Pekín','2023-10-01',9),
(NULL,'Nueva York','2023-10-09', 1),
(NULL,'Madrid','2023-10-10',6),
(NULL,'Estocolmo','2023-10-15',19),
(NULL,'Berlín','2023-10-11',5),
(NULL,'El Cairo','2023-10-13',14),
(NULL,'Tokio','2023-10-04',8),
(NULL,'Seúl','2023-10-09',16),
(NULL,'Bombay ','2023-10-10',10),
(NULL,'Pyongyang','2023-04-27',17),
(NULL,'Ciudad de México','2023-09-25',12),
(NULL,'Londres','2023-10-11',3),
(NULL,'Moscú','2023-09-22',13),
(NULL,' Buenos Aires','2023-10-07',20),
(NULL,'Lisboa','2023-10-08',15),
(NULL,'Roma','2023-10-02',7),
(NULL,'Oslo','2023-10-10',18);

INSERT INTO DIRECCION (idDireccion, calle, codigo_postal, telefono, localizacion, ultima_Act_Direccion, FK_ID_CIUDAD) VALUES
(NULL,'Queen Street','M5H2N2','+1 416-555-1234','Centro', '2023-10-02', 2),
(NULL,'George Street','2000', '+61 255556789','Este ','2023-10-04',11),
(NULL,'Champs-Élysées','75008','+33 112345678','Centro' ,'2023-10-10',4),
(NULL,'Wangfujing Street','100006', '+86 1098765432','Norte','2023-10-05',9),
(NULL,'Broadway','10007','+1 212-555-6789','Este','2023-10-09', 1),
(NULL,'Gran Vía','28013','+34 912345678','Centro','2023-10-11',6),
(NULL,'Drottninggatan','11151','+46 87654321','Norte','2023-10-15',19),
(NULL,'Unter den Linden','10117','+49 3087654321','Centro','2023-10-11',5),
(NULL,'Sharia Al Muizz','11511','+20 234567890','Norte','2023-10-13',14),
(NULL,'Takeshita Street', '150-0001','+81 312345678','Este','2023-10-04',8),
(NULL,'Gangnam-daero','06000','+82 212345678','Centro','2023-10-08',16),
(NULL,'Marine Drive','400020','+91 2223456789','Oeste','2023-10-10',10),
(NULL,'Juche Tower Road','---','+85 0212345678','Centro','2023-04-25',17),
(NULL,'Paseo de la Reforma','06000','+52 5512345678','Centro','2023-09-25',12),
(NULL,'Oxford Street','W1C 1JY','+44 2012345678','Este','2023-10-11',3),
(NULL,'Tverskaya Street','125009','+7 4951234567','Oeste','2023-09-22',13),
(NULL,'Avenida 9 de Julio','1002','+54 1112345678','Centro','2023-10-07',20),
(NULL,'Rua Augusta','1100-053','+351 212345678','Oeste','2023-10-08',15),
(NULL,'Via del Corso','00187','+39 0612345678','Centro','2023-10-02',7),
(NULL,'Karl Johans gate','0159','+47 22345678','Norte','2023-10-10',18);

SELECT * FROM Ciudad INNER JOIN Pais on FK_ID_PAIS = idPais INNER JOIN Direccion on idCiudad = FK_ID_CIUDAD;
