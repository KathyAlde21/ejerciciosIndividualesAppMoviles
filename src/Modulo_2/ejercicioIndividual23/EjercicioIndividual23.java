
package Modulo_2.ejercicioIndividual23;

import java.util.Scanner;

public class EjercicioIndividual23 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        // Crear un StringBuilder para almacenar el resultado
        StringBuilder resultado = new StringBuilder();

        // Recorrer la cadena carácter por carácter
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Si es una letra minúscula, convertirla a mayúscula
            if (Character.isLowerCase(c)) {
                resultado.append(Character.toUpperCase(c));
            }
            // Si es una letra mayúscula, convertirla a minúscula
            else if (Character.isUpperCase(c)) {
                resultado.append(Character.toLowerCase(c));
            }
            // Si es un espacio en blanco, añadirlo al resultado
            else if (Character.isWhitespace(c)) {
                resultado.append(c);
            }
            // Si es un número o cualquier otro carácter, añadirlo sin modificar
            else {
                resultado.append(c);
            }
        }
        
        // Imprimir el resultado
        System.out.println("Resultado: " + resultado.toString());

        // Cerrar el scanner
        scanner.close();
        
    }
}
