CREATE DATABASE capacitaciones;

USE capacitaciones;

CREATE TABLE operadores(
run INT PRIMARY KEY NOT NULL,
nombreOperador VARCHAR(50) NOT NULL,
apellidoOperador VARCHAR(50) NOT NULL,
direccion VARCHAR(45) NOT NULL,
email  VARCHAR(45) NOT NULL,
UNIQUE(run)
);

CREATE TABLE usuarios(
idCoder INT PRIMARY KEY AUTO_INCREMENT,
nombreUsuario VARCHAR(50) NOT NULL,
apellidoUsuario VARCHAR(50) NOT NULL,
email  VARCHAR(45) NOT NULL,
telefono INT NOT NULL,
UNIQUE(idCoder)
);

CREATE TABLE capacitacion(
codigoCurso INT PRIMARY KEY NOT NULL,
nombreCurso VARCHAR(50) NOT NULL,
horario TIME NOT NULL
);
