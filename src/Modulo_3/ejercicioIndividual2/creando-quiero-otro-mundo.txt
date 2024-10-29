CREATE DATABASE quiero_otro_mundo;

CREATE TABLE operadores(
run INT PRIMARY KEY NOT NULL,
nombre_operador VARCHAR(50) NOT NULL,
apellido_operador VARCHAR(50) NOT NULL,
direccion VARCHAR(45) NOT NULL,
email  VARCHAR(45) NOT NULL,
fecha_creacion_cuenta_op DATETIME DEFAULT CURRENT_TIMESTAMP,
UNIQUE(run)
);

CREATE TABLE usuarios(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
nombre_usuario VARCHAR(50) NOT NULL,
apellido_usuario VARCHAR(50) NOT NULL,
email  VARCHAR(45) NOT NULL,
telefono INT NOT NULL,
fecha_creacion_cuenta_us DATETIME DEFAULT CURRENT_TIMESTAMP,
UNIQUE(id_usuario)
);

CREATE TABLE capacitacion(
codigo_curso INT PRIMARY KEY NOT NULL,
nombre_curso VARCHAR(50) NOT NULL,
horario TIME NOT NULL,
costo_realizacion INT NOT NULL,
fecha_realizacion DATE NOT NULL
);
