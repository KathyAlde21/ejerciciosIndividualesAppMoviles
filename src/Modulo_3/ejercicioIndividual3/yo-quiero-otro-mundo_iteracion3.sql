USE quiero_otro_mundo;

-- // --- TABLA OPERADORES:
SELECT * FROM operadores;

-- 1)	Agregue el campo salario al Operador y registre salarios a los operadores ya registrados.
ALTER TABLE operadores
ADD salario DOUBLE NOT NULL;

-- ingresando salario a operadores
UPDATE operadores
SET salario = 550000
WHERE run = 124859653; -- (124859653, 'Karin', 'Aburto Vergara', 'Psje Quino 123', 'karin@gmail.com'), -- 1

UPDATE operadores
SET salario = 750000
WHERE run = 188523697; -- (188523697, 'Kevin', 'Navarrete Molina', 'Psje Ranquen 321', 'kevin@gmail.com'), -- 2

UPDATE operadores
SET salario = 520000
WHERE run = 179874563; -- (179874563, 'Lipsy', 'Reyes Bastias', 'Psje Pidima 456', 'lipsy@gmail.com'), -- 3

UPDATE operadores
SET salario = 535000
WHERE run = 139852367; -- (139852367, 'Sandra', 'Gonzalez Pavez', 'Psje Trupan 451', 'sandra@gmail.com'), -- 4

UPDATE operadores
SET salario = 595000
WHERE run = 137411596; -- (137411596, 'Scarlete', 'Norambuena Norambuena', 'Psje Los Trapenses 253', 'scarlete@gmail.com'), -- 5

UPDATE operadores
SET salario = 642000
WHERE run = 129519556; -- (129519556, 'Sybella', 'Sandoval Soto', 'Psje Cajón 258', 'sybella@gmail.com') -- 6

UPDATE operadores
SET salario = 625000
WHERE run = 143212589; -- (143212589, 'Raul', 'Rojo Urra', 'Psje Meteoro 859', 'raul@gmail.com') -- 7

UPDATE operadores
SET salario = 734000
WHERE run = 228623597; -- (228623597, 'Patricio', 'Quidel Painemil', 'Psje Ranquillon 654', 'patricio@gmail.com') -- 8

UPDATE operadores
SET salario = 785000
WHERE run = 107896321; -- (107896321, 'Pablo', 'Egaña Acevedo', 'Psje Escuadron 456', 'pablo@gmail.com') -- 9

UPDATE operadores
SET salario = 697000
WHERE run = 131574263; -- (131574263, 'Paulina', 'Gonzalez Miranda', 'Psje Selva Oscura 123', 'paulina@gmail.com') -- 10

-- 2)	Inserte 3 operadores nuevos
-- operadores (run, nombre_operador, apellido_operador, direccion, email, salario)
INSERT INTO operadores (run, nombre_operador, apellido_operador, direccion, email, salario)
VALUES (159874563, 'Andrés', 'Muñoz', 'Calle de la Luna 808', 'andres.munoz@gmail.com', 415000), -- 1
(214529872, 'Beatriz', 'Rojas', 'Boulevard de los Sueños 456', 'beatriz.rojas@gmail.com', 316000), -- 2
(129876327, 'Claudio', 'Pérez', 'Camino del Sol 101', 'claudio.perez@gmail.com', 417000); -- 3

-- // ------------------------------------------------------------------------------------------------
-- // --- TABLA CAPACITACIONES:
-- 3)	Inserte 3 capacitaciones nuevas.
SELECT * FROM capacitacion;

INSERT INTO capacitacion (codigo_curso, nombre_curso, horario, costo_realizacion, fecha_realizacion)
VALUES (147965, 'Contabilidad Avanzada','15:00:00', 500000, '2020-10-01'),
(56487, 'Excel básico','15:00:00', 500000, '2023-03-04'),
(56954, 'Excel avanzado', '15:00:00', 500000, '2023-10-01');

-- // ------------------------------------------------------------------------------------------------
-- // --- CONSULTAS:
-- 4)	¿Cuál es la capacitación más costosa? Selecciónelo => Excel básico
SELECT nombre_curso, costo_realizacion
FROM capacitacion
ORDER BY costo_realizacion DESC
LIMIT 1;

SELECT * FROM capacitacion
ORDER BY costo_realizacion DESC
LIMIT 1; 

