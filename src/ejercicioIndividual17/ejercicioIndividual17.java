package ejercicioIndividual17;

import java.util.Scanner;

public class ejercicioIndividual17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
               
        // Inicializar contadores para vocales y consonantes
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        String palabra = "";
             
        do {
            // Solicitar al usuario que ingrese una palabra
            System.out.println("Ingrese una frase o palabra:");
           // String palabra = input.nextLine().toLowerCase();
            palabra = input.nextLine().toLowerCase();
           
            //definir que no quede vacio
            if (!palabra.isBlank()) {
                // Recorrer cada carácter de la palabra
                for (int i = 0; i < palabra.length(); i++) {
                    char caracter = palabra.charAt(i);

                    // Verificar si el carácter es una vocal
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        contadorVocales++;
                    } else if (caracter >= 'a' && caracter <= 'z') {
                        // Verificar si el carácter es una consonante (cualquier letra que no sea vocal)
                        contadorConsonantes++;
                    }
                }

            }else {
               System.out.println("No ingreses un campo sin texto");
           }
        } while (palabra.isBlank()); //salir si contiene palabra
        
        System.out.println("--- --- --- --- ");  
        // Mostrar los resultados
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println("Cantidad de consonantes: " + contadorConsonantes);
    }
 
}
