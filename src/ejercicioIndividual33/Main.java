
package ejercicioIndividual33;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
    /*  - si el empleado tiene más de 40 años bono adicional de $100.000
        - todos los vendedores bono adicional de $50.000
        - si el repartidor tiene menos de 30 años bono adicional de $15.000
    */     
        Vendedor vendedor1 = new Vendedor (
                "12-05-2018",
                "Pedro",
                "Perez",
                41,
                500000); //+100mil + 50mil => 650mil
        
        Vendedor vendedor2 = new Vendedor (
                "24-12-2020",
                "Pamela", 
                "Palacios",
                38,
                600000); //+50mil => 650mil
        
        // -----------------------------
        
        Repartidor repartidor1 = new Repartidor (
                "7:00 a 17:00hrs",
                "Camilo", 
                "Cabello", 
                47, 
                120000);//+100mil => 220mil
        
        Repartidor repartidor2 = new Repartidor (
                "8:00 a 17:00hrs",
                "Cesar",
                "Campos",
                24, 
                240000);//+15mil => 255mil
               
        //***************************
        System.out.println("-----------------------------");
        System.out.println("El salario final del vendedor "
                            + vendedor1.getNombre() + " " 
                            + vendedor1.getApellido() + " es $ " 
                            + vendedor1.calcularSalario());

        System.out.println("El salario final del vendedor "
                            + vendedor2.getNombre() + " " 
                            + vendedor2.getApellido() + " es $ " 
                            + vendedor2.calcularSalario());

        //***************************
        System.out.println("-----------------------------");   
        System.out.println("El salario final del vendedor "
                            + repartidor1.getNombre() + " "
                            + repartidor1.getApellido() + " es $ "
                            + repartidor1.calcularSalario());
       
        System.out.println("El salario final del vendedor "
                            + repartidor2.getNombre() + " "
                            + repartidor2.getApellido() + " es $ "
                            + repartidor2.calcularSalario());    
    }
}
