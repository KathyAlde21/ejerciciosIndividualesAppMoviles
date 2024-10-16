package Modulo_2.ejercicioIndividual25;

public class Main {
    public static void main(String[] args) {
     //   System.out.println("Hola Mundo");
        
        Trabajador trabajador1 = new Trabajador(
                "Kathy",
                "Andrea",
                "Alderete",
                "Gomez",
                "12345678-9",
                "9658961475",
                44
        );
        
        //validando
     //   System.out.println(trabajador1);
        
        //nombre completo concatenado
        trabajador1.mostrarDatos();
        
 
        //descomponer run
        int numeroRun = trabajador1.descomponerRun();
        System.out.println("El numero de RUN es: " + numeroRun);
        
        
        }
    
}