-- 5)	¿Cuál es el operador con menor salario? Selecciónelo => Beatriz Rojas
SELECT nombre_operador, apellido_operador
FROM operadores
ORDER BY salario ASC
LIMIT 1;

SELECT * FROM operadores
ORDER BY salario ASC
LIMIT 1;

-- 6)	Seleccione las capacitaciones más costosas que el promedio.
SELECT nombre_curso, costo_realizacion
FROM capacitacion
WHERE costo_realizacion > (
	SELECT AVG(costo_realizacion) 
	FROM capacitacion
); -- superior al promedio

SELECT * FROM capacitacion
WHERE costo_realizacion > (
	SELECT AVG(costo_realizacion) 
	FROM capacitacion
); -- superior al promedio

-- // ------------------------------------------------------------------------------------------------
-- // --- NUEVA TABLA CAPACITACIONES ECONOMICOS
-- 7)	Cree una tabla con las capacitaciones menos costosas que el promedio
-- debe tener por nombre Capacitaciones Económicos:

SELECT * FROM capacitacion
WHERE costo_realizacion < (
	SELECT AVG(costo_realizacion)
	FROM capacitacion
); -- inferior al promedio

CREATE TABLE capacitaciones_economicos AS  				-- que cree la tabla según la consulta:
SELECT * FROM capacitacion
WHERE costo_realizacion < (
	SELECT AVG(costo_realizacion)
	FROM capacitacion
);

-- 8)	A la tabla Capacitaciones Económicos, agrégale dos campos. ‘Cantidad mínima estudiantes’ y ‘Aportes públicos’.
ALTER TABLE capacitaciones_economicos
ADD cantidad_minima_estudiantes INT NOT NULL, -- mínimo de estudiantes necesarios para su realización
ADD aportes_publicos INT NOT NULL; -- tiene que ser un valor menor al costo total del curso

SELECT * FROM capacitaciones_economicos;

-- ingresando cantidad_minima_estudiantes y aportes_publicos a capacitaciones_economicos
UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 30,
aportes_publicos = 250000
WHERE codigo_curso = 56487; -- (56487, 'Excel básico', '10:30:00', 200000, '2010-03-04'), -- 1

UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 30,
aportes_publicos = 150000
WHERE codigo_curso = 147852; -- (147852, 'Contabilidad Básica', '10:30:00', 200000, '2010-03-04'), -- 2
 
UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 30,
aportes_publicos = 230000
WHERE codigo_curso = 147853; -- (147853, 'Alfabetización Financiera', '10:30:00', 280000, '2017-06-04'), -- 3

UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 30,
aportes_publicos = 300000
WHERE codigo_curso = 147854; -- (147854, 'Atención al cliente', '14:30:00', 350000, '2012-03-03'), -- 4

UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 25,
aportes_publicos = 150000
WHERE codigo_curso = 258964; -- (258964, 'Gestión Básica del Tiempo y Productividad', '20:00:00', 200000, '2020-10-01'), -- 5

UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 20,
aportes_publicos = 150000
WHERE codigo_curso = 369852; -- (369852, 'Introducción a la Computación', '11:30:00', 200000, '2024-03-03'), -- 6

UPDATE capacitaciones_economicos
SET cantidad_minima_estudiantes = 20,
aportes_publicos = 280000
WHERE codigo_curso = 456321; -- (456321, 'Inglés Básico', '18:00:00', 300000, '2024-03-03'), -- 7

-- // ------------------------------------------------------------------------------------------------
-- 9)	Renombre la columna “Costo realización” en la tabla Capacitaciones económicas. 
	-- El nombre nuevo debe ser: Costo efectivo. En dicha columna, a cada valor se le debe restar el valor de ‘Aportes públicos’.
SELECT * FROM capacitaciones_economicos;

ALTER TABLE capacitaciones_economicos
RENAME COLUMN costo_realizacion
TO costo_efectivo;

UPDATE capacitaciones_economicos
SET costo_efectivo = costo_efectivo - aportes_publicos;

