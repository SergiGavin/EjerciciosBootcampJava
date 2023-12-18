DROP DATABASE IF EXISTS cine;
CREATE DATABASE IF NOT EXISTS cine;
USE CINE;
CREATE TABLE IF NOT EXISTS Peliculas(
id_pelicula INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
titulo_pelicula VARCHAR(100),
year_pelicula INTEGER,
imagen_url VARCHAR(255),
certificado VARCHAR(45),
duracion INTEGER,
imdb_rating FLOAT,
descripcion TEXT,
metascore INTEGER,
votos INTEGER,
ingresos INTEGER
);
CREATE TABLE IF NOT EXISTS Directores(
id_director INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
name_director VARCHAR(45) UNIQUE,
sobre_el TEXT
);
CREATE TABLE IF NOT EXISTS peliculas_directores(
pelicula_id INTEGER UNSIGNED,
director_id INTEGER UNSIGNED,
PRIMARY KEY (pelicula_id, director_id),
FOREIGN KEY (pelicula_id) REFERENCES Peliculas(id_pelicula) ON DELETE CASCADE,
FOREIGN KEY (director_id) REFERENCES Directores(id_director)ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS Actores(
id_actor INTEGER  UNSIGNED PRIMARY KEY AUTO_INCREMENT,
name_actor VARCHAR(45),
sobre_el TEXT
);
CREATE TABLE IF NOT EXISTS peliculas_actores(
pelicula_id INTEGER UNSIGNED,
actor_id INTEGER UNSIGNED,
PRIMARY KEY (pelicula_id,actor_id),
FOREIGN KEY (pelicula_id) REFERENCES Peliculas(id_pelicula) ON DELETE CASCADE,
FOREIGN KEY (actor_id) REFERENCES Actores(id_actor) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS Genero(
id_genero INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
name_genero VARCHAR(45)
);
CREATE TABLE IF NOT EXISTS peliculas_generos(
pelicula_id INTEGER UNSIGNED,
genero_id INTEGER UNSIGNED,
PRIMARY KEY(pelicula_id, genero_id),
FOREIGN KEY (pelicula_id) REFERENCES Peliculas(id_pelicula) ON DELETE CASCADE,
FOREIGN KEY (genero_id) REFERENCES Genero(id_genero) ON DELETE CASCADE
);

INSERT INTO Peliculas (titulo_pelicula, year_pelicula, imagen_url, certificado, duracion, imdb_rating, descripcion, metascore, votos, ingresos)
VALUES
('The Shawshank Redemption', 1994, 'https://example.com/shawshank.jpg', 'R', 142, 9.3, 'Un hombre inocente en la prisión', 80, 250000, 300000000),
('The Godfather', 1972, 'https://example.com/godfather.jpg', 'R', 175, 9.2, 'La saga de una familia mafiosa en Nueva York', 100, 300000, 245000000),
('Pulp Fiction', 1994, 'https://example.com/pulpfiction.jpg', 'R', 154, 8.9, 'Historias interconectadas en Los Ángeles', 94, 270000, 213000000),
('The Dark Knight', 2008, 'https://example.com/darkknight.jpg', 'PG-13', 152, 9.0, 'Batman se enfrenta al Joker en Gotham', 84, 430000, 1004558444),
('The Lord of the Rings: The Return of the King', 2003, 'https://example.com/lotr.jpg', 'PG-13', 201, 8.9, 'La batalla final por la Tierra Media', 94, 550000, 1119746039),
('Schindler''s List', 1993, 'https://example.com/schindlerslist.jpg', 'R', 195, 8.9, 'Un empresario salva vidas durante el Holocausto', 93, 220000, 321365567),
('Forrest Gump', 1994, 'https://example.com/forrestgump.jpg', 'PG-13', 142, 8.8, 'La vida de Forrest Gump', 82, 320000, 678000000),
('The Matrix', 1999, 'https://example.com/matrix.jpg', 'R', 136, 8.7, 'Neo se convierte en el Elegido en un mundo simulado', 73, 220000, 463517383),
('Avatar', 2009, 'https://example.com/avatar.jpg', 'PG-13', 162, 7.8, 'Exploradores humanos en el planeta Pandora', 83, 250000, 278796508),
('Fight Club', 1999, 'https://example.com/fightclub.jpg', 'R', 139, 8.8, 'Un club secreto para liberar la agresión', 66, 270000, 100853753);

INSERT INTO Directores (name_director, sobre_el)
VALUES
('Frank Darabont', 'Frank Darabont es un director, productor y guionista estadounidense. Es conocido por dirigir "The Shawshank Redemption" y "The Green Mile". Ha recibido elogios por su trabajo en películas de drama y adaptaciones de Stephen King.'),
('Francis Ford Coppola', 'Francis Ford Coppola es un director, productor y guionista estadounidense. Es famoso por dirigir "The Godfather" y "Apocalypse Now". Ha tenido una carrera influyente en la industria del cine.'),
('Quentin Tarantino', 'Quentin Tarantino es un director, productor y guionista estadounidense. Es conocido por películas como "Pulp Fiction" y "Kill Bill". Su estilo distintivo y diálogos memorables son señas de identidad de sus obras.'),
('Christopher Nolan', 'Christopher Nolan es un director, productor y guionista británico. Ha dirigido películas exitosas como "The Dark Knight" y "Inception". Su trabajo se destaca por tramas complejas y visuales impactantes.'),
('Peter Jackson', 'Peter Jackson es un director, productor y guionista neozelandés. Es conocido por dirigir la trilogía de "The Lord of the Rings", ganadora de múltiples premios de la Academia.'),
('Steven Spielberg', 'Steven Spielberg es un director, productor y guionista estadounidense. Ha dirigido numerosas películas exitosas, incluyendo "E.T.", "Jurassic Park" y "Schindler''s List". Es uno de los cineastas más influyentes en la historia del cine.'),
('Robert Zemeckis', 'Robert Zemeckis es un director, productor y guionista estadounidense. Ha dirigido películas como "Forrest Gump" y "Back to the Future". Es conocido por su innovación en efectos visuales.'),
('The Wachowskis', 'The Wachowskis son Lana Wachowski y Lilly Wachowski, directoras, productoras y guionistas estadounidenses. Son conocidas por dirigir "The Matrix" y "Cloud Atlas". Su trabajo a menudo explora temas de ciencia ficción y filosofía.'),
('James Cameron','James Cameron es un director, productor y guionista canadiense conocido por dirigir películas exitosas como "Avatar" y "Titanic".'),
('David Fincher', 'David Fincher es un director y productor estadounidense. Ha dirigido películas como "Fight Club" y "The Social Network". Su estilo visual distintivo y narrativa provocadora son características de sus obras.');

INSERT INTO Actores (name_actor, sobre_el)
VALUES
('Tim Robbins', 'Tim Robbins es un actor estadounidense conocido por su papel en "The Shawshank Redemption". También es un director y guionista.'),
('Marlon Brando', 'Marlon Brando fue un icónico actor estadounidense conocido por su papel en "The Godfather". Es considerado uno de los mejores actores de la historia del cine.'),
('John Travolta', 'John Travolta es un actor estadounidense famoso por su papel en "Pulp Fiction". Ha tenido una carrera versátil en la actuación.'),
('Christian Bale', 'Christian Bale es un actor británico conocido por su papel como Batman en "The Dark Knight". Es conocido por su compromiso con sus personajes.'),
('Elijah Wood', 'Elijah Wood es un actor estadounidense conocido por interpretar a Frodo Baggins en "The Lord of the Rings".'),
('Liam Neeson', 'Liam Neeson es un actor irlandés conocido por su papel en "Schindler''s List". Ha participado en películas de acción y dramas.'),
('Tom Hanks', 'Tom Hanks es un actor estadounidense que interpretó a Forrest Gump en la película del mismo nombre. Ha ganado múltiples premios Óscar.'),
('Keanu Reeves', 'Keanu Reeves es un actor canadiense conocido por su papel en "The Matrix". También es conocido por su papel en la franquicia "John Wick".'),
('Sam Worthington', 'Sam Worthington es conocido por su versatilidad como actor y ha participado en una variedad de géneros cinematográficos a lo largo de su carrera.'),
('Edward Norton', 'Edward Norton es un actor estadounidense conocido por su papel en "Fight Club". Es un actor versátil y también ha dirigido películas.');

INSERT INTO Genero (name_genero)
VALUES
('Drama'),
('Crimen'),
('Acción'),
('Ciencia ficción'),
('Aventuras'),
('Historia'),
('Suspenso'),
('Fantasía'),
('Comedia'),
('Romance');

INSERT INTO peliculas_directores(pelicula_id, director_id) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10); 
INSERT INTO peliculas_actores(pelicula_id,actor_id) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10); 

INSERT INTO peliculas_generos(pelicula_id, genero_id) VALUES 
(1,1),
(2,2),
(3,1),
(4,3),
(5,5),
(6,1),
(7,9),
(8,4),
(9,4),
(10,1); 


DELETE FROM peliculas_directores;
DELETE FROM peliculas_actores;
DELETE FROM peliculas_generos;
DELETE FROM Genero;
DELETE FROM Actores;
DELETE FROM Directores;
DELETE FROM Peliculas;


