
package Modulo_2.ejercicioIndividual31;

public class Honorario extends Trabajador{
    
    private String giro;
    private String anoInicioActividades;
    
    public Honorario (){};

    public Honorario(
            String giro,
            String anoInicioActividades,
            String primerNombre,
            String segundoNombre,
            String apellidoMaterno,
            String apellidoPaterno,
            String run,
            String telefono,
            int edad
    ) {
        super(primerNombre, segundoNombre, apellidoMaterno, apellidoPaterno,
                run, telefono, edad);
        this.giro = giro;
        this.anoInicioActividades = anoInicioActividades;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getAnoInicioActividades() {
        return anoInicioActividades;
    }

    public void setAnoInicioActividades(String anoInicioActividades) {
        this.anoInicioActividades = anoInicioActividades;
    }

    //*****************************
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getPrimerNombre() 
                + " " + getSegundoNombre() + " " + getApellidoMaterno()
                + " " + getApellidoPaterno() + " RUN: " + getRun()
                + " Telefono: " + getTelefono()
                + " Edad: " + getEdad() + "Giro laboral: " + giro
                + "Ano de Inicio de Actividades: " + anoInicioActividades);
    }
    
    @Override
    public String toString() {
        return "Honorario{" + "giro=" + giro
                + " anoInicioActividades=" + anoInicioActividades
                + '}'
                + super.toString();
    }
     
}