-- // ------------------------------------------------------------------------------------------------
-- 10)	Por último, actualice 5 cursos y 3 operadores.
-- 5 cursos:
SELECT * FROM capacitacion;
-- capacitacion (codigo_curso, nombre_curso, horario, costo_realizacion, fecha_realizacion)
/* VALUES (147852, 'Contabilidad Básica', '10:30:00', 200000, '2010-03-04'), -- 1
//(147853, 'Alfabetización Financiera', '10:30:00', 280000, '2017-06-04'), -- 2
(147854, 'Atención al cliente', '14:30:00', 350000, '2012-03-03'), -- 3
(258963, 'Marketing Digital para Emprendedores', '15:00:00', 400000, '2010-03-03'), -- 4
//(258964, 'Gestión Básica del Tiempo y Productividad', '20:00:00', 200000, '2020-10-01'), -- 5
(258965, 'Resolución de Conflictos en el Trabajo', '16:00:00', 450000, '2022-10-01'), -- 6
(369852, 'Introducción a la Computación', '11:30:00', 200000, '2024-03-03'), -- 7
//(369853, 'Diseño de Páginas Web', '12:30:00', 400000, '2020-03-03'), -- 8
(456321, 'Inglés Básico', '18:00:00', 300000, '2024-03-03'), -- 9
(456322, 'Inglés Técnico', '19:00:00', 500000, '2022-06-04'); -- 10 
(147965, 'Contabilidad Avanzada','15:00:00', 500000, '2020-10-01'), -- 11
//(56487, 'Excel básico','15:00:00', 500000, '2023-03-04'), -- 12
//(56954, 'Excel avanzado', '15:00:00', 500000, '2023-10-01'); -- 13 */

UPDATE capacitacion
SET costo_realizacion = 270000
WHERE codigo_curso = 147853; -- 1

UPDATE capacitacion
SET costo_realizacion = 300000
WHERE codigo_curso = 258964; -- 2

UPDATE capacitacion
SET costo_realizacion = 420000
WHERE codigo_curso = 369853; -- 3

UPDATE capacitacion
SET costo_realizacion = 350000
WHERE codigo_curso = 56487; -- 4

UPDATE capacitacion
SET costo_realizacion = 540000
WHERE codigo_curso = 56954; -- 5

-- 3 operadores:
SELECT * FROM operadores;
-- operadores (run, nombre_operador, apellido_operador, direccion, email, salario)
/* VALUES (124859653, 'Karin', 'Aburto Vergara', 'Psje Quino 123', 'karin@gmail.com', 550000), -- 1
(188523697, 'Kevin', 'Navarrete Molina', 'Psje Ranquen 321', 'kevin@gmail.com', 750000), -- 2
//(179874563, 'Lipsy', 'Reyes Bastias', 'Psje Pidima 456', 'lipsy@gmail.com', 520000), -- 3
(139852367, 'Sandra', 'Gonzalez Pavez', 'Psje Trupan 451', 'sandra@gmail.com', 535000), -- 4
(137411596, 'Scarlete', 'Norambuena Norambuena', 'Psje Los Trapenses 253', 'scarlete@gmail.com', 595000), -- 5
//(129519556, 'Sybella', 'Sandoval Soto', 'Psje Cajón 258', 'sybella@gmail.com', 642000), -- 6
(143212589, 'Raul', 'Rojo Urra', 'Psje Meteoro 859', 'raul@gmail.com', 625000), -- 7
(228623597, 'Patricio', 'Quidel Painemil', 'Psje Ranquillon 654', 'patricio@gmail.com', 734000), -- 8
(107896321, 'Pablo', 'Egaña Acevedo', 'Psje Escuadron 456', 'pablo@gmail.com', 785000), -- 9
(131574263, 'Paulina', 'Gonzalez Miranda', 'Psje Selva Oscura 123', 'paulina@gmail.com', 697000); -- 10 
(159874563, 'Andrés', 'Muñoz', 'Calle de la Luna 808', 'andres.munoz@gmail.com', 415000), -- 11
//(214529872, 'Beatriz', 'Rojas', 'Boulevard de los Sueños 456', 'beatriz.rojas@gmail.com', 316000), -- 12
(129876327, 'Claudio', 'Pérez', 'Camino del Sol 101', 'claudio.perez@gmail.com', 417000); -- 13 */

UPDATE operadores
SET salario = 658000
WHERE run = 129519556; -- 1

UPDATE operadores
SET salario = 425000
WHERE run = 214529872; -- 2

UPDATE operadores
SET salario = 751000
WHERE run = 179874563; -- 3
