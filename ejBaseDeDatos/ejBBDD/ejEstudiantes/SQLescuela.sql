CREATE DATABASE IF NOT EXISTS escuela;
USE escuela;

CREATE TABLE IF NOT EXISTS Estudiante(
idEstudiante INTEGER PRIMARY KEY AUTO_INCREMENT,
nombreEstudiante VARCHAR(45) not null,
apellidosEstudiante VARCHAR(45) not null,
DNIestudiante VARCHAR(15) not null
);

CREATE TABLE IF NOT EXISTS Profesor(
idProfesor INTEGER PRIMARY KEY AUTO_INCREMENT,
nombreProfesor VARCHAR(45) not null,
apellidosProfesor VARCHAR(45) not null,
DNIprofesor VARCHAR(15) not null
);

CREATE TABLE IF NOT EXISTS Curso(
idCurso INTEGER PRIMARY KEY AUTO_INCREMENT,
nombreCurso VARCHAR(45) not null,
duracion INTEGER not null,
FK_ID_PROFESOR INTEGER,
FOREIGN KEY (FK_ID_PROFESOR) REFERENCES Profesor(idProfesor)
);

CREATE TABLE IF NOT EXISTS Estudiante_has_curso(
id_estudiante_curso INTEGER PRIMARY KEY auto_increment,
estudiante_id INTEGER ,
curso_id INTEGER,
nota DECIMAL(2.2),
FOREIGN KEY (estudiante_id) REFERENCES Estudiante(idEstudiante),
FOREIGN KEY (curso_id) REFERENCES Curso(idCurso)
);

INSERT INTO Estudiante VALUES
(NULL, 'Sergi', 'Gavín Serrano', '47418638L'),
(NULL, 'Carlos', 'Martínez Pérez', '34567890A'),
(NULL, 'Javier','Sánchez García', '12345098C'),
(NULL, 'María', 'Rodríguez López', '21098765B'),
(NULL, 'Alejandro', 'López García', ' 12345678F'),
(NULL, 'Laura', 'Pérez Rodríguez', '23456789H'),
(NULL, 'Manuel', 'González Martínez', '56789012G'),
(NULL, 'Ana', 'Fernández Sánchez', '78901234I'),
(NULL, 'David', 'Torres Ruiz', '34567890J'),
(NULL, 'Marta', 'Martín López', '45678901A');

INSERT INTO Profesor VALUES
(NULL, 'Isabel', 'López Martínez', '47418638L'),
(NULL, 'Daniel', 'Sánchez Fernández', '34567890A'),
(NULL, 'Laura','Martín López', '12345098C'),
(NULL, 'Carlos', 'González García', '21098765B'),
(NULL, 'Ana', 'López García', ' 12345678F'),
(NULL, 'Luis', 'Pérez Rodríguez', '23456789H'),
(NULL, 'María', 'Sánchez Pérez', '56789012G'),
(NULL, 'Alejandro', 'Sánchez García', '78901234I'),
(NULL, 'Carmen', 'Martín Ramírez', '34567890J'),
(NULL, 'Luis', 'Ramírez Sánchez', '45678901A');

INSERT INTO Curso VALUES
(NULL, 'Curso Java', '280',2),
(NULL, 'Curso Python','260',1),
(NULL, 'Curso PHP','240',2),
(NULL, 'Curso Azure','20',3),
(NULL, 'Curso Javascript','200',4),
(NULL, 'Curso Ruby', '180',5),
(NULL, 'Curso Rust','175',2),
(NULL, 'Curso Repaso Java','90',6),
(NULL, 'Curso HTML','100',7),
(NULL, 'Curso CSS','75',8);

INSERT INTO Estudiante_has_curso VALUES
(NULL, 1,1,7), -- id, id estudiante,id curso y nota
(NULL, 1,2,5),
(NULL, 1,3,9),
(NULL, 2,1,4),
(NULL, 2,2,10),
(NULL, 3,1,6),
(NULL, 3,3,8),
(NULL, 4,4,0),
(NULL, 5,7,4),
(NULL, 6,5,9),
(NULL, 7,9,5),
(NULL, 8,6,6),
(NULL, 9,8,8),
(NULL, 10,5,10),
(NULL, 6,10,2),
(NULL, 4,7,0),
(NULL, 5,6,9),
(NULL, 5,4,8);

-- Listado de que profesor le da clase a cada alumno
select idProfesor, nombreProfesor, apellidosProfesor, idEstudiante, nombreEstudiante, apellidosEstudiante from Estudiante 
inner join Estudiante_has_curso 
on Estudiante_has_curso.estudiante_id =Estudiante.idEstudiante
inner join Curso on 
Curso.idCurso = Estudiante_has_curso.curso_id
inner join Profesor on
Profesor.idProfesor = Curso.FK_ID_PROFESOR
group by idProfesor, idEstudiante;

-- Alumnos a los que UN profesor les da clase 
select idProfesor, nombreProfesor, apellidosProfesor, idEstudiante, nombreEstudiante, apellidosEstudiante from Estudiante 
inner join Estudiante_has_curso 
on Estudiante_has_curso.estudiante_id =Estudiante.idEstudiante
inner join Curso on 
Curso.idCurso = Estudiante_has_curso.curso_id
inner join Profesor on
Profesor.idProfesor = Curso.FK_ID_PROFESOR where nombreProfesor = 'Carlos' and apellidosProfesor = 'González García'
group by idProfesor, idEstudiante;

-- Cursos que hace el profesor con el id 2
select idProfesor, nombreProfesor, apellidosProfesor, idCurso, nombreCurso, duracion from Profesor 
inner join Curso on 
Curso.FK_ID_PROFESOR = Profesor.idProfesor
where idProfesor = 2;


select  nombreCurso, nombreEstudiante, apellidosEstudiante from Estudiante 
inner join Estudiante_has_curso 
on Estudiante_has_curso.estudiante_id =Estudiante.idEstudiante
inner join Curso on 
Curso.idCurso = Estudiante_has_curso.curso_id
 where idEstudiante = 1
group by idCurso, idEstudiante;


SET autocommit = OFF;
-- Ejercicio TRANSACTIONS - RollBack
BEGIN;
CREATE TABLE IF NOT EXISTS tablaRollBack(
idRollBack integer primary key auto_increment,
FUNCIONA VARCHAR(5)
);
INSERT INTO tablaRollBack VALUES(NULL,'SI');
ROLLBACK;
select * from tablaRollBack;
-- Ejercicio TRANSACTIONS - Commit
BEGIN;
CREATE TABLE IF NOT EXISTS tablaCommit(
idCommit integer primary key auto_increment,
FUNCIONA VARCHAR(5)
);
INSERT INTO tablaCommit VALUES(NULL,'SI');
COMMIT;
select * from tablaCommit;

