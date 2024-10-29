-- Para obtener diferentes fechas de creación, cree y comente
-- alimentando tabla operadores
SELECT * FROM operadores;
INSERT INTO operadores (run, nombre_operador, apellido_operador, direccion, email)
VALUES (124859653, 'Karin', 'Aburto Vergara', 'Psje Quino 123', 'karin@gmail.com'), -- 1
(188523697, 'Kevin', 'Navarrete Molina', 'Psje Ranquen 321', 'kevin@gmail.com'), -- 2
(179874563, 'Lipsy', 'Reyes Bastias', 'Psje Pidima 456', 'lipsy@gmail.com'), -- 3
(139852367, 'Sandra', 'Gonzalez Pavez', 'Psje Trupan 451', 'sandra@gmail.com'), -- 4
(137411596, 'Scarlete', 'Norambuena Norambuena', 'Psje Los Trapenses 253', 'scarlete@gmail.com'), -- 5
(129519556, 'Sybella', 'Sandoval Soto', 'Psje Cajón 258', 'sybella@gmail.com'), -- 6
(143212589, 'Raul', 'Rojo Urra', 'Psje Meteoro 859', 'raul@gmail.com'), -- 7
(228623597, 'Patricio', 'Quidel Painemil', 'Psje Ranquillon 654', 'patricio@gmail.com'), -- 8
(107896321, 'Pablo', 'Egaña Acevedo', 'Psje Escuadron 456', 'pablo@gmail.com'), -- 9
(131574263, 'Paulina', 'Gonzalez Miranda', 'Psje Selva Oscura 123', 'paulina@gmail.com'); -- 10

-- Para obtener diferentes fechas de creación, cree y comente
-- alimentando tabla usuarios
SELECT * FROM usuarios;
INSERT INTO usuarios (nombre_usuario, apellido_usuario, email, telefono)
VALUES ('Alejandro', 'Gutiérrez Huenchuleo', 'alejandro@gmail.com', '985296314'), -- 1
('Camila', 'Tello Valenzuela', 'camila@gmail.com', 987556391), -- 2
('Carlos', 'Carmona Carreño', 'carlos@gmail.com', 987456321), -- 3
('Daisy', 'Castillo SAepúlveda', 'daisy@gmail.com', 965983214), -- 4
('Daniela', 'Nahuelpan Sierra', 'daniela@gmail.com', 989542325), -- 5
('David', 'Villacura Villacura', 'david@gmail.com', 989876545), -- 6
('Fabian', 'Gallardo Nahuelñir', 'fabian@gmail.com', 932145632), -- 7
('Francisca', 'Aedo Moreno', 'francisca@gmail.com', 974859632), -- 8
('Freya', 'Contreras Améstica', 'freya@gmail.com', 987453214), -- 9
('Isanny', 'Velasquez Alvarez', 'isanny@gmail.com', 974859878); -- 10


-- alimentando tabla capacitacion
SELECT * FROM capacitacion;
INSERT INTO capacitacion (codigo_curso, nombre_curso, horario, costo_realizacion, fecha_realizacion)
VALUES (147852, 'Contabilidad Básica', '10:30:00', 200000, '2010-03-04'), -- 1
(147853, 'Alfabetización Financiera', '10:30:00', 280000, '2017-06-04'), -- 2
(147854, 'Atención al cliente', '14:30:00', 350000, '2012-03-03'), -- 3
(258963, 'Marketing Digital para Emprendedores', '15:00:00', 400000, '2010-03-03'), -- 4
(258964, 'Gestión Básica del Tiempo y Productividad', '20:00:00', 200000, '2020-10-01'), -- 5
(258965, 'Resolución de Conflictos en el Trabajo', '16:00:00', 450000, '2022-10-01'), -- 6
(369852, 'Introducción a la Computación', '11:30:00', 200000, '2024-03-03'), -- 7
(369853, 'Diseño de Páginas Web', '12:30:00', 400000, '2020-03-03'), -- 8
(456321, 'Inglés Básico', '18:00:00', 300000, '2024-03-03'), -- 9
(456322, 'Inglés Técnico', '19:00:00', 500000, '2022-06-04'); -- 10
