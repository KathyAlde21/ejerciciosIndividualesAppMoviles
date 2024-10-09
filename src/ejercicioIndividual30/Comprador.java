
package ejercicioIndividual30;

public class Comprador {
    
    private String nombreComprador;
    private String apellidoComprador;
    private String direccion;
    
    public Comprador (){};

    public Comprador(
            String nombreComprador,
            String apellidoComprador,
            String direccion
    ) {
        this.nombreComprador = nombreComprador;
        this.apellidoComprador = apellidoComprador;
        this.direccion = direccion;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getApellidoComprador() {
        return apellidoComprador;
    }

    public void setApellidoComprador(String apellidoComprador) {
        this.apellidoComprador = apellidoComprador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nombreComprador=" + nombreComprador
                + ", apellidoComprador=" + apellidoComprador
                + ", direccion=" + direccion
                + '}';
    }

    
    
}
