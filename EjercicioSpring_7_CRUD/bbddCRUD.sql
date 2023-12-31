DROP DATABASE IF EXISTS db_test;
CREATE DATABASE IF NOT EXISTS db_test;

USE DB_TEST;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,    
    fechaNacimiento DATE
);

INSERT INTO users(nombre, apellidos, fechaNacimiento) values ('David', 'Bernal', '1991-02-13');
INSERT INTO users(nombre, apellidos, fechaNacimiento) values ('Alejandro', 'Fernandez', '1991-02-13');
INSERT INTO users(nombre, apellidos, fechaNacimiento) values ('Matias', 'Coronado', '1991-02-13');

SELECT * FROM users;