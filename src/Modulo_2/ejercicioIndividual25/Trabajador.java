package Modulo_2.ejercicioIndividual25;

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
        System.out.println(this.primerNombre + this.segundoNombre
                + this.apellidoMaterno + this.apellidoPaterno);
    }
    
    //metodo para descomponer el RUN y retornar la parte numérica
    public int descomponerRun() {
        // considerando el formato "12345678-9" se divide la cadena
        //en dos partes usando el guion como separador
        String[] partes = this.run.split("-");
        // la primera parte se convierte a entero y la retornamos
        return Integer.parseInt(partes[0]);
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
