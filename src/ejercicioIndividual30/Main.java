
package ejercicioIndividual30;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Comprador comprador1 = new Comprador (
                "Pedro",
                "Perez",
                "Av. Siempre Viva 123");
        
        System.out.println(comprador1);
        
    // ****
        
        Envio envio1 = new Envio (
                "09-10-2024",
                "Av. Siempre Viva 321",
                "Pedro",
                "Perez",
                "Av. Siempre Viva 123");
        
        System.out.println(envio1);
        
    // ****
        
        Articulo articulo1 = new Articulo (
                "Libro",
                "$12.000",
               "10-10-2024",
                "Av. Siempre Viva 321",
                "Pedro",
                "Perez",
                "Av. Siempre Viva 123");
        
        System.out.println(articulo1);
        
    // ****
        
        Vendedor vendedor1 = new Vendedor (
                "Jon", 
                "Doe",
                "Libro",
                "$12.000",
               "10-10-2024",
                "Av. Siempre Viva 321",
                "Pedro",
                "Perez",
                "Av. Siempre Viva 123");

        System.out.println(vendedor1);
        
        Pago pago1 = new Pago (
                "09-10-2024",
                "$1.000",
                "Av. Siempre Viva 123",
                "10-10-2024",
                "Av. Siempre Viva 321",
                "Pedro",
                "Perez",
                "Av. Siempre Viva 123");
        
        System.out.println(pago1);
        
        
    }
}
