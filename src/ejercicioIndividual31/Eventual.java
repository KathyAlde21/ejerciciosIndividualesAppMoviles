
package ejercicioIndividual31;

public class Eventual extends Trabajador{
    
    private String disponibilidad;
    private String email;
    
    public Eventual (){};

    public Eventual(
            String disponibilidad,
            String email,
            String primerNombre,
            String segundoNombre,
            String apellidoMaterno,
            String apellidoPaterno,
            String run,
            String telefono,
            int edad
    ) {
        super(primerNombre, segundoNombre, apellidoMaterno, apellidoPaterno, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.email = email;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //*****************************
     
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getPrimerNombre() 
                + " " + getSegundoNombre() + " " + getApellidoMaterno()
                + " " + getApellidoPaterno() + " RUN: " + getRun()
                + " Telefono: " + getTelefono()
                + " Edad: " + getEdad() + "Disponibilidad: " + disponibilidad
                + "Email: " + email);
    }
    
    
    @Override
    public String toString() {
        return "Eventual{" + "disponibilidad=" + disponibilidad
                + ", email=" + email
                + '}'
                + super.toString();
    }
    
    
}
