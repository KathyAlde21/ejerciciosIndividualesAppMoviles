package ejercicioIndividual25;

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
