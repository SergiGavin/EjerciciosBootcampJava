CREATE DATABASE IF NOT EXISTS bbddEjAlbumes;
USE bbddEjAlbumes;

CREATE TABLE IF NOT EXISTS Genero(
idGenero INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
genero VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS Album(
idAlbum INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
albumName VARCHAR(255),
dateReleased DATETIME
);
CREATE TABLE IF NOT EXISTS Artista(
idArtista INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
artistaName VARCHAR(255)
);
INSERT INTO bbddEjAlbumes.Genero VALUES
(NULL,'ROCK'),
(NULL,'POP'),
(NULL,'REG'),
(NULL,'TRAP'),
(NULL,'RAP'),
(NULL,'FLAMENCO'),
(NULL,'METAL'),
(NULL,'OPERA'),
(NULL,'BSO'),
(NULL,'VARIOS');

INSERT INTO bbddEjAlbumes.Album VALUES
(NULL,'VERANO 2010','2010-6-07'),
(NULL,'VERANO 2011','2011-6-18'),
(NULL,'VERANO 2012','2012-07-22'),
(NULL,'VERANO 2013','2013-06-11'),
(NULL,'VERANO 2014','2014-08-09'),
(NULL,'VERANO 2015','2015-06-22'),
(NULL,'VERANO 2016','2016-07-17'),
(NULL,'VERANO 2017','2017-08-01'),
(NULL,'VERANO 2018','2018-08-04'),
(NULL,'VERANO 2019','2019-8-03');


INSERT INTO bbddEjAlbumes.Artista VALUES
(NULL,'Eminem'),
(NULL,'Bad Bunny'),
(NULL,'Rosalia'),
(NULL,'Rauw Alejandro'),
(NULL,'Ozuna'),
(NULL,'Melendi'),
(NULL,'Estopa'),
(NULL,'Beret'),
(NULL,'Duki'),
(NULL,'J Balvin');

