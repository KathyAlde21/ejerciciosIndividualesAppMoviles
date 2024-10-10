
package sprintFinal;

import java.util.Scanner;

public class Principal{
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    // Recolectar más datos
                    Cliente cliente = new Cliente(nombre, "10/10/1990",
                            "12345678", "Apellido", "987654321", "AFP",
                            1, "Calle 123", "Comuna", "30");
                    contenedor.almacenarCliente(cliente);
                    break;
                case 2:
                    // Lógica similar para profesional
                    break;
                case 3:
                    // Lógica similar para administrativo
                    break;
                case 4:
                    System.out.print("Ingrese identificador de la"
                            + " capacitación: ");
                    int identificador = scanner.nextInt();
                    Capacitacion capacitacion = new Capacitacion(identificador, 
                            12345678, "Lunes", "10:00", "Lugar", "2 horas", 20);
                    contenedor.almacenarCapacitacion(capacitacion);
                    break;
                case 5:
                    System.out.print("Ingrese RUN del usuario a eliminar: ");
                    String run = scanner.nextLine();
                    contenedor.eliminarUsuario(run);
                    break;
                case 6:
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    System.out.print("Ingrese el tipo de usuario"
                            + " (cliente/profesional/administrativo): ");
                    String tipoUsuario = scanner.nextLine();
                    contenedor.listarUsuariosPorTipo(tipoUsuario);
                    break;
                case 8:
                    contenedor.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
        
    }
}
