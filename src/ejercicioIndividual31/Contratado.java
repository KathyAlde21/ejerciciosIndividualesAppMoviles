
package ejercicioIndividual31;

public class Contratado extends Trabajador{
    
    private String fechaIngreso;
    private String salarioMensual;
    
    public Contratado (){};

    public Contratado(
            String fechaIngreso,
            String salarioMensual,
            String primerNombre,
            String segundoNombre,
            String apellidoMaterno,
            String apellidoPaterno,
            String run,
            String telefono,
            int edad
    ) {
        super(primerNombre, segundoNombre, apellidoMaterno, apellidoPaterno, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(String salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //*****************************
     
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getPrimerNombre() 
                + " " + getSegundoNombre() + " " + getApellidoMaterno()
                + " " + getApellidoPaterno() + " RUN: " + getRun()
                + " Telefono: " + getTelefono()
                + " Edad: " + getEdad() + "Fecha de Ingreso: " + fechaIngreso
                + "Salario Mensual: " + salarioMensual);
    }
    
    
    @Override
    public String toString() {
        return "Contratado{" + "fechaIngreso=" + fechaIngreso
                + ", salarioMensual=" + salarioMensual
                + '}'
                + super.toString();
    }
    
}
