package ejercicioIndividual27;

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
