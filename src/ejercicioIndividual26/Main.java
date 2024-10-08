package ejercicioIndividual26;

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
        
        Trabajador trabajador2 = new Trabajador(
                "Pedro",
                "Pablo",
                "Perez",
                "Pereira",
                "7852357-8",
                "22985687",
                56
        );
        
        Trabajador trabajador3 = new Trabajador(
                "Armando",
                "Felipe",
                "Casas",
                "Cordero",
                "1596357-8",
                "89236697",
                39);
        
        
        System.out.println("Los datos de cada trabajador son:");
        trabajador1.mostrarDatos();
        trabajador2.mostrarDatos();
        trabajador3.mostrarDatos();

        System.out.println("  -----------------------");
        
        System.out.println(trabajador1);
        System.out.println(trabajador2);
        System.out.println(trabajador3);

        
        }
    
}
