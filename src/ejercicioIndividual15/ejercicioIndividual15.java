package ejercicioIndividual15;

import java.util.Scanner;

public class ejercicioIndividual15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        //Solicitando valores        
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        char operador;

        System.out.println(" --- --- --- --- --- --- ");
        System.out.println("Calculadora en Java");
        System.out.println(" --- --- --- --- --- --- ");
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = input.next().charAt(0);

        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextInt();

        System.out.println(" --- --- --- --- --- --- ");
        
        //Opraciones calculadora
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }  
    }
}
