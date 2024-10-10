
package sprintFinal;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario implements Asesoria {
    
    String nombre;
    private LocalDate fechaNacimiento;
    int run;
    
    //--------------------
    public Usuario (){};

    public Usuario(
            String nombre,
            LocalDate fechaNacimiento,
            int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }
    //------------------

    //NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 10 || nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener"
                    + " entre 10 y 50 caracteres.");
        }
        this.nombre = nombre;
    }

    //FECHA DE NACIMIENTO
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
    }

    //RUN
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        if (run >= 99999999) {
            throw new IllegalArgumentException("El RUN debe ser menor a"
                    + " 99.999.999.");
        }
        this.run = run;
    }

    //******************************************
    //METODOS:
    public String obtenerFechaNacimiento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd/mm/yyyy");
        return this.fechaNacimiento.format(formatter);
    }
     //----------   
    //mostrar edad - incluye calculo
    public int obtenerEdad(){
        if (this.fechaNacimiento == null) {
            throw new IllegalArgumentException("El RUN debe ser menor a"
                    + " 99.999.999.");
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(this.fechaNacimiento,
                fechaActual).getYears();
    }
    
    public void mostrarEdad(){
        System.out.println("El usuario tiene " + obtenerEdad() + "años");
    }
    
    //----------
    
    public void mostrarRut(){
        System.out.println(run); 
    }
    
    public void mostrarDatosUsuario(){
        System.out.println("Usuario: " + nombre
                + ", fecha de nacimiento: " + fechaNacimiento
                + ", RUN: " + run); 
    }
    
    @Override //implementada en interface Asesoria
    public void analizarUsuario(){
        System.out.println("El nombre del usuario es: " + nombre 
                + ", RUN " + run);
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre
                + ", fechaNacimiento=" + fechaNacimiento
                + ", run=" + run + '}';
    }

}
