
package Modulo_2.ejercicioIndividual33;

public class Empleados {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleados (){};
    
    public Empleados(
            String nombre,
            String apellido,
            int edad,
            double salario
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    //*************************************************
    //Metodo para calcular el salario con bono si aplica
    
    public double calcularSalario(){
        if (edad > 40) {
            salario += 100000; //bono para mayores 40 años
        }
        return salario;
    }
    
    //*************************************************
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //*************************************************
    
    public void mostrarDatos(){
        System.out.println(
                "Empleado: " + nombre + " " + apellido + ", Edad: "
                + edad + ", Salario: "+ salario);
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre
                + ", apellido=" + apellido
                + ", edad=" + edad
                + ", salario=" + salario
                + '}';
    }

}
