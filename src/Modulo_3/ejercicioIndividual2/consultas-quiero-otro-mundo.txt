-- Debe indicar cuánto fue el costo de realización de todos los cursos de capacitación registrados.
SELECT MAX(costo_realizacion)
FROM capacitacion;

-- Muestre los 5 operadores más recientemente registrados.
SELECT * FROM operadores
ORDER BY fecha_creacion_cuenta_op DESC
LIMIT 5;

-- Muestre los 5 usuarios más recientemente registrados.
SELECT * FROM usuarios
ORDER BY fecha_creacion_cuenta_us DESC
LIMIT 5;

-- Calcule cuántos días han transcurrido desde que se registró a operadores y clientes con DATEDIFF()
-- operadores
SELECT 
run,
nombre_operador,
apellido_operador,
direccion,
email,
DATEDIFF(CURDATE(), fecha_creacion_cuenta_op) AS dias_desde_registro_op
FROM operadores;

-- clientes
SELECT
id_usuarioT,
nombre_usuario,
apellido_usuario,
email,
telefono,
DATEDIFF(CURDATE(), fecha_creacion_cuenta_us) AS dias_desde_registro_us
FROM usuarios;

-- Calcule cuántos días transcurrieron desde que se realizó el último curso de capacitación.
SELECT DATEDIFF(CURDATE(), fecha_realizacion) AS dias_ultima_capacitacion
FROM capacitacion
ORDER BY fecha_realizacion DESC
LIMIT 1;

-- Por último, indique cuál fue el curso de capacitación más costoso y el menos costoso.
SELECT MAX(costo_realizacion), MIN(costo_realizacion)
FROM capacitacion;
