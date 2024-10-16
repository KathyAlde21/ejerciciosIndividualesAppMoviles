package Modulo_2.ejercicioIndividual19;

import java.util.Scanner;

public class ejercicioIndividual19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
               
        // Inicializar contadores
        String palabra = "";
        int[] contadorLetras = new int[26]; // 26 letras abecedario - sin ñ
        
        do {
            // Solicitar al usuario que ingrese una palabra
            System.out.println("Ingrese una frase o palabra:");
            palabra = input.nextLine().toLowerCase();
            System.out.println("--- * * * ---");

            if (!palabra.isBlank()) { //definir que no quede vacio
             // Recorrer cada carácter de la palabra
                for (int i = 0; i < palabra.length(); i++) {
                    char caracter = palabra.charAt(i);
                    System.out.println(caracter);
    //                
    //                //Contador de letras
                    if (caracter >= 'a' && caracter <= 'z') {
                        contadorLetras[caracter - 'a']++;
                    }
                }
    //           
    //          // Mostrar las letras del abecedario y sus respectivas cantidades
                for (int i = 0; i < 26; i++) {
                    char letra = (char) ('a' + i);
                    int cantidad = contadorLetras[i];
                    System.out.println(letra + ": " + cantidad);
                }
    
              // Llenar el arreglo con los caracteres de la cadena
                char arregloCaracteres[] = new char[palabra.length()]; //arreglo de caracteres del mismo tamaño que la cadena
                for (int i = 0; i < palabra.length(); i++) {

                    arregloCaracteres[i] = palabra.charAt(i);
                }
                System.out.println("--- --- --- --- ---");      
                
              // Desplegar el contenido del arreglo
                System.out.println("El contenido del arreglo de caracteres es:");
                for (int i = 0; i < arregloCaracteres.length; i++) {
                    System.out.println(arregloCaracteres[i]);
                }
            }else {
                   System.out.println("No ingreses un campo sin texto");
            }
        } while (palabra.isBlank()); //salir si contiene palabra
        
    }  
}
