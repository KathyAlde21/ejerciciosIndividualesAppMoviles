package Modulo_2.ejercicioIndividual27;

public class Trabajador {
    
    private String primerNombre;
    private String segundoNombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String run;
    private String telefono;
    private int edad;
    
    //dos metodos constructores
    public Trabajador(){};

    public Trabajador(
            String primerNombre,
            String segundoNombre,
            String apellidoMaterno,
            String apellidoPaterno,
            String run,
            String telefono,
            int edad
    ) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }
    //******

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodo nombre completo concatenado
    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + this.primerNombre + " " + this.segundoNombre 
                + " " + this.apellidoMaterno + " " + this.apellidoPaterno 
                + " RUN: " + this.run + " Telefono: " + this.telefono 
                + " Edad: " + this.edad);
    }
    


    //metodo toString
    @Override
    public String toString() {
        return "Trabajador{" 
                + "primerNombre=" + primerNombre 
                + ", segundoNombre=" + segundoNombre
                + ", apellidoMaterno=" + apellidoMaterno
                + ", apellidoPaterno=" + apellidoPaterno
                + ", run=" + run
                + ", telefono=" + telefono
                + ", edad=" + edad
                + '}';
    }

}
