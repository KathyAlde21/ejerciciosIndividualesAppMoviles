USE capacitaciones;

-- alimentando tabla operadores
SELECT * FROM operadores;
INSERT INTO operadores (run, nombreOperador, apellidoOperador, direccion, email)
VALUE (124859653, 'Karin', 'Aburto Vergara', 'Psje Quino 123', 'karin@gmail.com'), -- 1
(188523697, 'Kevin', 'Navarrete Molina', 'Psje Ranquen 321', 'kevin@gmail.com'), -- 2
(179874563, 'Lipsy', 'Reyes Bastias', 'Psje Pidima 456', 'lipsy@gmail.com'), -- 3
(139852367, 'Sandra', 'Gonzalez Pavez', 'Psje Trupan 451', 'sandra@gmail.com'), -- 4
(137411596, 'Scarlete', 'Norambuena Norambuena', 'Psje Los Trapenses 253', 'scarlete@gmail.com'), -- 5
(129519556, 'Sybella', 'Sandoval Soto', 'Psje Cajón 258', 'sybella@gmail.com'), -- 6
(143212589, 'Raul', 'Rojo Urra', 'Psje Meteoro 859', 'raul@gmail.com'), -- 7
(228623597, 'Patricio', 'Quidel Painemil', 'Psje Ranquillon 654', 'patricio@gmail.com'), -- 8
(107896321, 'Pablo', 'Egaña Acevedo', 'Psje Escuadron 456', 'pablo@gmail.com'), -- 9
(131574263, 'Paulina', 'Gonzalez Miranda', 'Psje Selva Oscura 123', 'paulina@gmail.com'); -- 10


-- alimentando tabla usuarios
SELECT * FROM usuarios;
INSERT INTO usuarios (nombreUsuario, apellidoUsuario, email, telefono)
VALUE ('Alejandro', 'Gutiérrez Huenchuleo', 'alejandro@gmail.com', '985296314'), -- 1
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
INSERT INTO capacitacion (codigoCurso, nombreCurso, horario)
VALUE (147852, 'Contabilidad Básica', '10:30:00'), -- 1
(147853, 'Alfabetización Financiera', '10:30:00'), -- 2
(147854, 'Atención al cliente', '14:30:00'), -- 3
(258963, 'Marketing Digital para Emprendedores', '15:00:00'), -- 4
(258964, 'Gestión Básica del Tiempo y Productividad', '20:00:00'), -- 5
(258965, 'Resolución de Conflictos en el Trabajo', '16:00:00'), -- 6
(369852, 'Introducción a la Computación', '11:30:00'), -- 7
(369853, 'Diseño de Páginas Web', '12:30:00'), -- 8
(456321, 'Inglés Básico', '18:00:00'), -- 9
(456322, 'Inglés Técnico', '19:00:00'); -- 10

